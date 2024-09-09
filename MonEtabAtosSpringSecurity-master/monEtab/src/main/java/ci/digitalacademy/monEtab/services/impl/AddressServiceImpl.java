package ci.digitalacademy.monEtab.services.impl;

import ci.digitalacademy.monEtab.services.AddresseService;
import ci.digitalacademy.monEtab.services.dto.AddressDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
@Component
public class AddressServiceImpl implements AddresseService {
    @Override
    public AddressDTO save(AddressDTO addressDTO) {
        return null;
    }

    @Override
    public Optional<AddressDTO> update(AddressDTO addressDTO) {
        return Optional.empty();
    }

    @Override
    public Optional<AddressDTO> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<AddressDTO> findOne(Long id) {
        return Optional.empty();
    }

    @Override
    public List<AddressDTO> findAll() {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
