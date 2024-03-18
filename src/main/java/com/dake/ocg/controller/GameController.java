package com.dake.ocg.controller;

import com.dake.ocg.model.Game;
import com.dake.ocg.service.GameService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameController {

    private final GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping("/game/start")
    public Game startGame() {
        return gameService.getEarlyTestingGame();
    }
}
