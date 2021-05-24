package com.mpolec.project.rpg.entity;

import javax.persistence.*;

@Entity
@Table(name = "race_skill")
public class RaceTalentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "id_first_talent", referencedColumnName = "id")
    private TalentEntity firstTalent;

    @ManyToOne
    @JoinColumn(name = "id_second_talent", referencedColumnName = "id")
    private TalentEntity secondTalent;

    @ManyToOne
    @JoinColumn(name = "id_race", referencedColumnName = "id")
    private RaceEntity race;
}
