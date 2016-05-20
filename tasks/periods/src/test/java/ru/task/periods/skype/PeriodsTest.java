package ru.task.periods.skype;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Date;

/**
 *
 */
public class PeriodsTest {
    private IPeriods createPeriod() {
        return new Periods();
    }

    @Test
    public void calculateSmallPeriod() {
        Date date1 = new Date(5000L);
        Date date2 = new Date(2000L);
        IPeriods period = createPeriod();
        assertEquals("Period is ","Period is: , 3 - second.",period.convertPeriod(date1, date2));
    }

    @Test
    public void calculateLargePeriod() {
        Date date1 = new Date(50000000000L);
        Date date2 = new Date(2000L);
        IPeriods period = createPeriod();
        String str = "Period is: 1 - year, 213 - days, 16 - hour, 53 - mins, 18 - second.";
        assertEquals("Period is ", str, period.convertPeriod(date1, date2));
    }

    @Test
    public void calculateNegativePeriod() {
        Date date1 = new Date(3000000000L);
        Date date2 = new Date(80000000000L);
        IPeriods period = createPeriod();
        String str = "Period is: 2 - year, 161 - days, 4 - hour, 53 - mins, 20 - second.";
        assertEquals("Period is ",str,period.convertPeriod(date1, date2));
    }

    @Test
    public void calculateZeroPeriod() {
        Date date1 = new Date();
        Date date2 = new Date();
        IPeriods period = createPeriod();
        assertEquals("Period is ","Period is: 0.",period.convertPeriod(date1, date2));
    }
}
