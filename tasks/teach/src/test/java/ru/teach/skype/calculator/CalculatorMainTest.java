package ru.teach.skype.calculator;
import org.junit.Test;
import ru.teach.skype.calculator.user.display.IUserDisplay;
import ru.teach.skype.calculator.user.display.UserDisplay;

import static org.junit.Assert.assertEquals;

/**
 *
 */
public class CalculatorMainTest {

//    public static void main(String[] args)throws Exception{
//        int c = System.in.read();
//    }

    @Test
    public void calculatorMainTest()throws Exception{
        IUserDisplay display = new UserDisplay();
        display.printCalculator();

    }

}
