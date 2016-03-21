package ru.game.tictactoe.engine;

import ru.game.tictactoe.field.IField;
import ru.game.tictactoe.sign.Sign;

/**
 *
 */
public class GameState implements IGameState {
    private IField field;

    public GameState(IField field) {
        this.field = field;
    }

    @Override
    public boolean isFinished() {
        return field.isFieldFilled() || getWinner() != null;
    }

    @Override
    public Sign getWinner() {
        Sign winner = getWinnerByRows();
        if (winner == null) {
            winner = getWinnerByCols();
            if (winner == null) {
                winner = getWinnerByDiags();
            }
        }
        return winner;
    }

    private Sign getWinnerByRows() {

    }

    private Sign getWinnerByCols() {

    }

    private Sign getWinnerByDiags() {

    }
}
