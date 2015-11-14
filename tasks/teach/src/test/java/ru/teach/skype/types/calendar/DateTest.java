package ru.teach.skype.types.calendar;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 */
public class DateTest {

    private IDate createDate(){
        return null;
    }

    @Test
    public void findCurrentDate(){
        IDate date = createDate();
        assertEquals("Current date is: 2000", 2000, date.getCurrentDate());
    }


    @Test
    public void findDayOfWeekByNumber(){
        IDate date = createDate();
        date.findDayOfWeek(0);
    }

}
