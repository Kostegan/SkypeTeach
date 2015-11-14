package ru.teach.skype.calculator.arithmetic.expression;

import org.junit.Test;
import ru.teach.skype.calculator.arithmetic.expression.items.IArithmeticExpressionItem;
import ru.teach.skype.calculator.arithmetic.expression.items.NumberItem;
import ru.teach.skype.calculator.arithmetic.expression.items.operation.*;

import java.util.Stack;

import static org.junit.Assert.*;

/**
 * ---- method add ----
 * 1. addEmployee number position one               +
 * 2. addEmployee number position two               -
 * 3. addEmployee number position one, and addEmployee operation position two            +
 * 4. addEmployee operation position one            - (�� ��������, ���������� ����� )
 * 5. addEmployee number position one, addEmployee operation position two, addEmployee operation position three
 * 6. addEmployee operator in last position         (error, delete operation or addEmployee number) ��������� ���� � Calculator
 * ---- method validate ----
 * 1. expression not null
 * 2. expression have three or more elements
 * 3. last element not operation
 * 4. for operation set not number
 * 5. for number set not operation
 */
public class ArithmeticExpressionTest {

    /**
     * 1. addEmployee number position one
     */
    @Test
    public void addNumberPositionOne() {
        IArithmeticExpression expression = new ArithmeticExpression();
        IArithmeticExpressionItem number1 = new NumberItem(20);
        expression.addItem(number1);
        assertEquals("Number1 = ", number1, expression.getIndexItem(0));
    }

    /**
     * 2. addEmployee number position two
     */
    @Test(expected = ArithmeticExpressionException.class)
    public void addNumberPositionTwo() {
        IArithmeticExpression expression = new ArithmeticExpression();
        IArithmeticExpressionItem number1 = new NumberItem(20);
        expression.addItem(number1);
        IArithmeticExpressionItem number2 = new NumberItem(20);
        expression.addItem(number2);

    }

    /**
     * 3. addEmployee number position one, and addEmployee operation position two
     */
    @Test
    public void addNumberAndOperation() {
        IArithmeticExpression expression = new ArithmeticExpression();
        IArithmeticExpressionItem number1 = new NumberItem(20);
        expression.addItem(number1);
        IArithmeticExpressionItem operation = new PlusOperationItem();
        expression.addItem(operation);
    }

    /**
     * 4. addEmployee operation position one
     */
    @Test(expected = ArithmeticExpressionException.class)
    public void addOperationPositionOne() {
        IArithmeticExpression expression = new ArithmeticExpression();
        IArithmeticExpressionItem operation = new PlusOperationItem();
        expression.addItem(operation);
    }

    /**
     * 5. addEmployee number position one, addEmployee operation position two, addEmployee operation position three
     */

    @Test(expected = ArithmeticExpressionException.class)
    public void addOperationPositionThree() {
        IArithmeticExpression expression = new ArithmeticExpression();
        NumberItem number1 = new NumberItem(22);
        IArithmeticExpressionItem operationPlus = new PlusOperationItem();
        IArithmeticExpressionItem operationMinus = new MinusOperationItem();
        expression.addItem(number1);
        expression.addItem(operationPlus);
        expression.addItem(operationMinus);

    }

    /**
     * 6. addEmployee operator in last position
     */

    @Test
    public void addOperationLastPosition() {
        IArithmeticExpression expression = new ArithmeticExpression();
        IArithmeticExpressionItem number1 = new NumberItem(21);
        IArithmeticExpressionItem operationPlus = new PlusOperationItem();
        IArithmeticExpressionItem number2 = new NumberItem(33);
        expression.addItem(number1);
        expression.addItem(operationPlus);
        expression.addItem(number2);
        expression.addItem(operationPlus);
    }

