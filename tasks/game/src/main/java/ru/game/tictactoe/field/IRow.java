package ru.game.tictactoe.field;

import ru.game.tictactoe.cell.ICell;

/**
 * Represents a set of cells. One the set consists of 3 cells which will be taken from a field.
 */
public interface IRow {
    void setRow(ICell[] cell);
    ICell[] getRow();
    ICell[] getNextRow();
    boolean rowIsWinner();
}
