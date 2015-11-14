package ru.teach.skype.types;

import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 */
public class TestTeachTest2 {

    /**
     * 1. String = null - exception
     * 2. String = empty  - 0
     * 3. String number - number
     * 4. String any_string - hashcode(any_string)
     */

    @Test (expected = Exception.class)
    public void generateIdNull(){
        TestTeach2 teach = new TestTeach2();
        long g = teach.generateId(null);
    }

    @Test
    public void generateIdEmpty(){
        long g = new TestTeach2().generateId("");
        assertEquals(0,g);
    }

    @Test
    public void generateIdNumber(){
        long g = new TestTeach2().generateId("456");
        assertEquals(456, g);
    }

    @Test
    public void generateIdAny(){
        TestTeach2 teach = new TestTeach2();
        long g = teach.generateId("abc");
        assertEquals("abc".hashCode(),g);
    }


}
