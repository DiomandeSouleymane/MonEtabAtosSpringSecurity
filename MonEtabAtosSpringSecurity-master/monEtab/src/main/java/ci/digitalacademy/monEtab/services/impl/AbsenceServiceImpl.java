package ci.digitalacademy.monEtab.services.impl;

import ci.digitalacademy.monEtab.repositories.AbsenceRepository;
import ci.digitalacademy.monEtab.services.AbsenceService;
import ci.digitalacademy.monEtab.services.dto.AbsenceDTO;
import ci.digitalacademy.monEtab.services.dto.AppSettingDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@RequiredArgsConstructor
@Slf4j
@Component
public class AbsenceServiceImpl implements AbsenceService {


    @Override
    public AppSettingDTO save(AppSettingDTO appSettingDTO) {
        return null;
    }

    @Override
    public Optional<AppSettingDTO> update(AppSettingDTO appSettingDTO) {
        return Optional.empty();
    }

    @Override
    public AbsenceDTO save(AbsenceDTO absenceDTO) {
        return null;
    }

    @Override
    public Optional<AbsenceDTO> update(AbsenceDTO absenceDTO) {
        return Optional.empty();
    }

    @Override
    public Optional<AbsenceDTO> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<AbsenceDTO> findOne(Long id) {
        return Optional.empty();
    }

    @Override
    public List<AbsenceDTO> findAll() {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void initApp(AppSettingDTO appSettingDTO) {

    }

    @Override
    public Boolean existingParameter() {
        return null;
    }
}


