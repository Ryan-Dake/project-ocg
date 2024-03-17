package com.dake.ocg.model;

public class Mana {
    private int maxMana;
    private int currentMana;

    public Mana(int maxMana, int currentMana) {
        this.maxMana = maxMana;
        this.currentMana = currentMana;
    }

    public int getMaxMana() {
        return maxMana;
    }

    public int getCurrentMana() {
        return currentMana;
    }

    public void setCurrentMana(int currentMana) {
        this.currentMana = currentMana;
    }

    public void setMaxMana(int maxMana) {
        this.maxMana = maxMana;
    }
}
