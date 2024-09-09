package ci.digitalacademy.monEtab.repositories;

import ci.digitalacademy.monEtab.models.School;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepository extends JpaRepository<School, Integer> {
}
