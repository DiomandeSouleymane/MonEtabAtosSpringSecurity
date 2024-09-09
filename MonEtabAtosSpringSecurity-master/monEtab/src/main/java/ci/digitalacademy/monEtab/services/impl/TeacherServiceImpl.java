package ci.digitalacademy.monEtab.services.impl;
import ci.digitalacademy.monEtab.models.Teacher;
import ci.digitalacademy.monEtab.repositories.TeacherRepository;
import ci.digitalacademy.monEtab.services.TeacherService;
import ci.digitalacademy.monEtab.services.dto.TeacherDTO;
import ci.digitalacademy.monEtab.services.mapper.TeacherMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class TeacherServiceImpl implements TeacherService {

    private final TeacherRepository teacherRepository;
    private final TeacherMapper teacherMapper;
    @Override
    public TeacherDTO save(TeacherDTO teacherDTO) {
        Teacher teacher = teacherMapper.DtoToEntity(teacherDTO);
        return teacherMapper.ToDto(teacherRepository.save(teacher));
    }

    @Override
    public TeacherDTO update(TeacherDTO teacherDTO) {

        return findById(teacherDTO.getId()).map(existingTeacher ->{
            Teacher teacher = teacherMapper.DtoToEntity(teacherDTO);
            teacher.setLastName(existingTeacher.getLastName());
            return save(existingTeacher);
        }).orElseThrow(()-> new RuntimeException("Teacher not found"));
    }

    @Override
    public Optional<TeacherDTO> findById(Long id) {
        return teacherRepository.findById((long) Math.toIntExact(id)).map(teacher -> teacherMapper.ToDto(teacher));
    }

    @Override
    public List<TeacherDTO> findAll() {
        return teacherRepository.findAll().stream().map(teacher -> {
            return teacherMapper.ToDto(teacher);
        }).toList();
    }

    @Override
    public void deleteById(Long id) {
        teacherRepository.deleteById((long) Math.toIntExact(id));
    }

    @Override
    public List<TeacherDTO> findByLastNameOrSpecialtyAndGender(String query, String gender) {
        List<Teacher> teachers = teacherRepository.findByLastNameOrSpecialtyAndGender(query , query , Gender.valueOf(gender));
        return teachers.stream().map(teacher -> teacherMapper.ToDto(teacher)).toList();
    }

    @Override
    public Optional<TeacherDTO> findOne(Long id) {
        return Optional.empty();
    }

}