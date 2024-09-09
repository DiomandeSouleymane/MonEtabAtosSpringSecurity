package ci.digitalacademy.monEtab.services.impl;


import ci.digitalacademy.monEtab.models.School;
import ci.digitalacademy.monEtab.repositories.SchoolRepository;
import ci.digitalacademy.monEtab.services.SchoolService;
import ci.digitalacademy.monEtab.services.dto.SchoolDTO;
import ci.digitalacademy.monEtab.services.mapper.SchoolMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
@Slf4j
public class SchoolServiceImpl implements SchoolService {

    private final SchoolRepository schoolRepository;
    private final SchoolMapper schoolMapper;

   /* @Override
    public SchoolDTO save(SchoolDTO schoolDTO) {
        School school = schoolMapper.DtoToEntity(schoolDTO);
        return schoolMapper.ToDto(schoolRepository.save(school));
    }

    public School saveSchool(School school) {
        if (school.getNameSchool() == null || school.getNameSchool().isEmpty()) {
            throw new IllegalArgumentException("School name cannot be null or empty");
        }
        return schoolRepository.save(school);
    }*/


    @Override
    public SchoolDTO save(SchoolDTO schoolDTO) {
        School school = schoolMapper.DtoToEntity(schoolDTO);
        return schoolMapper.ToDto(schoolRepository.save(school));
    }

    @Override
    public SchoolDTO update(SchoolDTO schoolDTO) {

        return findById(schoolDTO.getId_school()).map(existingSchool ->{
            School school = schoolMapper.DtoToEntity(schoolDTO);
            school.setNameSchool(existingSchool().getNameSchool());
            return save(existingSchool);
        }).orElseThrow(()-> new RuntimeException("Teacher not found"));
    }

    @Override
    public Optional<SchoolDTO> findById(Long id) {
        return schoolRepository.findById(Math.toIntExact(id)).map(teacher -> schoolMapper.ToDto(teacher));
    }




    @Override
    public List<SchoolDTO> findAll() {
        return  schoolRepository.findAll().stream().map(school -> schoolMapper.ToDto(school)).toList();
    }

    @Override
    public SchoolDTO findOne(Long id) {
        return schoolRepository.findById(Math.toIntExact(id)).map(school -> schoolMapper.ToDto(school)).orElse(null);
    }

    @Override
    public void delete(Long id) {
        schoolRepository.deleteById(Math.toIntExact(id));
    }


    @Override
    public SchoolDTO existingSchool() {
        log.debug("Request to check existing School");
        List<SchoolDTO> schoolDTOS = findAll();
        return  schoolDTOS.stream().findFirst().orElse(null);
    }

    @Override
    public SchoolDTO initSchool(SchoolDTO schoolDTO) {
        log.debug("Request to initSchool {}", schoolDTO);
        SchoolDTO schoolDTO1 = existingSchool();
        if (schoolDTO1 == null){
            return save(schoolDTO);
        }
        return schoolDTO1;
    }


}
