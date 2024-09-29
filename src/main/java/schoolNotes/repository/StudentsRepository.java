package schoolNotes.repository;

import org.springframework.stereotype.Repository;
import schoolNotes.model.Student;

import java.util.List;

@Repository
public interface StudentsRepository {
    
    List<Student> findByName(String name);
    List<Student> findByAgeGreaterThan(int age);
    List<Student> findBySubject(String subjectName);
}
