package com.dake.ocg.model;

import java.util.List;

public class Hand {
    private List<Card> hand;
    private int handSize = 6;

    public Hand(List<Card> hand, int handSize) {
        this.hand = hand;
        this.handSize = handSize;
    }

    public List<Card> getHand() {
        return hand;
    }

    public int getHandSize() {
        return handSize;
    }

    public void addCard(Card card) {
        hand.add(card);
    }

    public void removeCard(Card card) {
        hand.remove(card);
    }
}
