package com.dake.ocg.model;

import java.util.List;

public class Card {
    private int cardId;
    private String name;
    private int cost;
    private List<Action> actions;

    public Card(int cardId, String name, int cost, List<Action> actions) {
        this.cardId = cardId;
        this.name = name;
        this.cost = cost;
        this.actions = actions;
    }

    public int getCardId() {
        return cardId;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public List<Action> getActions() {
        return actions;
    }

}