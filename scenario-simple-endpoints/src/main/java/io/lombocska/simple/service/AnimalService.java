package io.lombocska.simple.service;

import io.lombocska.simple.domain.Animal;
import io.lombocska.simple.repository.AnimalRepository;
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
