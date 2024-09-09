package ci.digitalacademy.monEtab.repositories;

import ci.digitalacademy.monEtab.models.StudentCards;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentCardsRepository extends JpaRepository<StudentCards, Integer> {
}
