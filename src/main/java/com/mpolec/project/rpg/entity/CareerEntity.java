package com.mpolec.project.rpg.entity;

import com.mpolec.project.rpg.type.CharacteristicType;
import com.mpolec.project.rpg.type.StatusType;
import com.mpolec.project.rpg.type.TierType;
import lombok.Data;

import javax.persistence.*;
import java.util.Collection;

@Data
@Entity
@Table(name = "career")
public class CareerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "translation")
    private String translation;

    @Enumerated(EnumType.STRING)
    @Column(name = "tier")
    private TierType tier;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private StatusType status;

    @Column(name = "statusLevel")
    private int statusLevel;

    @ElementCollection(targetClass = CharacteristicType.class)
    @Column(name = "characteristics")
    private Collection<CharacteristicType> characteristics;

    @ManyToOne
    @JoinColumn(name = "id_career_path", referencedColumnName = "id")
    private CareerPathEntity careerPath;

    @OneToMany(mappedBy = "career")
    private Collection<SkillEntity> skills;

    @OneToMany(mappedBy = "career")
    private Collection<TalentEntity> talents;

    @OneToMany(mappedBy = "id_career")
    private Collection<CareerItemEntity> careerItems;
}
