package schoolNotes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import schoolNotes.model.Student;

import java.util.List;

@Repository
public interface StudentsRepository extends JpaRepository<Student, Long> {
    
    public List<Student> findByName(String name);
    public List<Student> findByCareer(String career);
    public List<Student> findBySubject(String subjectName);
}