    /**
     * 7. addEmployee arithmetic expression (25 - 11 + 75 - 12 * 3)
     */
    @Test
    public void addArithmeticExpression() {
        IArithmeticExpression expression = new ArithmeticExpression();
        IArithmeticExpressionItem operationPlus = new PlusOperationItem();
        IArithmeticExpressionItem operationMinus = new PlusOperationItem();
        IArithmeticExpressionItem operationMultiply = new PlusOperationItem();
        NumberItem number1 = new NumberItem(25);
        NumberItem number2 = new NumberItem(11);
        NumberItem number3 = new NumberItem(75);
        NumberItem number4 = new NumberItem(12);
        NumberItem number5 = new NumberItem(3);
        expression.addItem(number1);
        expression.addItem(operationMinus);
        expression.addItem(number2);
        expression.addItem(operationPlus);
        expression.addItem(number3);
        expression.addItem(operationMinus);
        expression.addItem(number4);
        expression.addItem(operationMultiply);
        expression.addItem(number5);
    }


    /**
     * ---- method validate ----
     * 2. items  == null
     * 3. expression have two element numbers
     * 4. last element operation                 уточнить
     * 5. after operation set not number         уточнить
     * 6. after number set number           уточнить
     */


    /**
     * 2. items  == null
     */
    @Test(expected = ArithmeticExpressionException.class)
    public void validateExpressionItemsNull() {
        IArithmeticExpression expression = new ArithmeticExpression();
        expression.validate();
    }

    /**
     * 3. expression have two element numbers   - уточнить эту проверку убрать из validate ?
     */
//    @Test
//    public void validateExpressionThreeElements() {
//        IArithmeticExpression expression = new ArithmeticExpression();
//        NumberItem number = new NumberItem(2);
//        NumberItem number1 = new NumberItem(2);
//        expression.addItem(number);
//        expression.addItem(number1);
//        expression.validate();
//    }

    /**
     * 4. last element operation
     */
    @Test(expected = ArithmeticExpressionException.class)
    public void validateExpressionLastOperation() {
        IArithmeticExpression expression = new ArithmeticExpression();
        NumberItem number = new NumberItem(2);
        NumberItem number1 = new NumberItem(3);
        IOperationItem minus = new MinusOperationItem();
        expression.addItem(number);
        expression.addItem(minus);
        expression.addItem(number1);
        expression.addItem(minus);
        expression.validate();
    }


    /**
     * 5. after operation set not number      уточнить
     */
    @Test(expected = ArithmeticExpressionException.class)
    public void validateExpressionTwoOperation() {
        IArithmeticExpression expression = new ArithmeticExpression();
        NumberItem number = new NumberItem(2);
        IOperationItem minus = new MinusOperationItem();
        expression.addItem(number);
        expression.addItem(minus);
        expression.addItem(minus);
        expression.validate();
    }

    /**
     * 6. after number set number           уточнить
     */
    @Test(expected = ArithmeticExpressionException.class)
    public void validateExpressionTwoNumber() {
        IArithmeticExpression expression = new ArithmeticExpression();
        NumberItem number = new NumberItem(2);
        NumberItem number2 = new NumberItem(2);
        IOperationItem minus = new MinusOperationItem();
        expression.addItem(number);
        expression.addItem(minus);
        expression.addItem(number2);
        expression.addItem(number);
        expression.validate();
    }

    /**
     * -----convertToPolishExpression-----
     * 1. 2+3-1      to 2 3 + 1 -             =
     * 2. 2+3-1-1+2  to 2 3 + 1 - 1 - 2 +     =
     * 4. 1*2+3      to 1 2 * 3 +
     * 5. 1+2*3      to 1 2 3 * +
     * 6. 1+2*3-1+2 to 1 2 3 * + 1 - 2 +
     * 7. 1+2+3-1*2  to 1 2 + 3 + 1 2 * -
     */

    /**
     * 1+2 to  1 2 +
     */
    @Test
    public void convertToPolishExpression() {
        IArithmeticExpression expression = new ArithmeticExpression();
        NumberItem number1 = new NumberItem(1);
        NumberItem number2 = new NumberItem(2);
        IOperationItem operationPlus = new PlusOperationItem();
        expression.addItem(number1);
        expression.addItem(operationPlus);
        expression.addItem(number2);
        expression.convertToPolishExpression();
        assertEquals(number1, expression.listPolishExpression().get(0));
        assertEquals(number2, expression.listPolishExpression().get(1));
        assertEquals(operationPlus, expression.listPolishExpression().get(2));
    }

