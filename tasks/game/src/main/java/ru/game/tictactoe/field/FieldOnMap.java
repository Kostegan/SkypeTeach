package ru.game.tictactoe.field;

import ru.game.tictactoe.cell.ICell;

import java.util.Map;

/**
 *
 */
public class FieldOnMap implements IField {
    private Map<Integer,ICell> field;

    @Override
    public ICell[][] getField() {
        return new ICell[0][];
    }

    @Override
    public void printField() {

    }

    @Override
    public ICell findCellByNumber(int cellNumber) {
        return null;
    }
}
