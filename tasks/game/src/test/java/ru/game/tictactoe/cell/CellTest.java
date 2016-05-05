package ru.game.tictactoe.cell;

import org.junit.Test;
import ru.game.tictactoe.sign.Sign;
import static org.junit.Assert.*;

/**
 *
 */
public class CellTest {
    private ICell createCell(){
        return new Cell();
    }
    
    private Sign createToeSign(){
        return Sign.TOE;
    }

    private Sign createCrossSign(){
        return Sign.CROSS;
    }

    @Test
    public void checkEmptyCell(){
        ICell cell = createCell();
        assertTrue("Cell is empty",cell.isEmpty());
    }

    @Test
    public void checkNotEmptyCell(){
        ICell cell = createCell();
        cell.setSign(Sign.CROSS);
        assertFalse("Cell not empty:", cell.isEmpty());
    }

    @Test
    public void getSignNameCroos(){
        ICell cell = createCell();
        cell.setSign(Sign.CROSS);
        assertEquals("Sign name is:", "CROSS", cell.getSign().name());
    }

    @Test
    public void getSignNameToe(){
        ICell cell = createCell();
        cell.setSign(Sign.TOE);
        assertEquals("Sign name is:", "TOE", cell.getSign().name());
    }


    @Test (expected = IllegalArgumentException.class)
    public void setSignNotEmptyCell(){
        ICell cell = createCell();
        cell.setSign(Sign.TOE);
        assertEquals("Sign name is:", "TOE", cell.getSign().name());
        cell.setSign(Sign.CROSS);
    }
}