    /**
     * 1+2-1 to  1 2 + 1 -
     */
    @Test
    public void convertToPolishExpression2() {
        IArithmeticExpression expression = new ArithmeticExpression();
        NumberItem number1 = new NumberItem(1);
        NumberItem number2 = new NumberItem(2);
        IOperationItem operationPlus = new PlusOperationItem();
        IOperationItem operationMinus = new MinusOperationItem();
        expression.addItem(number1);
        expression.addItem(operationPlus);
        expression.addItem(number2);
        expression.addItem(operationMinus);
        expression.addItem(number1);
        expression.convertToPolishExpression();
        assertEquals(number1, expression.listPolishExpression().get(0));
        assertEquals(number2, expression.listPolishExpression().get(1));
        assertEquals(operationPlus, expression.listPolishExpression().get(2));
        assertEquals(number1, expression.listPolishExpression().get(3));
        assertEquals(operationMinus,expression.listPolishExpression().get(4));
    }

    /**
     * 1+2*3   123*+
     */
    @Test
    public void convertToPolishExpression13() {
        IArithmeticExpression expression = new ArithmeticExpression();
        NumberItem number1 = new NumberItem(1);
        NumberItem number2 = new NumberItem(2);
        NumberItem number3 = new NumberItem(3);
        IOperationItem operationPlus = new PlusOperationItem();
        IOperationItem operationMultiplication = new MultiplicationOperationItem();
        expression.addItem(number1);
        expression.addItem(operationPlus);
        expression.addItem(number2);
        expression.addItem(operationMultiplication);
        expression.addItem(number3);
        assertEquals("[+, *, 3.0, 2.0, 1.0]", expression.convertToPolish1().toString());
    }

    /**
     * 1 + 2 * 3 * 4  - 5 / 6  to  1 2 3 * 4 * + 5 6 / -
     */

    @Test
    public void convertToPolishExpression14() {
        IArithmeticExpression expression = new ArithmeticExpression();
        expression.addItem(new NumberItem(1));
        expression.addItem(new PlusOperationItem());
        expression.addItem(new NumberItem(2));
        expression.addItem(new MultiplicationOperationItem());
        expression.addItem(new NumberItem(3));
        expression.addItem(new MultiplicationOperationItem());
        expression.addItem(new NumberItem(4));
        expression.addItem(new MinusOperationItem());
        expression.addItem(new NumberItem(5));
        expression.addItem(new DivisionOperationItem());
        expression.addItem(new NumberItem(6));
        assertEquals("[-, /, 6.0, 5.0, +, *, 4.0, *, 3.0, 2.0, 1.0]", expression.convertToPolishExpression3().toString());
    }

    /**
     * 1+2-1-2+1 to  1 2 + 1 - 2 - 1 +
     */
    @Test
    public void convertToPolishExpression3() {
        IArithmeticExpression expression = new ArithmeticExpression();
        NumberItem number1 = new NumberItem(1);
        NumberItem number2 = new NumberItem(2);
        IOperationItem operationPlus = new PlusOperationItem();
        IOperationItem operationMinus = new MinusOperationItem();
        expression.addItem(number1);
        expression.addItem(operationPlus);
        expression.addItem(number2);
        expression.addItem(operationMinus);
        expression.addItem(number1);
        expression.addItem(operationMinus);
        expression.addItem(number2);
        expression.addItem(operationPlus);
        expression.addItem(number1);
        assertEquals(number1, expression.listPolishExpression().get(0));
        assertEquals(number2, expression.listPolishExpression().get(1));
        assertEquals(operationPlus, expression.listPolishExpression().get(2));
        assertEquals(number1, expression.listPolishExpression().get(3));
        assertEquals(operationMinus,expression.listPolishExpression().get(4));
        assertEquals(number2, expression.listPolishExpression().get(5));
        assertEquals(operationMinus,expression.listPolishExpression().get(6));
        assertEquals(number1, expression.listPolishExpression().get(7));
        assertEquals(operationPlus, expression.listPolishExpression().get(8));
    }

