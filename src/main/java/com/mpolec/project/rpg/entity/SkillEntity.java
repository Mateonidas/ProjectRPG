package com.mpolec.project.rpg.entity;

import com.mpolec.project.rpg.type.CharacteristicType;
import com.mpolec.project.rpg.type.SkillType;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "skill")
public class SkillEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "translation")
    private String translation;

    @Column(name = "characteristic")
    private CharacteristicType characteristic;

    @ElementCollection(targetClass = SkillType.class)
    @Column(name = "skill_type")
    private Collection<CharacteristicType> skillType;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "id_career")
    private CareerEntity career;

}
