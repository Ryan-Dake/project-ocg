package com.dake.ocg.model;

import java.util.List;

// There can be duplicates of cards in a deck
// There is no discard pile used cards go on the bottom of the deck
// The deck is shuffled when the game starts
public class Deck {
    private final List<Card> deck;

    public Deck(List<Card> deck) {
        this.deck = deck;
    }

    //add a card to the deck
    public void addCard(Card card) {
        deck.add(card);
    }

    //get the deck
    public List<Card> getDeck() {
        return deck;
    }
}
