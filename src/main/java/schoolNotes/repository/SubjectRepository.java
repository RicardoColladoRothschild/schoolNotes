package schoolNotes.repository;

import org.springframework.stereotype.Repository;

@Repository
public interface SubjectRepository {

    List<Subject> findAllSubject();
    List<Subject> findSubjectByCareer();
}
