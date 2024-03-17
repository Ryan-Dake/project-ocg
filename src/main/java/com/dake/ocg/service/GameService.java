package com.dake.ocg.service;

import com.dake.ocg.model.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


// This is an early testing game service for proof of concept
@Service
public class GameService {
    public void earlyTestingGame() {
        int seed = 50;
        Player player = getNewPlayer();
        Enemy enemy = getNewEnemy();
        Deck deck = getEarlyTestingDeck();

        List<Scenario> scenarios = List.of(
                new Scenario(1, "Goblin ambush", List.of(enemy))
        );

        Game game = new Game(seed, player, scenarios, deck);
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
        List<Card> cards = new ArrayList<>();
        Action attackAction = new Action(1, "Attack", ActionType.ATTACK, 15);
        Action defendAction = new Action(2, "Defend", ActionType.SHIELD, 10);

        for(int i = 0; i < 40; i++) {
            if( i % 3 == 0)
                cards.add(new Card(i, "Defend", 1, List.of(defendAction)));
            else
                cards.add(new Card(i, "Attack", 1, List.of(attackAction)));
        }

        return new Deck(cards);
    }
}
