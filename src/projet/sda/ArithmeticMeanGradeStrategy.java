package projet.sda;

import java.util.List;

/**
 *
 * @author Romain Ducret <romain.ducret1@he-arc.ch>
 */
public class ArithmeticMeanGradeStrategy implements GradeStrategy {

    public ArithmeticMeanGradeStrategy() {
    }

    @Override
    public double calculate(final List notes) {
        int nbEle = 0;
        double somme = 0;
        for (int compteur = 0; compteur < notes.size(); compteur++) {
            nbEle = nbEle + 1;
            somme = somme + (double) notes.get(compteur);

        }

        return (somme / nbEle);
    }

}
