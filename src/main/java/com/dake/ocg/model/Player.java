package com.dake.ocg.model;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private int id;
    private Life life;
    private Mana mana;
    private List<Buff> buffs;

    public Player(int id, Life life, Mana mana, List<Buff> buffs) {
        this.id = id;
        this.life = life;
        this.mana = mana;
        this.buffs = buffs;
    }

    public int getId() {
        return id;
    }

    public Life getLife() {
        return life;
    }

    public List<Buff> getBuffs() {
        return buffs;
    }

    public Mana getMana() {
        return mana;
    }

    public void setLife(Life life) {
        this.life = life;
    }

    public void setMana(Mana mana) {
        this.mana = mana;
    }

    public void setBuffs(List<Buff> buffs) {
        this.buffs = buffs;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void addBuff(Buff buff) {
        if (buffs == null) {
            buffs = new ArrayList<>();
        }
        buffs.add(buff);
    }

    public void removeBuff(Buff buff) {
        if (buffs != null) {
            buffs.remove(buff);
        }
    }
}
