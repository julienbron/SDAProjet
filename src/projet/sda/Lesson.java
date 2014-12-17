package projet.sda;

import java.util.List;

/**
 *
 * @author Romain Ducret <romain.ducret1@he-arc.ch>
 */
public class Lesson {
    
    private String name;
    private String code;
    private int maxnote;
    private GradeStrategy strategy;
    
    public Lesson(final String name, final String code, final int maxnote, final GradeStrategy strategy) {
        this.name = name;
        this.code = code;
        this.maxnote = maxnote;
        this.strategy = strategy;
    }
    
    public double getResult(final List notes) {
        return strategy.calculate(notes);
    }
    
    public String getName() {
        return name;
    }
    
    public String getCode() {
        return code;
    }
    
    public int getMaxnote() {
        return maxnote;
    }
    
}
