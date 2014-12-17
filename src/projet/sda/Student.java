package projet.sda;


/**
 *
 * @author Julien Bron <julien.bron@he-arc.ch>
 */
public class Student {

    private Long id;
    private String firstname;
    private String lastname;

    public Student() {
    }

    public Student(Long id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public Long getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(final String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(final String lastname) {
        this.lastname = lastname;
    }

}
