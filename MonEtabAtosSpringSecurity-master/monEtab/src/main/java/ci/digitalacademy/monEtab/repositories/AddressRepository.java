package ci.digitalacademy.monEtab.repositories;

import ci.digitalacademy.monEtab.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Integer> {
}
