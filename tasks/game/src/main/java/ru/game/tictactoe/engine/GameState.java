package ru.game.tictactoe.engine;

import ru.game.tictactoe.cell.ICell;
import ru.game.tictactoe.field.IField;
import ru.game.tictactoe.player.IPlayer;
import ru.game.tictactoe.sign.Sign;

/**
 *
 */
public class GameState implements IGameState {
    private IField field;
    private ICell[][] fieldCells;
    private Sign currentSign;

    public GameState(IField field, IPlayer player) {
        this.field = field;
        fieldCells = field.getField();
        currentSign = player.getPlayerSign();
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
                winner = getWinnerByDiagonal();
            }
        }
        return winner;
    }

    private Sign getWinnerByRows() {
        return checkRowsOnWinner(fieldCells, currentSign);
    }

    private Sign checkRowsOnWinner(ICell[][] cells, Sign sign) {
        for (int i = 0; i < cells.length; i++)
            if (cells[0][i].getSign() == sign &&
                    cells[1][i].getSign() == sign &&
                    cells[2][i].getSign() == sign) {
                return sign;
            }
        return null;
    }

    private Sign getWinnerByCols() {
        return checkColsOnWinner(fieldCells, currentSign);
    }

    private Sign checkColsOnWinner(ICell[][] cells, Sign sign) {
        for (int i = 0; i < cells.length; i++)
            if (cells[i][0].getSign() == sign &&
                    cells[i][1].getSign() == sign &&
                    cells[i][2].getSign() == sign) {
                return sign;
            }
        return null;
    }

    private Sign getWinnerByDiagonal() {
        return checkDiagonals(fieldCells, currentSign);
    }

    private Sign checkDiagonals(ICell[][] cells, Sign sign) {
        if(     cells[0][0].getSign() == sign &&
                cells[1][1].getSign() == sign &&
                cells[2][2].getSign() == sign) {
            return sign;
        }
        if(     cells[2][0].getSign() == sign &&
                cells[1][1].getSign() == sign &&
                cells[0][2].getSign() == sign) {
            return sign;
        }
        return null;
    }

    ;
}


class Main2 {
    public static void main(String[] args) {
        int[] arr1 = new int[3];
        int[][] arr2 = new int[3][3];
        int[] arr3;
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i;
            System.out.println("arr = " + arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3 = arr2[i];
            for (int j = 0; j < arr3.length; j++) {
                arr3[j] = j;
                System.out.print("arr3 = " + arr3[j] + " ");
            }
            System.out.println("");
        }
    }
}