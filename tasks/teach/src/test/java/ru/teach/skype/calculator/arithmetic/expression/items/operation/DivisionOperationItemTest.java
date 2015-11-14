package ru.teach.skype.calculator.arithmetic.expression.items.operation;

import org.junit.Test;
import static org.junit.Assert.*;
import ru.teach.skype.calculator.arithmetic.expression.items.NumberItem;

/**
 *
 */
public class DivisionOperationItemTest {
    /**
     * 1. First value null and second value NumberItem
     * todo спросить нужно как то определенно обрабатывать такую ошибку
     */

    @Test(expected = IllegalArgumentException.class)
    public void dividedFirstValueNull(){
        IOperationItem operation = new DivisionOperationItem();
        NumberItem number = new NumberItem(20);
        operation.calculateFromTwoValue(null,number);
    }
    /**
     * 2. In one from number value set null
     */

    /**
     *
     */
    @Test
    public void checkToString(){
        IOperationItem division = new DivisionOperationItem();
        assertEquals("Return: /","/",division.toString());
    }
    @Test (expected = IllegalArgumentException.class)
    public void dividedFirstNumberSetNull(){
        IOperationItem operation = new DivisionOperationItem();
        NumberItem number = null;
        NumberItem number1 = new NumberItem(30);
        operation.calculateFromTwoValue(number,number1);
    }

    /**
     * 3. Value number one and value number two set null
     */

    @Test (expected = IllegalArgumentException.class)
    public void dividedNumbersSetNull(){
        IOperationItem operation = new DivisionOperationItem();
        NumberItem number = null;
        NumberItem number1 = null;
        operation.calculateFromTwoValue(number,number1);
    }

    /**
     * Set in number one value 10 and set in number two value 2
     */
    @Test
    public void dividedTwoNumberNotNull(){
        IOperationItem operation = new DivisionOperationItem();
        NumberItem number1 = new NumberItem(10);
        NumberItem number2 = new NumberItem(2);
        NumberItem result = operation.calculateFromTwoValue(number1,number2);
        assertEquals("IResult divided: ",5,result.getNumber(),0.01);

    }
}
