package ru.teach.skype.calculator.arithmetic.expression;

import ru.teach.skype.calculator.arithmetic.expression.items.IArithmeticExpressionItem;

import java.util.List;
import java.util.Stack;

/**
 *
 */
public interface IArithmeticExpression {
    /**
     * @return array items
     */
    public List<IArithmeticExpressionItem> getItems();

    /**
     * add arithmetic expression to calculator
     * @param item arithmetic expression which added
     */
    public void addItem(IArithmeticExpressionItem item);

    /**
     * @param index element which must return
     * @return element array by specified index
     */
    public IArithmeticExpressionItem getIndexItem(int index);

    /**
     * check element on validate
     * @throws ArithmeticExpressionException if list contains null
     * @throws ArithmeticExpressionException if arithmetic expression have less three elements
     * @throws ArithmeticExpressionException if last element not numberItem
     */
    public void validate() throws ArithmeticExpressionException;

    /**
     * convert arithmetic expression to polish expression
     * @return polish expression
     */
    public Stack convertToPolishExpression();

    public Stack convertToPolish1();

    public Stack convertToPolishExpression3();

    public List listPolishExpression();
}
