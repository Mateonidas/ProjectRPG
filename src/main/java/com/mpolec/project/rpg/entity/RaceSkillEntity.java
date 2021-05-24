package com.mpolec.project.rpg.entity;

import javax.persistence.*;

@Entity
@Table(name = "race_skill")
public class RaceSkillEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "id_first_skill", referencedColumnName = "id")
    private SkillEntity firstSkill;

    @ManyToOne
    @JoinColumn(name = "id_second_skill", referencedColumnName = "id")
    private SkillEntity secondSkill;

    @ManyToOne
    @JoinColumn(name = "id_race", referencedColumnName = "id")
    private RaceEntity race;
}
