package ru.teach.skype.calculator;

import ru.teach.skype.calculator.arithmetic.expression.IArithmeticExpression;
import ru.teach.skype.calculator.arithmetic.expression.items.IArithmeticExpressionItem;
import ru.teach.skype.calculator.arithmetic.expression.items.NumberItem;
import ru.teach.skype.calculator.arithmetic.expression.items.operation.IOperationItem;

import java.util.Stack;

/**
 *
 */
public class Calculator implements ICalculator {

    /**
     * Производит вычисление арифметического выражения, перед вычислением переводит выражение в польскую запись
     *
     * @param expression арифметическое выражение которое высчитываем
     * @return результат вычислений
     * @throws IllegalArgumentException if  arithmetic expression = null
     */
//    public CalculatorResult calculate(IArithmeticExpression expression) {
//        if (expression != null) {
//            expression.validate();
//            CalculatorResult result = new CalculatorResult();
//            Stack<IArithmeticExpressionItem> stack = expression.convertToPolish1();
//            while (stack.size() > 2) {
//                IArithmeticExpressionItem item = calculateTwoNumber(stack);
//                stack.push(item);
//            }
//            result.setResult((NumberItem) stack.pop());
//            return result;
//        }
//        throw new IllegalArgumentException("List contains null.");
//    }
    public CalculatorResult calculate(IArithmeticExpression expression) {
        if (expression != null) {
            expression.validate();
            Stack<IArithmeticExpressionItem> stack = expression.convertToPolishExpression3();
            CalculatorResult result = new CalculatorResult();
            result.setResult((NumberItem) calculateFromStack(stack));
            return result;

        } else {
            throw new IllegalArgumentException("List contains null.");
        }
    }


    /**
     * @param stack
     * @return
     */
    private IArithmeticExpressionItem calculateTwoNumber(Stack stack) {
        IOperationItem operation = (IOperationItem) stack.pop();
        NumberItem number1 = (NumberItem) stack.pop();
        NumberItem number2 = (NumberItem) stack.pop();
        return operation.calculateFromTwoValue(number1, number2);
    }

    private IArithmeticExpressionItem calculateTwoNumber(Stack stack, IOperationItem operation) {
        NumberItem number1 = (NumberItem) stack.pop();
        NumberItem number2 = (NumberItem) stack.pop();
        return operation.calculateFromTwoValue(number2, number1);
    }

    public IArithmeticExpressionItem calculateFromStack(Stack stack) {
        Stack<IArithmeticExpressionItem> buffer = new Stack();
        IArithmeticExpressionItem resultNumber;
        for (int i = 0; i < stack.size(); ) {
            if (stack.peek() instanceof NumberItem) {
                buffer.push((NumberItem) stack.pop());
            } else if (stack.peek() instanceof IOperationItem) {
                IOperationItem operation = (IOperationItem) stack.pop();
                buffer.push(calculateTwoNumber(buffer, operation));
            }
        }
        resultNumber = buffer.pop();
        return resultNumber;
    }
}
