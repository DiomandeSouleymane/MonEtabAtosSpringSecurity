package ci.digitalacademy.monEtab.services.impl;


import ci.digitalacademy.monEtab.repositories.RoleUserRepository;
import ci.digitalacademy.monEtab.services.RoleUserService;
import ci.digitalacademy.monEtab.services.dto.RoleUserDTO;
import ci.digitalacademy.monEtab.services.mapper.RoleUserMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Component
@RequiredArgsConstructor
@Slf4j
public class RoleUserServiceImpl implements RoleUserService {



    private final RoleUserRepository roleUserRepository;
    private final RoleUserMapper roleUserMapper;

    @Override
    public Optional<RoleUserDTO> FindById(Long id) {
        return roleUserRepository.findById(Math.toIntExact(id)).map(roleUser -> roleUserMapper.ToDto(roleUser));
    }

    @Override
    public RoleUserDTO save(RoleUserDTO roleUser) {
        return roleUserMapper.ToDto(roleUserRepository.save(roleUserMapper.DtoToEntity(roleUser)));
    }

    @Override
    public RoleUserDTO update(RoleUserDTO roleUser) {
        return roleUserMapper.ToDto(roleUserRepository.save(roleUserMapper.DtoToEntity(roleUser)));
    }

    @Override
    public void delete(Long id) {
        roleUserRepository.deleteById(Math.toIntExact(id));
    }

    @Override
    public List<RoleUserDTO> findAll() {
        return  roleUserRepository.findAll().stream().map(roleUser -> roleUserMapper.ToDto(roleUser)).toList();
    }

    @Override
    public List<RoleUserDTO> initRoles(List<RoleUserDTO> roles) {
        log.debug("Request to init roles {}", roles);
        List<RoleUserDTO> listRoles = findAll();

        if (listRoles.isEmpty()) {
            roles.forEach(roleUserDTO -> save(roleUserDTO));
        }
        return findAll();
    }


}
