package projet.sda;

import java.util.List;

/**
 *
 * @author Romain Ducret <romain.ducret1@he-arc.ch>
 */
public class HighestNoteGradeStrategy implements GradeStrategy {

    public HighestNoteGradeStrategy() {
    }

    @Override
    public double calculate(final List notes) {
        double returnedValue = -1;
        for (int compteur = 0; compteur < notes.size(); compteur++) {
            if ((double) notes.get(compteur) > returnedValue) {
                returnedValue = (double) notes.get(compteur);
            }

        }
        return returnedValue;
    }
}
