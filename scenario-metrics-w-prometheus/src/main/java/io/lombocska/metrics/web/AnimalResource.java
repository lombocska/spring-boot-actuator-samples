package io.lombocska.metrics.web;

import io.lombocska.metrics.metrics.MetricService;
import io.lombocska.metrics.service.AnimalService;
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
    private final MetricService metricService;

    @GetMapping("/animals")
    public ResponseEntity getAnimals() {
        this.metricService.countAnimalGetQueries();
        return ResponseEntity.ok(service.getAnimals());
    }
}
