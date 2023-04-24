package io.lombocska.simple.web;

import io.lombocska.simple.service.AnimalService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class AnimalResource {

    private final AnimalService service;

    @GetMapping("/animals")
    public ResponseEntity getAnimals() {
        return ResponseEntity.ok(service.getAnimals());
    }
}
