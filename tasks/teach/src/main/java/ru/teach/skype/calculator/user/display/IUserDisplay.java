package ru.teach.skype.calculator.user.display;

import ru.teach.skype.calculator.CalculatorResult;

/**
 * In the class user can write a string.
 * String converted to arithmetic expression.
 */
public interface IUserDisplay {
    /**
     * Adds a string.
     *
     * @param str string which will be added
     */
    public void setExample(String str);


    /**
     * Method produces calculating.
     *
     * @return
     */
    public CalculatorResult calculate(String string);

    public void printCalculator();
}
