package ru.game.tictactoe.engine;

import ru.game.tictactoe.sign.Sign;

/**
 *
 */
public interface IGameState {
    /**
     *  Finished or not the game.
     *  The game is finished if somebody wins or all cell are filled on the game field.
     */
    boolean isFinished();

//    /**
//     * Get winner of the game.
//     * If no winners in the game return null.
//     */
//    Sign getWinner();

    /**
     * Defined winner of the game.
     * If no winners in the game return null.
     */
    Sign getWinner();

}
