package com.mpolec.project.rpg.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;

@Data
@Entity
@Table(name = "class")
public class ClassEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "translation")
    private String translation;

    @OneToMany(mappedBy = "aClass")
    private Collection<CareerPathEntity> careerPaths;
}
