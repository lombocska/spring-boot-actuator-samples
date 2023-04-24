package io.lombocska.metrics.domain;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Animal {

    @Id
    private Long id;
    private String color;

}
