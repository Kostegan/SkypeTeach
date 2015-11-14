package ru.teach.skype.calculator.arithmetic.expression.items.operation;

import ru.teach.skype.calculator.arithmetic.expression.items.IArithmeticExpressionItem;
import ru.teach.skype.calculator.arithmetic.expression.items.NumberItem;

/**
 *
 */
public interface IOperationItem extends IArithmeticExpressionItem {
    public int getPriority();

    public NumberItem calculateFromTwoValue(NumberItem number1, NumberItem number2);

    /**
     * @return specified operation.
     */
    public char getOperation();
}
