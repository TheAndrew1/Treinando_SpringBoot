package com.example.registro.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@MappedSuperclass
public abstract class AbstractClass {
    @Getter
    @Column(name = "id", unique = true, nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Getter @Setter
    @Column(name = "data_criação", nullable = false)
    private LocalDateTime creationDate;
    @Getter @Setter
    @Column(name = "ativo", nullable = false)
    private boolean active;

    @PrePersist
    private void prePersist(){
        this.creationDate = LocalDateTime.now();
        this.active = true;
    }
}
