package projet.sda;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

/**
 *
 * @author Julien Bron <julien.bron@he-arc.ch>
 */
public class Gradebook {
    
    private Long id;
    private CourseOfStudy courseOfStudy;
    private Student student;
    private Map<String, Queue<Double>> notes;
    private Map<String, Stack<Double>> tempNotes;
    
    public Gradebook(final CourseOfStudy courseOfStudy) {
        this.courseOfStudy = courseOfStudy;
    }
    
    public Gradebook(final CourseOfStudy courseOfStudy, final Student student) {
        this(courseOfStudy);
        this.student = student;
    }
    
    public void addNote(final String codeLesson, final Double note) {
        Stack<Double> listNote = null;
        listNote = tempNotes.get(codeLesson);
        listNote.add(note);
        tempNotes.put(codeLesson, listNote);
        
    }
    
    public void removeNote(final String codeLesson) {
        
        tempNotes.remove(codeLesson);
        
    }
    
    public void saveNotes(final String codeLesson) {
        Queue<Double> listNote = null;
        for (int compteur = 0; compteur < tempNotes.get(codeLesson).size(); compteur++) {
            listNote.add(tempNotes.get(codeLesson).get(compteur));
        }
        notes.remove(codeLesson);
        notes.put(codeLesson, listNote);
    }
    
    private void add(final String codeLesson) {
        
    }
    
    public void getResult(final String lesson) {
        
    }
    
    public boolean isPromu() {
        Set listLesson;
        boolean isPromu = false;
        listLesson = this.courseOfStudy.findAllLesson();
        
        Iterator it = listLesson.iterator();
        
        while (it.hasNext()) {
            
            Lesson lesson = this.courseOfStudy.findLesson(it.next().toString());
            List listeNote = null;
            
            for (int compteur = 0; compteur < notes.size(); compteur++) {
                if (notes.containsKey(lesson.getCode())) {
                    listeNote.add(notes.get(compteur));
                }
                
            }
            
            if (lesson.getResult(listeNote)>4){
                isPromu = true;
            }
            
            if (!isPromu){
                break;
            }
        }
        
        return isPromu;
        
    }
    
    public List<Double> findTempNotes(final String Lesson) {
       
        
        
        
        return null;
    }
    
    public List<Double> findNotes(final String Lesson) {
        return null;
        
    }
    
    private Set<String> findAllLessons() {
        return null;
        
    }
    
    private void checkCourseOfStudy() {
        
    }
    
    private void checkStudent() {
        
    }
    
    private void checkLesson() {
        
    }
    
    private void checkLessonTempNotes(final String lesson) {
        
    }
    
    private void checkLessonNotes() {
        
    }
    
    private void checkNumbernote(final String lesson, final Double notes) {
        
    }
    
    private void checkRemoveNote() {
        
    }
    
    private void checkHaveNotes() {
        
    }
    
    private void checkAllLessonHaveNotes() {
        
    }
    
    public Long getId() {
        return id;
    }
    
    public CourseOfStudy getCourseOfStudy() {
        return courseOfStudy;
    }
    
    public Student getStudent() {
        return student;
    }
    
    public void setStudent(final Student student) {
        this.student = student;
    }
    
}
