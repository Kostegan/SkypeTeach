package ru.teach.skype.types.my.tests.factorial;

import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 */
public class UITest {

    @Test
    public void calculateFactorialForEach(){
        IUI factorial = new UI();
        assertEquals("Factorial number: 9", 120, factorial.calculateFactorialForEach(5));
    }

    @Test
    public void calculateFactorialRecursive(){
        IUI factorial = new UI();
        assertEquals("Factorial number: 5",120,factorial.calculateFactorialRecursive(5));
    }
}
