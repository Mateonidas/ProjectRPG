package com.mpolec.project.rpg.entity;

import javax.persistence.*;

@Entity
@Table(name = "Talent")
public class TalentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "translation")
    private String translation;

    @Column(name = "max")
    private String max;

    @Column(name = "tests")
    private String tests;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "id_career")
    private CareerEntity career;
}
