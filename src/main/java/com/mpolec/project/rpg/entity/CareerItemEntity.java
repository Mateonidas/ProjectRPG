package com.mpolec.project.rpg.entity;

import javax.persistence.*;

@Entity
@Table(name = "career_item")
public class CareerItemEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "id_item", referencedColumnName = "id")
    private ItemEntity item;

    @ManyToOne
    @JoinColumn(name = "id_career", referencedColumnName = "id")
    private CareerEntity career;

    @Column(name = "quantity")
    private double quantity;
}
