package ru.teach.skype.calculator;

import org.junit.Test;
import ru.teach.skype.calculator.arithmetic.expression.ArithmeticExpression;
import ru.teach.skype.calculator.arithmetic.expression.ArithmeticExpressionException;
import ru.teach.skype.calculator.arithmetic.expression.IArithmeticExpression;
import ru.teach.skype.calculator.arithmetic.expression.items.NumberItem;
import ru.teach.skype.calculator.arithmetic.expression.items.operation.*;

import java.util.Stack;

import static org.junit.Assert.assertEquals;

/**
 * 1. Передан IArithmeticExpression со значением null
 * 1.1. To AE set 2 + 3
 * 2. Арифметическое выражение состаит менее чем из 3 элементов
 * 4. В Арифметическое выражение на первом месте установлен знак
 * 5. В Арифметическое выражение на первом месте установлено не число
 * 6. В Арифметическое выражение на первом месте установлено число и на втором месте тоже число
 * 7. В Арифметическое выражение на первом месте установлено число на втором месте знак и на третем знак
 */
public class CalculatorTest {
    private ICalculator createCalculator() {
        return new Calculator();
    }

    /**
     * 1. Передан IArithmeticExpression со значением null
     *
     * @throws CalculatorException
     */
    @Test(expected = IllegalArgumentException.class)
    public void calculateNull() throws CalculatorException {
        ICalculator calculator = createCalculator();
        ArithmeticExpression expression = null;
        calculator.calculate(expression);
    }

    /**
     * 1.1 To AE set 2 + 3
     */
    @Test
    public void calculateExpressionTwoNumber() throws CalculatorException {
        ICalculator calculator = createCalculator();
        ArithmeticExpression expression = new ArithmeticExpression();
        NumberItem number1 = new NumberItem(3);
        IOperationItem operationPlus = new PlusOperationItem();
        NumberItem number2 = new NumberItem(2);
        expression.addItem(number1);
        expression.addItem(operationPlus);
        expression.addItem(number2);
        CalculatorResult result = calculator.calculate(expression);
        NumberItem number3 = result.getResult();
        assertEquals("Result 2 + 3 :", 5, number3.getNumber(), 0.01);
    }

    /**
     * 2. Арифметическое выражение состаит менее чем из 3 элементов
     */
    @Test(expected = ArithmeticExpressionException.class)
    public void calculateExpressionlessThree() {
        ICalculator calculator = createCalculator();
        ArithmeticExpression expression = new ArithmeticExpression();
        NumberItem number1 = new NumberItem();
        number1.setNumber(20);
        expression.addItem(number1);
        calculator.calculate(expression);
    }

    /**
     * 5 + 4 - 2
     */
    @Test
    public void calculateThreeValue() {
        Calculator calculator = new Calculator();
        IArithmeticExpression expression = new ArithmeticExpression();
        expression.addItem(new NumberItem(5));
        expression.addItem(new PlusOperationItem());
        expression.addItem(new NumberItem(4));
        expression.addItem(new MinusOperationItem());
        expression.addItem(new NumberItem(2));
        CalculatorResult result = calculator.calculate(expression);
        NumberItem number4 = result.getResult();
        assertEquals("Result 5 + 4 - 2 : ", 7, number4.getNumber(), 0.01);
    }

    /**
     * 6 + 4 - 2 * 2
     */

    @Test
    public void calculateFourValue() {
        Calculator calculator = new Calculator();
        IArithmeticExpression expression = new ArithmeticExpression();
        NumberItem number1 = new NumberItem(6);
        NumberItem number2 = new NumberItem(4);
        NumberItem number3 = new NumberItem(2);
        NumberItem number4 = new NumberItem(2);
        IOperationItem operationPlus = new PlusOperationItem();
        IOperationItem operationMinus = new MinusOperationItem();
        IOperationItem operationMultiplication = new MultiplicationOperationItem();
        expression.addItem(number1);
        expression.addItem(operationPlus);
        expression.addItem(number2);
        expression.addItem(operationMinus);
        expression.addItem(number3);
        expression.addItem(operationMultiplication);
        expression.addItem(number4);
        CalculatorResult result = calculator.calculate(expression);
        NumberItem resultNumber = result.getResult();
        assertEquals("result 6 + 4 - 2 * 2", 6, resultNumber.getNumber(), 0.01);
    }

    /**
     * CalculateFromStack
     * 1. Calculate 1+2+3 or polish 1 2 + 3 +
     * 2. Calculate 1+2*3 or polish 1 2 3 * +
     * 3. Calculate 1+2*3+1*2 or polish 1 2 3 * + 1 2 * +
     */
    @Test
         public void calculateFromStackThreeElement(){
        Calculator calculator = new Calculator();
        NumberItem number1 = new NumberItem(1);
        NumberItem number2 = new NumberItem(2);
        NumberItem number3 = new NumberItem(3);
        IOperationItem operationPlus = new PlusOperationItem();
        Stack stack = new Stack();
        stack.push(operationPlus);
        stack.push(number3);
        stack.push(operationPlus);
        stack.push(number2);
        stack.push(number1);
        NumberItem result =(NumberItem) calculator.calculateFromStack(stack);
        assertEquals(6,result.getNumber(),0.02 );
    }

    /**
     * 2. Calculate 1+2*3 or polish 1 2 3 * +
     */
    @Test
    public void calculateFromStackThreeElement2(){
        Calculator calculator = new Calculator();
        NumberItem number1 = new NumberItem(1);
        NumberItem number2 = new NumberItem(2);
        NumberItem number3 = new NumberItem(3);
        IOperationItem operationPlus = new PlusOperationItem();
        IOperationItem operationMultiplication = new MultiplicationOperationItem();
        Stack stack = new Stack();
        stack.push(operationPlus);
        stack.push(operationMultiplication);
        stack.push(number3);
        stack.push(number2);
        stack.push(number1);
        NumberItem result =(NumberItem) calculator.calculateFromStack(stack);
        assertEquals(7, result.getNumber(),0.02 );
    }

    /**
     * 3. Calculate 1+2*3+1*2 or polish 1 2 3 * + 1 2 * +
     */
    @Test
    public void calculateFromStackThreeElement3(){
        Calculator calculator = new Calculator();
        NumberItem number1 = new NumberItem(1);
        NumberItem number2 = new NumberItem(2);
        NumberItem number3 = new NumberItem(3);
        IOperationItem operationPlus = new PlusOperationItem();
        IOperationItem operationMultiplication = new MultiplicationOperationItem();
        Stack stack = new Stack();
        stack.push(operationPlus);
        stack.push(operationMultiplication);
        stack.push(number2);
        stack.push(number1);
        stack.push(operationPlus);
        stack.push(operationMultiplication);
        stack.push(number3);
        stack.push(number2);
        stack.push(number1);
        NumberItem result =(NumberItem) calculator.calculateFromStack(stack);
        assertEquals(9, result.getNumber(),0.02 );
    }
}
