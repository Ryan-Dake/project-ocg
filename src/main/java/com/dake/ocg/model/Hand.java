package com.dake.ocg.model;

import java.util.List;

public class Hand {
    private final List<Card> hand;

    public Hand(List<Card> hand) {
        this.hand = hand;
    }

    //get the hand
    public List<Card> getHand() {
        return hand;
    }
}
