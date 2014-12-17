package projet.sda;

import java.util.List;

/**
 *
 * @author Romain Ducret <romain.ducret1@he-arc.ch>
 */
public interface GradeStrategy {

    abstract public double calculate(final List notes);
}
