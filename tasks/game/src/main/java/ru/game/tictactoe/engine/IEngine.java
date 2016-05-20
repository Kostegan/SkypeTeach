package ru.game.tictactoe.engine;

import ru.game.tictactoe.player.IPlayer;

import java.io.IOException;

/**
 * It is the main class, which stores an information about field, about players, about their move.
 */
public interface IEngine {
    void startGame()throws IOException;
}
