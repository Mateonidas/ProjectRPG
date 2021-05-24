package com.mpolec.project.rpg.entity;

import com.mpolec.project.rpg.type.CharacteristicType;

import javax.persistence.*;

@Entity
@Table(name = "race_characteristic")
public class RaceCharacteristicEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "characteristic")
    private CharacteristicType characteristic;

    @Column(name = "modifier")
    private String modifier;

    @ManyToOne
    @JoinColumn(name = "id_race", referencedColumnName = "id")
    private RaceEntity race;

}
