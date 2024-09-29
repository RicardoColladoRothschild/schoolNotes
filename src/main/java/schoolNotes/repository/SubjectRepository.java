package schoolNotes.repository;

import org.springframework.stereotype.Repository;
import schoolNotes.model.Subject;

import java.util.List;

@Repository
public interface SubjectRepository {

    List<Subject> findAllSubject();
    List<Subject> findSubjectByCareer();
}
