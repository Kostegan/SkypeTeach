package ru.teach.skype.calculator.arithmetic.expression.items.operation;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 *
 */
public class OperationFactoryTest {
    @Test
    public void operationFactory() {
        char plusOperation = '+';
        char minusOperation = '-';
        char divisionOperation = '/';
        char multiplicationOperation = '*';
        assertEquals("Return operation: '+'", '+', OperationFactory.getOperation(plusOperation).getOperation());
        assertEquals("Return operation: '-'", '-', OperationFactory.getOperation(minusOperation).getOperation());
        assertEquals("Return operation: '/'", '/', OperationFactory.getOperation(divisionOperation).getOperation());
        assertEquals("Return operation: '*'", '*', OperationFactory.getOperation(multiplicationOperation).getOperation());
    }

    @Test
//            (expected = IllegalArgumentException.class)
    public void operationFactoryNotIndicate() {
        char symbolOperation = ')';
        String textException = "Operation not identifies: ). Available operations:[+, -, *, /]";
        assertEquals(textException,OperationFactory.getOperation(symbolOperation));
    }
}
