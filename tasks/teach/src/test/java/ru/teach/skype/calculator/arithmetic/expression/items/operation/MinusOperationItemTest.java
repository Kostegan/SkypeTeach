package ru.teach.skype.calculator.arithmetic.expression.items.operation;

import org.junit.Test;
import static org.junit.Assert.*;
import ru.teach.skype.calculator.arithmetic.expression.items.NumberItem;

/**
 * 1. First value null and second value NumberItem
 * 2. In one from number value set null
 * 3. Value number one and value number two set null
 */
public class MinusOperationItemTest {

    /**
     * 1. First value null and second value NumberItem
     * спросить нужно как то определенно обрабатывать такую ошибку
     */

    @Test(expected = IllegalArgumentException.class)
    public void subtractionFirstValueNull() {
        IOperationItem operation = new MinusOperationItem();
        NumberItem number = new NumberItem(20);
        operation.calculateFromTwoValue(null, number);
    }

    /**
     * Check method toString
     */
    @Test
    public void checkToString(){
        IOperationItem minus = new MinusOperationItem();
        assertEquals("Return: - ","-",minus.toString());
    }

    /**
     * 2. In one from number value set null
     */

    @Test(expected = IllegalArgumentException.class)
    public void subtractionFirstNumberSetNull() {
        IOperationItem operation = new MinusOperationItem();
        NumberItem number = null;
        NumberItem number1 = new NumberItem(30);
        operation.calculateFromTwoValue(number, number1);
    }

    /**
     * 3. Value number one and value number two set null
     */

    @Test(expected = IllegalArgumentException.class)
    public void subtractionNumbersSetNull() {
        IOperationItem operation = new PlusOperationItem();
        NumberItem number = null;
        NumberItem number1 = null;
        operation.calculateFromTwoValue(number, number1);
    }

    /**
     * 4. Set in number one value 10 and set in number two value 5
     */
    @Test
    public void subtractionTwoNumberNotNull(){
        IOperationItem operation = new MinusOperationItem();
        NumberItem number1 = new NumberItem(10);
        NumberItem number2 = new NumberItem(5);
        NumberItem result = operation.calculateFromTwoValue(number1,number2);
        assertEquals("IResult of subtraction",5,result.getNumber(),0.01);
    }
}
