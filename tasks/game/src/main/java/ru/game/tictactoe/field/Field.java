package ru.game.tictactoe.field;

import ru.game.tictactoe.cell.Cell;
import ru.game.tictactoe.cell.ICell;

import java.util.Map;

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
        for (int i = 0; i < field.length; i++) {
            Cell[] temp = field[i];
            for (int j = 0; j < temp.length; j++) {
                Cell cell = new Cell();
                temp[j] = cell;
            }
        }
    }

    public void printField() {
        for (int i = 0; i < field.length; i++) {
            Cell[] temp = field[i];
            for (int j = 0; j < temp.length; j++) {
                System.out.print(temp[j].printCell() + " ");
            }
            System.out.println();
        }
    }

    @Override
    public ICell findCellByNumber(int cellNumber) {
        for (int i = 0; i < field.length; i++) {
            Cell[] temp = field[i];
            for (int j = 0; j < temp.length; j++) {
                if ((temp[j].getCellNumber()) == cellNumber) {
                    return temp[j];
                }
            }
        }
        throw new IllegalArgumentException("Cell number: " + cellNumber + " is incorrect, correct cell number 1-9");
    }


    public Cell[] getCell() {
        Cell[] allTemp = new Cell[9];
        for (int i = 0; i < field.length; i++) {
            Cell[] temp = field[i];
            for (int j = 0; j < temp.length; j++) {
                int number = temp[j].getCellNumber();
                allTemp[number] = temp[j];

            }
        }
        return allTemp;
    }
}


