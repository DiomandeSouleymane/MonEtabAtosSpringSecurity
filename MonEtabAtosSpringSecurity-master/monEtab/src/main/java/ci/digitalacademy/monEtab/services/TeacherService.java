package ci.digitalacademy.monEtab.services;

import ci.digitalacademy.monEtab.services.dto.TeacherDTO;

import java.util.List;
import java.util.Optional;

public interface TeacherService {

    TeacherDTO save(TeacherDTO teacherDTO);
    TeacherDTO update(TeacherDTO teacherDTO);
    TeacherDTO update(TeacherDTO teacherDTO, Long id);
    Optional<TeacherDTO> findById(Long id);
    List<TeacherDTO> findAll();
    void deleteById(Long id);
    List<TeacherDTO> findByLastNameOrSpecialtyAndGender(String query, String gender);

    Optional<TeacherDTO> findOne(Long id);
}
