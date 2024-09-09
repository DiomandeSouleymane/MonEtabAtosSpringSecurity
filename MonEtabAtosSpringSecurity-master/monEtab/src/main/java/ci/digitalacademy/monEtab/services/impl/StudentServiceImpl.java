package ci.digitalacademy.monEtab.services.impl;

import ci.digitalacademy.monEtab.models.Student;
import ci.digitalacademy.monEtab.models.enumeration.Gender;
import ci.digitalacademy.monEtab.repositories.StudentRepository;
import ci.digitalacademy.monEtab.services.StudentService;
import ci.digitalacademy.monEtab.services.dto.StudentDTO;
import ci.digitalacademy.monEtab.services.mapper.StudentMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;
    private final StudentMapper studentMapper;

    @Override
    public StudentDTO save(StudentDTO studentDTO) {
        Student student = studentMapper.DtoToEntity(studentDTO);
        return studentMapper.ToDto(studentRepository.save(student));
    }

    @Override
    public StudentDTO update(StudentDTO studentDTO) {
        Optional<Student> existingStudent = studentRepository.findById(studentDTO.getId());
        if (existingStudent.isPresent()) {
            Student student = existingStudent.get();
            // Mettre à jour les champs nécessaires
            student.setFirstName(studentDTO.getFirstName());
            student.setLastName(studentDTO.getLastName());
            student.setMatricule(studentDTO.getMatricule());
            student.setPhoneNumberFather(studentDTO.getPhoneNumberFather());
            student.setPhoneNumber(studentDTO.getPhoneNumber());
            student.setBirthday(studentDTO.getBirthday());
            student.setGender(studentDTO.getGender());
            student.setVille(studentDTO.getVille());
            student.setClasse(studentDTO.getClasse());
            student.setUrlPicture(studentDTO.getUrlPicture());

            // Sauvegarde des modifications
            studentRepository.save(student);
            return studentMapper.ToDto(student);
        } else {
            throw new RuntimeException("Student not found");
        }
    }


    @Override
    public Optional<StudentDTO> findById(Long id) {
        return studentRepository.findById(id).map(student -> studentMapper.ToDto(student));
    }


    @Override
    public List<StudentDTO> findAll() {
        return studentRepository.findAll().stream().map(student -> {
            return studentMapper.ToDto(student);
        }).toList();
    }

    @Override
    public void deleteById(Long id) {
        studentRepository.deleteById(id);
    }

    @Override
    public List<Student> findByLastNameOrGenderOrMatricule(String query, String gender) {
        if (gender != null && !gender.isEmpty()) {
            return studentRepository.findByLastNameIgnoreCaseOrMatriculeIgnoreCaseAndGender(query, query, Gender.valueOf(gender));
        } else {
            return studentRepository.findByLastNameIgnoreCaseOrMatriculeIgnoreCase(query, query);
        }
    }




    @Override
    public Optional<StudentDTO> findOne(Long id) {
        return Optional.empty();
    }
}