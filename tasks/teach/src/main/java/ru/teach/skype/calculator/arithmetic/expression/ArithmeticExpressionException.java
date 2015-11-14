package ru.teach.skype.calculator.arithmetic.expression;

/**
 *
 */
public class ArithmeticExpressionException extends RuntimeException {
    public ArithmeticExpressionException() {
    }

    public ArithmeticExpressionException(String message) {
        super(message);
    }

    public ArithmeticExpressionException(String message, Throwable cause) {
        super(message, cause);
    }

    public ArithmeticExpressionException(Throwable cause) {
        super(cause);
    }
}
