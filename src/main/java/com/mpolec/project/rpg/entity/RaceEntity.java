package com.mpolec.project.rpg.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;

@Data
@Entity
@Table(name = "race")
public class RaceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "translation")
    private String translation;

    @Column(name = "random_talents")
    private int randomTalents;

    @OneToMany(mappedBy = "id_race")
    private Collection<RaceCharacteristicEntity> characteristics;

    @OneToMany(mappedBy = "id_race")
    private Collection<RaceSkillEntity> skills;

    @OneToMany(mappedBy = "id_race")
    private Collection<RaceTalentEntity> talents;
}