    /**
     * 2*2
     */
    @Test
    public void convertToPolishExpression4(){
        IArithmeticExpression expression = new ArithmeticExpression();
        NumberItem number1 = new NumberItem(2);
        IOperationItem operationMultiplication = new MultiplicationOperationItem();
        expression.addItem(number1);
        expression.addItem(operationMultiplication);
        expression.addItem(number1);
        assertEquals(number1,expression.listPolishExpression().get(0));
        assertEquals(number1,expression.listPolishExpression().get(1));
        assertEquals(operationMultiplication,expression.listPolishExpression().get(2));
    }


    /**
     * 1+2*1 to  1 2 1 * +
     */
    @Test
    public void convertToPolishExpression5() {
        IArithmeticExpression expression = new ArithmeticExpression();
        NumberItem number1 = new NumberItem(1);
        NumberItem number2 = new NumberItem(2);
        IOperationItem operationPlus = new PlusOperationItem();
        IOperationItem operationMultiplication = new MultiplicationOperationItem();
        expression.addItem(number1);
        expression.addItem(operationPlus);
        expression.addItem(number2);
        expression.addItem(operationMultiplication);
        expression.addItem(number1);
        expression.listPolishExpression();
        assertEquals(number1, expression.listPolishExpression().get(0));
        assertEquals(number2, expression.listPolishExpression().get(1));
        assertEquals(number1, expression.listPolishExpression().get(2));
        assertEquals(operationMultiplication, expression.listPolishExpression().get(3));
        assertEquals(operationPlus, expression.listPolishExpression().get(4));
    }

    /**
     * 1+2*1 to  1 2 1 * +
     */
    @Test
    public void convertToPolishExpression12() {
        IArithmeticExpression expression = new ArithmeticExpression();
        NumberItem number1 = new NumberItem(1);
        NumberItem number2 = new NumberItem(2);
        NumberItem number3 = new NumberItem(3);
        IOperationItem operationPlus = new PlusOperationItem();
        IOperationItem operationMultiplication = new MultiplicationOperationItem();
        expression.addItem(number1);
        expression.addItem(operationPlus);
        expression.addItem(number2);
        expression.addItem(operationMultiplication);
        expression.addItem(number3);
        expression.listPolishExpression();
        assertEquals(number1, expression.listPolishExpression().get(0));
        assertEquals(number2, expression.listPolishExpression().get(1));
        assertEquals(number3, expression.listPolishExpression().get(2));
        assertEquals(operationMultiplication, expression.listPolishExpression().get(3));
        assertEquals(operationPlus, expression.listPolishExpression().get(4));
    }

    /**
     * 1+2*1-2+1 to  1 2 1 * + 2 - 1 +
     */
    @Test
    public void convertToPolishExpression6() {
        IArithmeticExpression expression = new ArithmeticExpression();
        NumberItem number1 = new NumberItem(1);
        NumberItem number2 = new NumberItem(2);
        IOperationItem operationPlus = new PlusOperationItem();
        IOperationItem operationMinus = new MinusOperationItem();
        IOperationItem operationMultiplication = new MultiplicationOperationItem();
        expression.addItem(number1);
        expression.addItem(operationPlus);
        expression.addItem(number2);
        expression.addItem(operationMultiplication);
        expression.addItem(number1);
        expression.addItem(operationMinus);
        expression.addItem(number2);
        expression.addItem(operationPlus);
        expression.addItem(number1);
        assertEquals(number1, expression.listPolishExpression().get(0));
        assertEquals(number2, expression.listPolishExpression().get(1));
        assertEquals(number1, expression.listPolishExpression().get(2));
        assertEquals(operationMultiplication, expression.listPolishExpression().get(3));
        assertEquals(operationPlus, expression.listPolishExpression().get(4));
        assertEquals(number2, expression.listPolishExpression().get(5));
        assertEquals(operationMinus,expression.listPolishExpression().get(6));
        assertEquals(number1, expression.listPolishExpression().get(7));
        assertEquals(operationPlus, expression.listPolishExpression().get(8));
    }

