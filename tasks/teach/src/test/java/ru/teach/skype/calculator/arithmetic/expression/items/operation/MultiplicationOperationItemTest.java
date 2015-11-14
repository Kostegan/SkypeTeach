package ru.teach.skype.calculator.arithmetic.expression.items.operation;

import org.junit.Test;
import static org.junit.Assert.*;
import ru.teach.skype.calculator.arithmetic.expression.items.NumberItem;

/**
 *
 */
public class MultiplicationOperationItemTest {
    /**
     * 1. First value null and second value NumberItem
     * спросить нужно как то определенно обрабатывать такую ошибку
     */

    @Test(expected = IllegalArgumentException.class)
    public void multiplyFirstValueNull(){
        IOperationItem operation = new MultiplicationOperationItem();
        NumberItem number = new NumberItem(20);
        operation.calculateFromTwoValue(null,number);
    }
    /**
     * 2. In one from number value set null
     */


    /**
     * Checking method toString.
     */
    @Test
    public void checkToString(){
        IOperationItem multiplication = new MultiplicationOperationItem();
        assertEquals("Return: * ","*",multiplication.toString());
    }

    @Test (expected = IllegalArgumentException.class)
    public void multiplyFirstNumberSetNull(){
        IOperationItem operation = new MultiplicationOperationItem();
        NumberItem number = null;
        NumberItem number1 = new NumberItem(30);
        operation.calculateFromTwoValue(number,number1);
    }

    /**
     * 3. Value number one and value number two set null
     */

    @Test (expected = IllegalArgumentException.class)
    public void multiplyNumbersSetNull(){
        IOperationItem operation = new MultiplicationOperationItem();
        NumberItem number = null;
        NumberItem number1 = null;
        operation.calculateFromTwoValue(number,number1);
    }

    /**
     * 4. Set in number one value 5 and set in number two value 10
     */

    @Test
    public void multiplicationTwoNumberNotNull (){
        IOperationItem operation = new MultiplicationOperationItem();
        NumberItem number1 = new NumberItem(5);
        NumberItem number2 = new NumberItem(10);
        NumberItem result = operation.calculateFromTwoValue(number1,number2);
        assertEquals("IResult multiplication: ",50,result.getNumber(),0.01);
    }
}
