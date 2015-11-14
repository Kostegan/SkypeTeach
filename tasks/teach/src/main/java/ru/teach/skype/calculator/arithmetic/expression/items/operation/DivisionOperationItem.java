package ru.teach.skype.calculator.arithmetic.expression.items.operation;

import ru.teach.skype.calculator.arithmetic.expression.items.NumberItem;

/**
 *
 */
public class DivisionOperationItem extends AbstractOperationItem{
    public int priority = 11;
    private char division = '/';
    @Override
    public NumberItem calculateFromTwoValue(NumberItem number1, NumberItem number2) {
        checkNumbers(number1,number2);
        double result = number1.getNumber() / number2.getNumber();
        NumberItem number3 = new NumberItem(result);
        return number3;
    }
    public int getPriority(){
        return priority;
    }

    public char getOperation(){
        return division;
    }

    @Override
    public String toString(){
        return getOperation()+"";
    }
}
