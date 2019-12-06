package miage.fcor.bowling;

public class Jeu{

    private Integer lancer1;
    private Integer lancer2;

    public Jeu(Integer lancer1, Integer lancer2) {
        this.lancer1 = lancer1;
        this.lancer2 = lancer2;
    }

    public int nombreQuilleTombees() {
        return (this.lancer1+this.lancer2);
    }

    public Integer resultatLancer1() {
        return lancer1;
    }


    public boolean isSpare() {
        return(lancer1+lancer2==10 && lancer1!=10);
    }

    public boolean isStrike() {
        return(lancer1==10);
    }
}