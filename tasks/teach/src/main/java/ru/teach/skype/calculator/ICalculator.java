package ru.teach.skype.calculator;

import ru.teach.skype.calculator.arithmetic.expression.IArithmeticExpression;

/**
 *
 */
public interface ICalculator {
    /**
     * Принимает арифметическое выражение, производит вычисления и передает в результат,
     * если в expression передан ноль бросать NullPointerException
     * @param expression арифметическое выражение которое высчитываем
     * @return результат вычислений
     * @throws CalculatorException
     */
   public CalculatorResult calculate(IArithmeticExpression expression);

}
