package schoolNotes.repository;

import org.springframework.stereotype.Repository;

@Repository
public interface StudentsRepository {
    
    List<Students> findByName(String name);
    List<Students> findByAgeGreaterThan(int age);
    List<Students> findBySubject(String subjectName);
}
