package ru.game.tictactoe.field;

import ru.game.tictactoe.cell.ICell;

/**
 * Stored a field of 3 cells to length and 3 cells to height.
 */
public interface IField {
    /**
     * @return array cells.
     */
    ICell[][] getField();

    /**
     * Prints a field as a set of columns and a set rows.
     */
    void printField();

    /**
     * Searches a cell by specifies number.
     */
    ICell findCellByNumber(int cellNumber);


    boolean isFieldFilled();


}
