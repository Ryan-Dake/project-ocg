package com.dake.ocg.model;

import java.util.List;

public class Game {
    private int seed;
    private Player player;
    private List<Scenario> scenarios;
    private Deck deck;

    public Game(int seed, Player player, List<Scenario> scenarios, Deck deck) {
        this.seed = seed;
        this.player = player;
        this.scenarios = scenarios;
        this.deck = deck;
    }

    public int getSeed() {
        return seed;
    }

    public Player getPlayer() {
        return player;
    }

    public List<Scenario> getScenarios() {
        return scenarios;
    }

    public void setSeed(int seed) {
        this.seed = seed;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void setScenarios(List<Scenario> scenarios) {
        this.scenarios = scenarios;
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }

    public Deck getDeck() {
        return deck;
    }
}
