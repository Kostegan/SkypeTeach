package ru.task.periods.skype;

import java.util.Date;

/**
 * Class has one method - convertPeriod - which represents millisecond to years - months - days - hours - minutes - seconds
 */
public interface IPeriods {
    String convertPeriod(Date date1, Date date2);
    void calculatePeriod(Date date1, Date date2);
    long getPeriodInMsec();
}
