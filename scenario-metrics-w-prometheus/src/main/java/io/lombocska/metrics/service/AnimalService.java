package io.lombocska.metrics.service;

import io.lombocska.metrics.domain.Animal;
import io.lombocska.metrics.repository.AnimalRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class AnimalService {

    private final AnimalRepository repository;

    public List<Animal> getAnimals() {
        return repository.findAll();
    }
}