    /**
     * 1+2*1-2*1 to  1 2 1 * + 2 1 * -
     */
    @Test
    public void convertToPolishExpression7() {
        IArithmeticExpression expression = new ArithmeticExpression();
        NumberItem number1 = new NumberItem(1);
        NumberItem number2 = new NumberItem(2);
        IOperationItem operationPlus = new PlusOperationItem();
        IOperationItem operationMinus = new MinusOperationItem();
        IOperationItem operationMultiplication = new MultiplicationOperationItem();
        expression.addItem(number1);
        expression.addItem(operationPlus);
        expression.addItem(number2);
        expression.addItem(operationMultiplication);
        expression.addItem(number1);
        expression.addItem(operationMinus);
        expression.addItem(number2);
        expression.addItem(operationMultiplication);
        expression.addItem(number1);
        assertEquals(number1, expression.listPolishExpression().get(0));
        assertEquals(number2, expression.listPolishExpression().get(1));
        assertEquals(number1, expression.listPolishExpression().get(2));
        assertEquals(operationMultiplication,expression.listPolishExpression().get(3));
        assertEquals(operationPlus, expression.listPolishExpression().get(4));
        assertEquals(number2, expression.listPolishExpression().get(5));
        assertEquals(number1, expression.listPolishExpression().get(6));
        assertEquals(operationMultiplication,expression.listPolishExpression().get(7));
        assertEquals(operationMinus, expression.listPolishExpression().get(8));
    }

    /**
     * 1+2*1*2*1 to  1 2 1 * 2 * 1 * +
     */
    @Test
    public void convertToPolishExpression8() {
        IArithmeticExpression expression = new ArithmeticExpression();
        NumberItem number1 = new NumberItem(1);
        NumberItem number2 = new NumberItem(2);
        IOperationItem operationPlus = new PlusOperationItem();
        IOperationItem operationMultiplication = new MultiplicationOperationItem();
        expression.addItem(number1);
        expression.addItem(operationPlus);
        expression.addItem(number2);
        expression.addItem(operationMultiplication);
        expression.addItem(number1);
        expression.addItem(operationMultiplication);
        expression.addItem(number2);
        expression.addItem(operationMultiplication);
        expression.addItem(number1);
        assertEquals(number1, expression.listPolishExpression().get(0));
        assertEquals(number2, expression.listPolishExpression().get(1));
        assertEquals(number1, expression.listPolishExpression().get(2));
        assertEquals(operationMultiplication,expression.listPolishExpression().get(3));
        assertEquals(number2, expression.listPolishExpression().get(4));
        assertEquals(operationMultiplication,expression.listPolishExpression().get(5));
        assertEquals(number1, expression.listPolishExpression().get(6));
        assertEquals(operationMultiplication,expression.listPolishExpression().get(7));
        assertEquals(operationPlus, expression.listPolishExpression().get(8));
    }

    /**
     * 1+2*1*2*1+4/2-3+4 to  1 2 1 * 2 * 1 * + 4 2 / + 3 - 4 +
     */
    @Test
    public void convertToPolishExpression9() {
        IArithmeticExpression expression = new ArithmeticExpression();
        NumberItem number1 = new NumberItem(1);
        NumberItem number2 = new NumberItem(2);
        NumberItem number3 = new NumberItem(3);
        NumberItem number4 = new NumberItem(4);
        IOperationItem operationPlus = new PlusOperationItem();
        IOperationItem operationMinus = new MinusOperationItem();
        IOperationItem operationMultiplication = new MultiplicationOperationItem();
        IOperationItem operationDivision = new DivisionOperationItem();
        expression.addItem(number1);
        expression.addItem(operationPlus);
        expression.addItem(number2);
        expression.addItem(operationMultiplication);
        expression.addItem(number1);
        expression.addItem(operationMultiplication);
        expression.addItem(number2);
        expression.addItem(operationMultiplication);
        expression.addItem(number1);
        expression.addItem(operationPlus);
        expression.addItem(number4);
        expression.addItem(operationDivision);
        expression.addItem(number2);
        expression.addItem(operationMinus);
        expression.addItem(number3);
        expression.addItem(operationPlus);
        expression.addItem(number4);
        assertEquals(number1, expression.listPolishExpression().get(0));
        assertEquals(number2, expression.listPolishExpression().get(1));
        assertEquals(number1, expression.listPolishExpression().get(2));
        assertEquals(operationMultiplication,expression.listPolishExpression().get(3));
        assertEquals(number2, expression.listPolishExpression().get(4));
        assertEquals(operationMultiplication,expression.listPolishExpression().get(5));
        assertEquals(number1, expression.listPolishExpression().get(6));
        assertEquals(operationMultiplication,expression.listPolishExpression().get(7));
        assertEquals(operationPlus, expression.listPolishExpression().get(8));
        assertEquals(number4, expression.listPolishExpression().get(9));
        assertEquals(number2, expression.listPolishExpression().get(10));
        assertEquals(operationDivision, expression.listPolishExpression().get(11));
        assertEquals(operationPlus, expression.listPolishExpression().get(12));
        assertEquals(number3, expression.listPolishExpression().get(13));
        assertEquals(operationMinus, expression.listPolishExpression().get(14));
        assertEquals(number4, expression.listPolishExpression().get(15));
        assertEquals(operationPlus, expression.listPolishExpression().get(16));
    }


