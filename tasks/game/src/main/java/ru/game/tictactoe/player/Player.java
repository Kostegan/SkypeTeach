package ru.game.tictactoe.player;

import ru.game.tictactoe.cell.ICell;
import ru.game.tictactoe.field.IField;
import ru.game.tictactoe.sign.Sign;

/**
 *
 */
public class Player implements IPlayer {
    private Sign sign;
    private String name;

    public Player() {
    }

    public Player(Sign sign, String name) {
        this.sign = sign;
        this.name = name;
    }

    @Override
    public IPlayer createPlayer(String name, Sign sign) {
        return null;
    }

    @Override
    public void setPlayerName(String name) {
        this.name = name;
    }

    @Override
    public String getPlayerName() {
        return name;
    }

    @Override
    public Sign getPlayerSign() {
        return sign;
    }

    @Override
    public void setPlayerSign(Sign sign) {
        this.sign = sign;
    }
    
}
