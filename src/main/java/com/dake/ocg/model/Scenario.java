package com.dake.ocg.model;

import java.util.List;

public class Scenario {
    private int id;
    private String name;
    private List<Enemy> enemies;

    public Scenario(int id, String name, List<Enemy> enemies) {
        this.id = id;
        this.name = name;
        this.enemies = enemies;
    }
}
