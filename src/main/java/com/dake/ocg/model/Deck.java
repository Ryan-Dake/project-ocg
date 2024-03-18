package com.dake.ocg.model;

import java.util.Deque;
import java.util.List;

// There can be duplicates of cards in a deck
// There is no discard pile used cards go on the bottom of the deck
// The deck is shuffled when the game starts
public class Deck {
    private Deque<Card> deck;

    public Deck(Deque<Card> deck) {
        this.deck = deck;
    }

    public Card lookAtTopCard() {
        return deck.peek();
    }

    public Card drawCard() {
        return deck.pop();
    }

    public Deque<Card> getDeck() {
        return deck;
    }
}
