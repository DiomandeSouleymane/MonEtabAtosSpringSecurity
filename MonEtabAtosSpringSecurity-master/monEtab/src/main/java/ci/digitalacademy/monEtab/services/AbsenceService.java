package ci.digitalacademy.monEtab.services;


import ci.digitalacademy.monEtab.services.dto.AbsenceDTO;
import ci.digitalacademy.monEtab.services.dto.AppSettingDTO;

import java.util.List;
import java.util.Optional;

public interface AbsenceService {


    AppSettingDTO save(AppSettingDTO appSettingDTO);

    Optional<AppSettingDTO> update(AppSettingDTO appSettingDTO);

    AbsenceDTO save(AbsenceDTO absenceDTO);

    Optional<AbsenceDTO> update(AbsenceDTO absenceDTO);

    Optional<AbsenceDTO> findById(Long id);

    Optional<AbsenceDTO> findOne(Long id);
    List<AbsenceDTO> findAll();
    void delete(Long id);

    void initApp(AppSettingDTO appSettingDTO);

    Boolean existingParameter();
}
