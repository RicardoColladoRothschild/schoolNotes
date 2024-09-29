package schoolNotes.service;

import org.springframework.stereotype.Service;
import schoolNotes.model.Student;
import schoolNotes.repository.StudentsRepository;

import java.util.List;

@Service
public class StudentService {

    private final StudentsRepository studentRepository;

    public StudentService(StudentsRepository studentRepo){
        this.studentRepository = studentRepo;
    }


    public List<Student> findStudentByName(String name){
        try {
            return studentRepository.findByName(name);
        } catch (Exception e) {
            System.out.println("Error ocurred while trying to get student by name:"+ e.toString());
            throw new RuntimeException(e);
        }
    }

    public List<Student> findStudentByCareer(String career){

        try{
            return this.studentRepository.findByCareer(career);
        } catch (Exception e) {
            System.out.println("Exception while getting student by career: "+ e.toString());
            throw new RuntimeException(e);
        }
    }
}
