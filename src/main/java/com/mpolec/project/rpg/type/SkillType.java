package com.mpolec.project.rpg.type;

public enum SkillType {

    BASIC("skills.type.basic.name"),
    ADVANCED("skills.type.advanced.name"),
    GROUPED("skills.type.grouped.name");

    private final String name;

    SkillType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