    /**
     * 1. 2+3-1  to 2 3 + 1 -
     */
    @Test
    public void convertPolishExpressionThreeNumber() {
        IArithmeticExpression expression = new ArithmeticExpression();
        NumberItem number1 = new NumberItem(2);
        NumberItem number2 = new NumberItem(3);
        NumberItem number3 = new NumberItem(1);
        IOperationItem operationPlus = new PlusOperationItem();
        IOperationItem operationMinus = new MinusOperationItem();
        expression.addItem(number1);
        expression.addItem(operationPlus);
        expression.addItem(number2);
        expression.addItem(operationMinus);
        expression.addItem(number3);
        Stack<IArithmeticExpression> stack = expression.convertToPolishExpression3();
        assertEquals(number1, stack.pop());
        assertEquals(number2, stack.pop());
        assertEquals(operationPlus, stack.pop());
        assertEquals(number3, stack.pop());
        assertEquals(operationMinus, stack.pop());
    }

    /**
     * 2. 2+3-1-1+2  to 2 3 + 1 - 1 - 2 +
     */
    @Test
    public void convertPolishExpressionFiveNumber() {
        IArithmeticExpression expression = new ArithmeticExpression();
        NumberItem number1 = new NumberItem(2);
        NumberItem number2 = new NumberItem(3);
        NumberItem number3 = new NumberItem(1);
        IOperationItem operationPlus = new PlusOperationItem();
        IOperationItem operationMinus = new MinusOperationItem();
        expression.addItem(number1);
        expression.addItem(operationPlus);
        expression.addItem(number2);
        expression.addItem(operationMinus);
        expression.addItem(number3);
        Stack<IArithmeticExpression> stack = expression.convertToPolishExpression3();
        assertEquals(number1, stack.pop());
        assertEquals(number2, stack.pop());
        assertEquals(operationPlus, stack.pop());
        assertEquals(number3, stack.pop());
        assertEquals(operationMinus, stack.pop());
    }

    /**
     * 3. 1*2+3      to 1 2 * 3 +
     */
    @Test
    public void convertPolishExpressionMultiplication() {
        IArithmeticExpression expression = new ArithmeticExpression();
        NumberItem number1 = new NumberItem(1);
        NumberItem number2 = new NumberItem(2);
        NumberItem number3 = new NumberItem(3);
        IOperationItem operationPlus = new PlusOperationItem();
        IOperationItem operationMultiplication = new MultiplicationOperationItem();
        expression.addItem(number1);
        expression.addItem(operationMultiplication);
        expression.addItem(number2);
        expression.addItem(operationPlus);
        expression.addItem(number3);
        Stack<IArithmeticExpression> stack = expression.convertToPolishExpression3();
        assertEquals(number1, stack.pop());
        assertEquals(number2, stack.pop());
        assertEquals(operationMultiplication, stack.pop());
        assertEquals(number3, stack.pop());
        assertEquals(operationPlus, stack.pop());
    }

