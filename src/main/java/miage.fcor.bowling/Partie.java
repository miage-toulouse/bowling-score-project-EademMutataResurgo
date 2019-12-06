package miage.fcor.bowling;


import java.util.ArrayList;
import java.util.List;

public class Partie{

    private List<Jeu> jeux;


    public Partie(Jeu leJeu) {
        this.jeux=new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            this.jeux.add(leJeu);
        }
        if(this.jeux.get(9).isSpare() && !this.jeux.get(9).isStrike()){
            this.jeux.add(leJeu);
        }
        if(this.jeux.get(9).isStrike() && this.jeux.get(9).isStrike()){
            this.jeux.add(leJeu);
            this.jeux.add(leJeu);
        }
    }

    public int calculeScore() {
        int score=0;

        for (int i = 0; i < 10; i++) {
            Jeu jeuCourant = this.jeux.get(i);
            score += jeuCourant.nombreQuilleTombees();
            if (jeuCourant.isSpare() && !jeuCourant.isStrike()) {
                score +=  this.jeux.get(i+1).resultatLancer1();
            }
            if(jeuCourant.isStrike() && !jeuCourant.isSpare()){
                if(jeux.get(i+1).isStrike()){
                    score+=jeux.get(i+1).nombreQuilleTombees()+jeux.get(i+2).nombreQuilleTombees();
                }else {
                    score += jeux.get(i+1).nombreQuilleTombees();
                }
            }
        }
        return score;
    }
}