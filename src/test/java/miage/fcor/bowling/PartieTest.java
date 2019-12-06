package miage.fcor.bowling;

import org.junit.Test;

import static org.junit.Assert.*;

public class PartieTest {

    @Test
    public void testCalculeScoreSansStrikeSansSpare(){
        //given : une partie avec 10 jeux de identiques faisant tomber 5 quilles sur les 2 lancers
        Jeu leJeu = new Jeu(5,0);
        Partie laPartie = new Partie(leJeu);

        //when : on calcule le score
        int score = laPartie.calculeScore();

        //then : on obtient un score de 50
        assertEquals(50, score);
    }

    @Test
    public void testCalculeScoreAvecQueDesSpares(){
        //given : une partie avec 10 jeux de identiques correspondant à des spares 5-5
        Jeu leJeu = new Jeu(5,5);
        Partie laPartie = new Partie(leJeu);

        //when
        int score = laPartie.calculeScore();

        //then
        assertEquals(150, score);
    }

    @Test
    public void testCalculeScoreAvecQueDesStrikes(){
        //given : une partie avec 10 jeux de identiques correspondant à des strikes
        Jeu leJeu = new Jeu(10,0);
        Partie laPartie = new Partie(leJeu);

        //when
        int score = laPartie.calculeScore();

        //then
        assertEquals(300, score);
    }


}