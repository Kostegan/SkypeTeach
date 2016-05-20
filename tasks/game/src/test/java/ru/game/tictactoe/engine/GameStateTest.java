package ru.game.tictactoe.engine;

import org.junit.Test;
import ru.game.tictactoe.cell.Cell;
import ru.game.tictactoe.cell.ICell;
import ru.game.tictactoe.field.Field;
import ru.game.tictactoe.field.IField;
import ru.game.tictactoe.player.IPlayer;
import ru.game.tictactoe.player.Player;
import ru.game.tictactoe.sign.Sign;

import static org.junit.Assert.*;

/**
 *
 */
public class GameStateTest {
    private IField field = new Field();
    private IPlayer player = new Player(Sign.CROSS,"Alex");

    private IGameState createGameState() {
        return new GameState(field,player);
    }

    private void fillField(){
        ICell crossCell = new Cell();
        ICell toeCell = new Cell();
        crossCell.setSign(Sign.CROSS);
        toeCell.setSign(Sign.TOE);
        ICell[][] cells = field.getField();
        cells[0][0] = crossCell;    cells[1][0] = toeCell;      cells[2][0] = crossCell;
        cells[0][1] = crossCell;    cells[1][1] = toeCell;      cells[2][1] = crossCell;
        cells[0][2] = toeCell;      cells[1][2] = crossCell;    cells[2][2] = toeCell;





    }

    @Test
    public void checkFieldIsFilled() {
        IGameState gameState = createGameState();
        fillField();
        assertTrue("Game is finished: ", gameState.isFinished());
    }

    @Test
    public void checkGameIsNotFinished() {
        IGameState gameState = createGameState();
        assertFalse("Game is not finished: ", gameState.isFinished());
    }

    @Test
    public void checkRowsNotExistedWinner() {
        IGameState gameState = createGameState();
        assertNull("Winner is not existed, return null: ", gameState.getWinner());
    }

    @Test
    public void checkWinnerInFirstRow() {
        IGameState gameState = createGameState();
        ICell[][] cells = field.getField();
        ICell crossCell = new Cell();
        crossCell.setSign(Sign.CROSS);
        cells[0][0] = crossCell;
        cells[1][0] = crossCell;
        cells[2][0] = crossCell;
        assertEquals("Winner sign is: ", Sign.CROSS, gameState.getWinner());
    }

    @Test
    public void checkWinnerInSecondRow() {
        IGameState gameState = createGameState();
        ICell[][] cells = field.getField();
        ICell crossCell = new Cell();
        crossCell.setSign(Sign.CROSS);
        cells[0][1] = crossCell;
        cells[1][1] = crossCell;
        cells[2][1] = crossCell;
        assertEquals("Winner sign is: ", Sign.CROSS, gameState.getWinner());
    }

    @Test
    public void checkWinnerInLastRow() {
        IGameState gameState = createGameState();
        ICell[][] cells = field.getField();
        ICell crossCell = new Cell();
        crossCell.setSign(Sign.CROSS);
        cells[0][2] = crossCell;
        cells[1][2] = crossCell;
        cells[2][2] = crossCell;
        assertEquals("Winner sign is: ", Sign.CROSS, gameState.getWinner());
    }

    @Test
    public void checkColsNotExistedWinner() {
        IGameState gameState = createGameState();
        ICell[][] cells = field.getField();
        ICell crossCell = new Cell();
        ICell toeCell = new Cell();
        crossCell.setSign(Sign.CROSS);
        toeCell.setSign(Sign.TOE);
        cells[0][2] = crossCell;
        cells[0][2] = toeCell;
        cells[0][2] = crossCell;
        assertNull("Winner is not existed, return null: ", gameState.getWinner());
    }

    @Test
    public void checkWinnerInFirstCol() {
        IGameState gameState = createGameState();
        ICell[][] cells = field.getField();
        ICell crossCell = new Cell();
        crossCell.setSign(Sign.CROSS);
        cells[0][0] = crossCell;
        cells[0][1] = crossCell;
        cells[0][2] = crossCell;
        assertEquals("Winner sign is: ", Sign.CROSS, gameState.getWinner());
    }

    @Test
    public void checkWinnerInSecondCol() {
        IGameState gameState = createGameState();
        ICell[][] cells = field.getField();
        ICell crossCell = new Cell();
        crossCell.setSign(Sign.CROSS);
        cells[1][0] = crossCell;
        cells[1][1] = crossCell;
        cells[1][2] = crossCell;
        assertEquals("Winner sign is: ", Sign.CROSS, gameState.getWinner());
    }

    @Test
    public void checkWinnerInLastCol() {
        IGameState gameState = createGameState();
        ICell[][] cells = field.getField();
        ICell crossCell = new Cell();
        crossCell.setSign(Sign.CROSS);
        cells[2][0] = crossCell;
        cells[2][1] = crossCell;
        cells[2][2] = crossCell;
        assertEquals("Winner sign is: ", Sign.CROSS, gameState.getWinner());
    }

    @Test
    public void checkWinnerInDiagonal() {
        IGameState gameState = createGameState();
        ICell[][] cells = field.getField();
        ICell crossCell = new Cell();
        crossCell.setSign(Sign.CROSS);
        cells[0][0] = crossCell;
        cells[1][1] = crossCell;
        cells[2][2] = crossCell;
        assertEquals("Winner sign is: ", Sign.CROSS, gameState.getWinner());
    }
    @Test
    public void checkWinnerInNextDiagonal() {
        IGameState gameState = createGameState();
        ICell[][] cells = field.getField();
        ICell crossCell = new Cell();
        crossCell.setSign(Sign.CROSS);
        cells[2][0] = crossCell;
        cells[1][1] = crossCell;
        cells[0][2] = crossCell;
        assertEquals("Winner sign is: ", Sign.CROSS, gameState.getWinner());
    }

}
