package ci.digitalacademy.monEtab.repositories;

import ci.digitalacademy.monEtab.models.AppSetting;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AppSettingRepository extends JpaRepository<AppSetting, Long> {

}
