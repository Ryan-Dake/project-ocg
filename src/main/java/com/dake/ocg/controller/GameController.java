package com.dake.ocg.controller;

import com.dake.ocg.model.Card;
import com.dake.ocg.model.Deck;
import com.dake.ocg.service.GameService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GameController {

    private final GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping("/game/start")
    public Deck startGame() {
        gameService.earlyTestingGame();

        return null;
    }

    @GetMapping("/game/play/card")
    public List<Card> playCard(int cardId) {
        return null;
    }
}
