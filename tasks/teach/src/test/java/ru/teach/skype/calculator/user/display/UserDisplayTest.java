package ru.teach.skype.calculator.user.display;

import org.junit.Test;
import ru.teach.skype.calculator.CalculatorResult;

import static org.junit.Assert.assertEquals;

/**
 *
 */
public class UserDisplayTest {
    @Test
    public void setString(){
        IUserDisplay user = new UserDisplay();
        user.setExample("1+2");
    }

    @Test
    public void calculate(){
        IUserDisplay UI = new UserDisplay();
        CalculatorResult result = UI.calculate("2+3");
        assertEquals("2 + 3 = 5", 5.0, result.getResult().getNumber(), 0.001);
    }


    @Test
    public void calculateThreeItems(){
        IUserDisplay UI = new UserDisplay();
        CalculatorResult result = UI.calculate("2+3-1");
        assertEquals("2 + 3 -1 = 4",4.0,result.getResult().getNumber(),0.001);
    }

    @Test
    public void calculateMoreDifficultExample(){
        IUserDisplay UI = new UserDisplay();
        CalculatorResult result = UI.calculate("24+6/3");
        assertEquals("24 + 6 / 3 = 10",26.0,result.getResult().getNumber(),0.01);
    }

    @Test
    public void calculateExpressionWithSpace(){
        IUserDisplay UI = new UserDisplay();
        CalculatorResult result = UI.calculate("2 +              4 -1 ");
        assertEquals("2 + 4 -1 ",5.0,result.getResult().getNumber(),0.01);
    }


}