    /**
     * 4. 1+2*3 to 1 2 3 * +
     */
    @Test
    public void convertPolishExpressionMultiplication2() {
        IArithmeticExpression expression = new ArithmeticExpression();
        NumberItem number1 = new NumberItem(1);
        NumberItem number2 = new NumberItem(2);
        NumberItem number3 = new NumberItem(3);
        IOperationItem operationPlus = new PlusOperationItem();
        IOperationItem operationMultiplication = new MultiplicationOperationItem();
        expression.addItem(number1);
        expression.addItem(operationPlus);
        expression.addItem(number2);
        expression.addItem(operationMultiplication);
        expression.addItem(number3);
        Stack<IArithmeticExpression> stack = expression.convertToPolishExpression3();
        assertEquals(number1, stack.pop());
        assertEquals(number2, stack.pop());
        assertEquals(number3, stack.pop());
        assertEquals(operationMultiplication, stack.pop());
        assertEquals(operationPlus, stack.pop());
    }

    /**
     * 5. 1+2*3-1+2 to 1 2 3 * + 1 - 2 +
     */
    @Test
    public void convertPolishExpressionTwoMultiplication() {
        IArithmeticExpression expression = new ArithmeticExpression();
        NumberItem number1 = new NumberItem(1);
        NumberItem number2 = new NumberItem(2);
        NumberItem number3 = new NumberItem(3);
        IOperationItem operationPlus = new PlusOperationItem();
        IOperationItem operationMinus = new MinusOperationItem();
        IOperationItem operationMultiplication = new MultiplicationOperationItem();
        expression.addItem(number1);
        expression.addItem(operationPlus);
        expression.addItem(number2);
        expression.addItem(operationMultiplication);
        expression.addItem(number3);
        expression.addItem(operationMinus);
        expression.addItem(number1);
        expression.addItem(operationPlus);
        expression.addItem(number2);
        Stack<IArithmeticExpression> stack = expression.convertToPolishExpression3();
        assertEquals(number1, stack.pop());
        assertEquals(number2, stack.pop());
        assertEquals(number3, stack.pop());
        assertEquals(operationMultiplication, stack.pop());
        assertEquals(operationPlus, stack.pop());
        assertEquals(number1, stack.pop());
        assertEquals(operationMinus, stack.pop());
        assertEquals(number2, stack.pop());
        assertEquals(operationPlus, stack.pop());
    }

    /**
     * 6. 1*2+3 to 1 2 * 3 +
     */
    @Test
    public void convertPolishExpression3() {
        IArithmeticExpression expression = new ArithmeticExpression();
        NumberItem number1 = new NumberItem(1);
        NumberItem number2 = new NumberItem(2);
        NumberItem number3 = new NumberItem(3);
        IOperationItem operationPlus = new PlusOperationItem();
        IOperationItem operationMultiplication = new MultiplicationOperationItem();
        expression.addItem(number1);
        expression.addItem(operationMultiplication);
        expression.addItem(number2);
        expression.addItem(operationPlus);
        expression.addItem(number3);
        Stack<IArithmeticExpression> stack = expression.convertToPolishExpression3();
        assertEquals(number1, stack.pop());
        assertEquals(number2, stack.pop());
        assertEquals(operationMultiplication, stack.pop());
        assertEquals(number3, stack.pop());
        assertEquals(operationPlus, stack.pop());
    }

    /**
     * 7. 2+1*2+3 to 2 1 2 * + 3 +
     */
    @Test
    public void convertPolishExpression4() {
        IArithmeticExpression expression = new ArithmeticExpression();
        NumberItem number1 = new NumberItem(1);
        NumberItem number2 = new NumberItem(2);
        NumberItem number3 = new NumberItem(3);
        IOperationItem operationPlus = new PlusOperationItem();
        IOperationItem operationMultiplication = new MultiplicationOperationItem();
        expression.addItem(number2);
        expression.addItem(operationPlus);
        expression.addItem(number1);
        expression.addItem(operationMultiplication);
        expression.addItem(number2);
        expression.addItem(operationPlus);
        expression.addItem(number3);
        Stack<IArithmeticExpression> stack = expression.convertToPolishExpression3();
        assertEquals(number2, stack.pop());
        assertEquals(number1, stack.pop());
        assertEquals(number2, stack.pop());
        assertEquals(operationMultiplication, stack.pop());
        assertEquals(operationPlus, stack.pop());
        assertEquals(number3, stack.pop());
        assertEquals(operationPlus, stack.pop());
    }
}