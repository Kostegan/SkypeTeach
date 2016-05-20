package ru.task.periods.skype;

import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 */
public class PeriodArray implements IPeriods {
    long temp;

    Map<String,Integer> time = new TreeMap<>();

    public PeriodArray(){
    }

    @Override
    public String convertPeriod(Date date1, Date date2) {
        return null;
    }

    @Override
    public void calculatePeriod(Date date1, Date date2) {
        if (temp >= 1000) {
            temp = (temp - (temp % 1000)) / 1000;
            int second =(int) temp;
            time.put("Second",(Integer)second);
        }

    }

    @Override
    public long getPeriodInMsec() {
        return 0;
    }
}
