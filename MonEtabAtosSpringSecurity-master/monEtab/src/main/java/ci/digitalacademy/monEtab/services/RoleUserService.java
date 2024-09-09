package ci.digitalacademy.monEtab.services;

import ci.digitalacademy.monEtab.services.dto.RoleUserDTO;
import ci.digitalacademy.monEtab.services.dto.SchoolDTO;


import java.util.List;
import java.util.Optional;

public interface RoleUserService {

    Optional<RoleUserDTO> FindById(Long id);

    RoleUserDTO save(RoleUserDTO roleUser);

    RoleUserDTO update(RoleUserDTO roleUser);

    void delete(Long id);

    List<RoleUserDTO> findAll();

    List<RoleUserDTO> initRoles(List<RoleUserDTO> roles);
}