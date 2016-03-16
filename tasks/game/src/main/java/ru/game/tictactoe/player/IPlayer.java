package ru.game.tictactoe.player;

import ru.game.tictactoe.cell.ICell;
import ru.game.tictactoe.field.IField;
import ru.game.tictactoe.sign.Sign;

/**
 * Stores an information about player, a selected sign.
 */
public interface IPlayer {
    /**
     * @param name which will be set
     */
    void setPlayerName(String name);

    /**
     * @return player name
     */
    String getPlayerName();

    /**
     * @return player sign
     */
    Sign getPlayerSign();

    /**
     * @param sign which will be set
     */
    void setPlayerSign(Sign sign);

    /**
     * Sets a marker to a specified cell.
     */
    ICell makeMove(ICell cell);
}
