package ru.teach.skype.types;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 *
 */
public class TestTeachTest {

    /**
     * 1. str = null - exception
     * 2. str = empty - 0
     * 3. str = number - number
     * 4. str = any_string - hash(any_string)
     */

    @Test(expected = Exception.class)
    public void generateIdWithNullStr() {
        TestTeach teach = new TestTeach();
        long id = teach.generateId(null);

    }

    @Test
    public void generateIdWithEmptyStr() {
        TestTeach teach = new TestTeach();
        long id = teach.generateId("");
        assertEquals(0, id);
    }

    @Test
    public void generateIdWithNumberStr() {
        TestTeach teach = new TestTeach();
        long id = teach.generateId("456");
        assertEquals(456, id);
    }

    @Test
    public void generateIdWithAnyStr() {
        TestTeach teach = new TestTeach();
        long id = teach.generateId("sajkjfdsds");
        assertEquals("sajkjfdsds".hashCode(), id);
    }

}
