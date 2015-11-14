package ru.teach.skype.calculator.arithmetic.expression.items.operation;

import org.junit.Test;

import static org.junit.Assert.*;

import ru.teach.skype.calculator.arithmetic.expression.items.NumberItem;

/**
 * 1. First value null and second value NumberItem
 * 2. Number set null
 * 3. Value number one and value number two set null
 */
public class PlusOperationItemTest {
    /**
     * 1. First value null and second value NumberItem
     *  todo спросить нужно как то определенно обрабатывать такую ошибку
     */

    @Test(expected = IllegalArgumentException.class)
    public void additionFirstValueNull() {
        IOperationItem operation = new PlusOperationItem();
        NumberItem number = new NumberItem(20);
        operation.calculateFromTwoValue(null, number);
    }

    /**
     * Checking method toString.
     */
    @Test
    public void checkToString(){
        IOperationItem operationPlus = new PlusOperationItem();
        assertEquals("Return: +", "+", operationPlus.toString());
    }

    /**
     * 2. Number set null
     */

    @Test(expected = IllegalArgumentException.class)
    public void additionFirstNumberSetNull() {
        IOperationItem operation = new PlusOperationItem();
        NumberItem number = null;
        NumberItem number1 = new NumberItem(30);
        operation.calculateFromTwoValue(number, number1);
    }

    /**
     * 3. Value number one and value number two set null
     */

    @Test(expected = IllegalArgumentException.class)
    public void additionNumbersSetNull() {
        IOperationItem operation = new PlusOperationItem();
        NumberItem number = null;
        NumberItem number1 = null;
        operation.calculateFromTwoValue(number, number1);
    }

    /**
     * 4. Set in number one value 5 and set in number two value 10
     */

    @Test
    public void additionTwoNumberNotNull() {
        IOperationItem operation = new PlusOperationItem();
        NumberItem number1 = new NumberItem(5);
        NumberItem number2 = new NumberItem(10);
        NumberItem result = operation.calculateFromTwoValue(number1, number2);
        assertEquals("IResult of adding = ", 15, result.getNumber(), 0.001);
    }
}
