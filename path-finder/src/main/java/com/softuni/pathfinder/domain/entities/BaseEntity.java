package com.softuni.pathfinder.domain.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import org.hibernate.annotations.GenericGenerator;

@MappedSuperclass
public abstract class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @GeneratedValue(generator = "uuid-string")
//    @GenericGenerator(name = "uuid-string",
//    strategy = "org.hibernate.id.UUIDGenerator")
    private Long id;

    public BaseEntity() {
    }

    public Long getId() {
        return this.id;
    }

    public BaseEntity setId(Long id) {
        this.id = id;
        return this;
    }
}
