package com.dake.ocg.model;

public class Action {
    private int id;
    private String name;
    private ActionType type;
    private int value;

    public Action(int id, String name, ActionType type, int value) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ActionType getType() {
        return type;
    }

    public int getValue() {
        return value;
    }


}
