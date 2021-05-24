package com.mpolec.project.rpg.type;

public enum StatusType {

    BRONZE("status.bronze"),
    SILVER("status.silver"),
    GOLD("status.gold");

    private final String name;

    StatusType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
