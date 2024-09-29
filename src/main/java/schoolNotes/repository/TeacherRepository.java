package schoolNotes.repository;

import org.springframework.stereotype.Repository;
import schoolNotes.model.Teacher;

import java.util.List;

@Repository
public interface TeacherRepository {

    List<Teacher> findAllTeacher();
    List<Teacher> findTeacherBySubject(String subject);
}
