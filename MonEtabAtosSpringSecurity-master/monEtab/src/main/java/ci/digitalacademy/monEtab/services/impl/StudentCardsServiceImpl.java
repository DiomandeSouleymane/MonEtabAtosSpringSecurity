package ci.digitalacademy.monEtab.services.impl;

import ci.digitalacademy.monEtab.services.StudentCardsService;
import ci.digitalacademy.monEtab.services.dto.StudentCardsDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@RequiredArgsConstructor
@Component
@Slf4j
public class StudentCardsServiceImpl implements StudentCardsService {
    @Override
    public StudentCardsDTO save(StudentCardsDTO studentCardsDTO) {
        return null;
    }

    @Override
    public Optional<StudentCardsDTO> update(StudentCardsDTO studentCardsDTO) {
        return Optional.empty();
    }

    @Override
    public Optional<StudentCardsDTO> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<StudentCardsDTO> findOne(Long id) {
        return Optional.empty();
    }

    @Override
    public List<StudentCardsDTO> findAll() {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
