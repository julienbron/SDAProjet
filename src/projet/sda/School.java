package projet.sda;


import java.time.Period;
import java.util.List;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Julien Bron <julien.bron@he-arc.ch>
 */
public enum School {

    // ???
    HEARC;

    private Set<Gradebook> gradebook;
    private List<CourseOfStudy> courseOfStudies;

    public Set<Gradebook> getGradebook() {
        return gradebook;
    }

    public List<CourseOfStudy> getcourseOfStudies() {
        return courseOfStudies;
    }

    public List<CourseOfStudy> getCourseOfStudiesByPeriod(Period period) {
        List<CourseOfStudy> returnList = null;
        for (int compteur = 0; compteur < courseOfStudies.size(); compteur++) {
            if (courseOfStudies.get(compteur).getPeriod().equals(period)) {
                returnList.add(courseOfStudies.get(compteur));

            }

        }
        return returnList;
    }

}
