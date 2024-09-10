package ci.digitalacademy.monEtab.services;

import ci.digitalacademy.monEtab.models.Student;
import ci.digitalacademy.monEtab.services.dto.StudentDTO;

import java.util.List;
import java.util.Optional;

public interface StudentService {

    StudentDTO save(StudentDTO studentDTO);

    StudentDTO update(StudentDTO studentDTO);

    Optional<StudentDTO> update(StudentDTO studentDTO, Long id);

    Optional<StudentDTO> findById(Long id);

    List<StudentDTO> findAll();

    void deleteById(Long id);

    List<Student> findByLastNameOrGenderOrMatricule(String query , String gender);

    Optional<StudentDTO> findOne(Long id);
}
