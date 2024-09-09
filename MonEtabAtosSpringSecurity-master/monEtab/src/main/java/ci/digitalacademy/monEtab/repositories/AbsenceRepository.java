package ci.digitalacademy.monEtab.repositories;

import ci.digitalacademy.monEtab.models.Absence;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AbsenceRepository extends JpaRepository<Absence, Integer> {
}
