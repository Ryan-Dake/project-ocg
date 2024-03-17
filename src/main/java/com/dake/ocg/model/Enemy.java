package com.dake.ocg.model;

import java.util.ArrayList;
import java.util.List;

public class Enemy {
    private int id;
    private Life life;
    private String name;
    private List<Action> actions;
    private List<Buff> buffs;

    public Enemy(int id, Life life, String name, List<Action> actions, List<Buff> buffs) {
        this.id = id;
        this.life = life;
        this.name = name;
        this.actions = actions;
        this.buffs = buffs;
    }

    public int getId() {
        return id;
    }

    public Life getLife() {
        return life;
    }

    public String getName() {
        return name;
    }

    public List<Action> getActions() {
        return actions;
    }

    public List<Buff> getBuffs() {
        return buffs;
    }
}
