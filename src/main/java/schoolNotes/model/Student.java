package schoolNotes.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



    private String name;
    private String lastName;
    private String career;
    private String email;

    @ManyToMany
    @JoinTable(
            name = "student-subject",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "subject_id")
    )
    private List<Subject> subjects;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString(){
        String subjectList = new String();

        for(Subject subject: this.getSubjects()){
            subjectList += subject.toString() + "\n";
        }
        return "Student Name: "+this.getName() + " "+this.getLastName()+"\n"
                +"Career: "+this.getCareer()+"\n"
                +"Subjects: "+"\n"
                +subjectList;

    }
}
