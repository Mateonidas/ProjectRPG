package com.mpolec.project.rpg.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;

@Data
@Entity
@Table(name = "career_path")
public class CareerPathEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "translation")
    private String translation;

    @OneToMany(mappedBy = "careerPath")
    private Collection<CareerEntity> careers;

    @ManyToOne
    @JoinColumn(name = "id_class", referencedColumnName = "id")
    private ClassEntity aClass;

    @ManyToOne
    @JoinColumn(name = "earn_skill", referencedColumnName = "id")
    private SkillEntity earnSkill;
}
