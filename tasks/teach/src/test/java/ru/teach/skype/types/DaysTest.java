package ru.teach.skype.types;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 *
 */
public class DaysTest {
    @Test
    public void getNextDayAfterThursday() {
        assertEquals("The next day is: ", 5, Days.getNextDay(4));
    }

    @Test
    public void getNextDayAfterSunday() {
        assertEquals("The next day is: ", 1, Days.getNextDay(7));
    }

    @Test
    public void saturdayIsWeekend() {
        assertTrue("Thursday is weekend", Days.isWeekend(6));
    }

    @Test
    public void thursdayIsWeekend() {
        assertFalse("Thursday is no weekend", Days.isWeekend(3));
    }


    @Test
    public void incorrectDayIsWeekend1() {
        Days.isWeekend(600);
    }
    @Test
    public void incorrectDayIsWeekend2() {
        Days.isWeekend(600);
    }

    @Test
    public void mondayIsNotWeekend() {
        assertFalse("Thursday is not weekend", Days.isWeekend(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void getNextDaySetValueIsMore() {
        Days.getNextDay(20);
    }

    @Test
    public void getNextDayForFridayName() {
        assertEquals("The next day is: ", "Saturday", Days.getNextDayName(5));
    }

    @Test
    public void getNextDayForSaturdayName() {
        assertEquals("The next day is: ", "Sunday", Days.getNextDayName(6));
    }
}
