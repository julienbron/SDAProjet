package projet.sda;

import java.time.Period;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Romain Ducret <romain.ducret1@he-arc.ch>
 */
public class CourseOfStudy {

    private String name;
    private Map<String, Lesson> lessons;
    private Period period;

    public CourseOfStudy(final String name, final Period period) {
        this.name = name;
        this.period = period;
    }

    public Lesson findLesson(final String codeLesson) {
        Lesson returnLesson = null;
        for (int compteur = 0; compteur < lessons.size(); compteur++) {
            if (lessons.get(compteur).getCode().equals(codeLesson)) {
                returnLesson = lessons.get(compteur);
                break;
            }
        }

        return returnLesson;
    }

    public Set<String> findAllLesson() {
        Set<String> returnSet = null;

        for (int compteur = 0; compteur < lessons.size(); compteur++) {
            returnSet.add(lessons.get(compteur).getCode());

        }

        return returnSet;
    }

    public void addLesson(final String name, final String code, final int maxCode, final GradeStrategy strategy) {
        Lesson lesson = new Lesson(name, code, maxCode, strategy);
        this.lessons.put("", lesson);
    }

    public String getName() {
        return name;
    }

    public Period getPeriod() {
        return period;
    }

}
