package com.dake.ocg.service;

import com.dake.ocg.model.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.stream.IntStream;


// This is an early testing game service for proof of concept
@Service
public class GameService {
    public Game getEarlyTestingGame() {
        int seed = 50;
        Player player = getNewPlayer();
        Enemy enemy = getNewEnemy();
        Deck deck = getEarlyTestingDeck();
        Hand hand = new Hand(new ArrayList<>(), 6);
        hand = drawHandFromDeck(deck, hand);

        List<Scenario> scenarios = List.of(
                new Scenario(1, "Goblin ambush", List.of(enemy))
        );

        Game game = new Game(seed, player, scenarios, deck, hand);

        System.out.println("Player: " + game.getPlayer());
        System.out.println("Scenarios: " + game.getScenarios());
        System.out.println("Deck: " + game.getDeck());
        System.out.println("Hand: " + game.getHand());

        return game;
    }

    public Hand drawHandFromDeck(Deck deck, Hand hand) {
        IntStream.range(0, hand.getHandSize()).forEach(i -> hand.addCard(deck.drawCard()));
        return hand;
    }

    public Player getNewPlayer() {
        Life playerLife = new Life(100, 100, 0);
        List<Buff> playerBuffs = new ArrayList<>();
        Mana playerMana = new Mana(5, 5);
        return new Player(1, playerLife, playerMana, playerBuffs);
    }

    public Enemy getNewEnemy() {
        List<Buff> enemyBuffs = new ArrayList<>();
        List<Action> enemyAbilities = List.of(
                new Action(1, "Sword swing", ActionType.ATTACK, 10)
        );

        return new Enemy(1, new Life(100, 100, 0), "Goblin", enemyAbilities, enemyBuffs);
    }

    public Deck getEarlyTestingDeck() {
        Deque<Card> cards = new java.util.LinkedList<>();
        Action attackAction = new Action(1, "Player swing club", ActionType.ATTACK, 15);
        Action defendAction = new Action(2, "Player defend with shield", ActionType.SHIELD, 10);

        for (int i = 0; i < 40; i++) {
            if (i % 3 == 0)
                cards.add(new Card(i, "Defend", 1, List.of(defendAction)));
            else
                cards.add(new Card(i, "Attack", 1, List.of(attackAction)));
        }

        return new Deck(cards);
    }
}
