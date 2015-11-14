package ru.teach.skype.calculator.arithmetic.expression.items.operation;

import ru.teach.skype.calculator.arithmetic.expression.items.NumberItem;

/**
 *
 */
public abstract class AbstractOperationItem implements IOperationItem {

    public boolean checkNumbers(NumberItem number1, NumberItem number2){
        if(number1 != null && number2 != null){
            return true;
        } else {
            throw new IllegalArgumentException("Value number is null");
        }
    }
}
