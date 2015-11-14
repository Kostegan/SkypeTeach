package ru.teach.skype.calculator;

import ru.teach.skype.calculator.arithmetic.expression.items.NumberItem;

/**
 *
 */
public class CalculatorResult {
    NumberItem result = new NumberItem();

    public NumberItem getResult() {
        return result;
    }

    public void setResult(NumberItem result) {
        this.result = result;
    }
}
