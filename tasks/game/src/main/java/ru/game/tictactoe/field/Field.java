package ru.game.tictactoe.field;

import ru.game.tictactoe.cell.Cell;
import ru.game.tictactoe.cell.ICell;

/**
 *
 */
public class Field implements IField {
    private Cell[][] field = new Cell[3][3];

    public Field() {
        fillField();
    }

    @Override
    public ICell[][] getField() {
        return field;
    }

    private void fillField() {
        runOnField(new RunOnFieldCallback() {
            @Override
            public boolean doCellAction(Cell cell, Cell[] row, int rowIndex, int colIndex) {
                cell = new Cell();
                row[colIndex] = cell;
                return false;
            }
        });
    }

    @Override
    public void printField() {
        runOnField(new RunOnFieldCallback() {
            @Override
            public boolean doCellAction(Cell cell, Cell[] row, int rowIndex, int colIndex) {
                System.out.print(cell.printCell() + " ");
                if(colIndex==row.length-1){
                    System.out.println();
                }
                return false;
            }
        });
    }

    @Override
    public ICell findCellByNumber(int cellNumber) {

        Cell cell = runOnField(new RunOnFieldCallback() {
            @Override
            public boolean doCellAction(Cell cell, Cell[] row, int rowIndex, int colIndex) {
               return cell.getCellNumber() == cellNumber;
            }
        });
        if(cell==null){
            throw new IllegalArgumentException("Cell number: " + cellNumber + " is incorrect, correct cell number 1-9");
        }
        return cell;
    }

    private Cell runOnField(RunOnFieldCallback callback) {
        for (int i = 0; i < field.length; i++) {
            Cell[] row = field[i];
            for (int j = 0; j < row.length; j++) {
                Cell cell = row[j];
                boolean find = callback.doCellAction(cell, row, i, j);
                if(find){
                    return cell;
                }
            }
        }
        return null;
    }

    interface RunOnFieldCallback {
        boolean doCellAction(Cell cell, Cell[] row, int rowIndex, int colIndex);
    }

    @Override
    public boolean isFieldFilled() {
        for(ICell[] cells:field){
            for(ICell cell:cells){
                if(cell.getSign()==null){
                    return false;
                }
            }
        }
        return true;
    }
}




