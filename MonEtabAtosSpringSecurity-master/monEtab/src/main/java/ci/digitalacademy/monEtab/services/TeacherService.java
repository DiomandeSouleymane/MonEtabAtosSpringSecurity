package ci.digitalacademy.monEtab.services;

import ci.digitalacademy.monEtab.models.Teacher;
import ci.digitalacademy.monEtab.models.enumeration.Gender;
import ci.digitalacademy.monEtab.services.dto.TeacherDTO;

import java.util.List;
import java.util.Optional;

public interface TeacherService {

    TeacherDTO save(TeacherDTO teacherDTO);
    TeacherDTO update(TeacherDTO teacherDTO);
    Optional<TeacherDTO> findById(Long id);
    List<TeacherDTO> findAll();
    void deleteById(Long id);
    List<TeacherDTO> findByLastNameOrSpecialtyAndGender(String query, String gender);

    Optional<TeacherDTO> findOne(Long id);
}
