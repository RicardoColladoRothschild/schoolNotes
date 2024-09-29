package schoolNotes.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Subject {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String subjectName;
        private String subjectCode;



    private List<String> careers;
        @ManyToMany(mappedBy = "subjects")
        private List<Teacher> teachers;


        public Long getId(){
            return this.id;
        }

        public void setId(Long id){
            this.id = id;
        }

        public String getSubjectName(){
            return this.subjectName;
        }

        public void setSubjectName(String subjectName){
            this.subjectName = subjectName;
        }

        public String getSubjectCode(){
            return this.subjectCode;
        }

        public void setSubjectCode(String subjectCode){
            this.subjectCode = subjectCode;
        }

        public List<Teacher> getTeachers(){
            return this.teachers;
        }

        public void setTeachers(List<Teacher> t){
            this.teachers = t;
        }

            public List<String> getCareers() {
                return careers;
            }

            public void setCareers(List<String> careers) {
                this.careers = careers;
            }
        @Override
        public String toString(){
            return this.subjectName+" | "+this.subjectCode;
        }


}
