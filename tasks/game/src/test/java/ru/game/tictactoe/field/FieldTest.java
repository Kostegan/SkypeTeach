package ru.game.tictactoe.field;

import static org.junit.Assert.*;

import org.junit.Test;
import ru.game.tictactoe.cell.Cell;
import ru.game.tictactoe.cell.ICell;
import ru.game.tictactoe.sign.Sign;

/**
 *
 */
public class FieldTest {
    @Test
    public void createFieldSetSign() {
        IField field = new Field();
        ICell[][] creationField = field.getField();
        ICell cell1 = creationField[1][1];
        Sign signCroos = Sign.CROOS;
        Sign signToe = Sign.TOE;
        assertTrue("The cell is empty.", cell1.isEmpty());
        cell1.setSign(signCroos);
        assertFalse("The cell is not empty.", cell1.isEmpty());
        ICell cell2 = creationField[1][2];
        assertTrue("The cell is empty.", cell2.isEmpty());
        cell2.setSign(signToe);
        assertFalse("The cell is not empty.", cell2.isEmpty());
    }

    @Test
    public void printField(){
        IField field = new Field();
        ICell[][] createdField = field.getField();
        field.printField();
    }

}
