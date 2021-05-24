package com.mpolec.project.rpg.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "gender")
public class GenderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "translation")
    private String translation;
}
