package com.dake.ocg.model;

import java.util.List;

public class Game {
    private int seed;
    private Player player;
    private List<Scenario> scenarios;
    private Deck deck;
    private Hand hand;

    public Game(int seed, Player player, List<Scenario> scenarios, Deck deck, Hand hand) {
        this.seed = seed;
        this.player = player;
        this.scenarios = scenarios;
        this.deck = deck;
        this.hand = hand;
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

    public Deck getDeck() {
        return deck;
    }

    public Hand getHand() {
        return hand;
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

    public void setHand(Hand hand) {
        this.hand = hand;
    }
}
