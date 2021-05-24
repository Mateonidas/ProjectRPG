package com.mpolec.project.rpg.type;

public enum CharacteristicType {

    WEAPON_SKILL("characteristics.weapon_skill.name", "characteristics.weapon_skill.shortcut", true),
    BALLISTIC_SKILL("characteristics.ballistic_skill.name", "characteristics.ballistic_skill.shortcut", true),
    STRENGTH("characteristics.strength.name", "characteristics.strength.shortcut", true),
    TOUGHNESS("characteristics.toughness.name", "characteristics.toughness.shortcut", true),
    INITIATIVE("characteristics.initiative.name", "characteristics.initiative.shortcut", true),
    AGILITY("characteristics.agility.name", "characteristics.agility.shortcut", true),
    DEXTERITY("characteristics.dexterity.name", "characteristics.dexterity.shortcut", true),
    INTELLIGENCE("characteristics.intelligence.name", "characteristics.intelligence.shortcut", true),
    WILLPOWER("characteristics.willpower.name", "characteristics.willpower.shortcut", true),
    FELLOWSHIP("characteristics.fellowship.name", "characteristics.fellowship.shortcut", true),
    WOUNDS("characteristics.wounds.name", "characteristics.wounds.shortcut", false),
    FATE("characteristics.fate.name", "characteristics.fate.shortcut", false),
    RESILIENCE("characteristics.resilience.name", "characteristics.resilience.shortcut", false),
    EXTRA_POINTS("characteristics.extra_points.name", "characteristics.extra_points.shortcut", false),
    MOVEMENT("characteristics.movement.name", "characteristics.movement.shortcut", false);

    private final String name;
    private final String shortcut;
    private final boolean isForCareer;

    CharacteristicType(String name, String shortcut, boolean isForCareer) {
        this.name = name;
        this.shortcut = shortcut;
        this.isForCareer = isForCareer;
    }

    public String getName() {
        return name;
    }

    public String getShortcut() {
        return shortcut;
    }

    public boolean isForCareer() {
        return isForCareer;
    }
}
