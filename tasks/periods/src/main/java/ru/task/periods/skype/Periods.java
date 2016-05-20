package ru.task.periods.skype;


import java.util.Date;

/**
 *
 */
public class Periods implements IPeriods {
    long periodInMsec = 0;

    private int second = 0;
    private int min = 0;
    private int hour = 0;
    private int day = 0;
    private int year = 0;
//    private int temp = 0;
    private long tempMsec = 0;

    /**
     * Calculates a period in milliseconds and writes to the field "periodInMsec".
     */

    public long getPeriodInMsec() {
        return periodInMsec;
    }

    public void calculatePeriod(Date date1, Date date2) {
        tempMsec = date1.getTime() - date2.getTime();
        if (tempMsec < 0) {
            tempMsec = tempMsec * (-1);
        }
    }

    public String convertPeriod(Date date1, Date date2) {
        int temp = 0;
        calculatePeriod(date1, date2);
        if (tempMsec >= 1000) {
            tempMsec = (tempMsec - (tempMsec % 1000)) / 1000;
            second = (int) tempMsec;
        }
        if (second >= 60) {
            temp = second;
            second = second % 60;
            min = (temp - second) / 60;
        }
        if (min >= 60) {
            temp = min;
            min = min % 60;
            hour = (temp - min) / 60;
        }
        if (hour >= 24) {
            temp = hour;
            hour = hour % 24;
            day = (temp - hour) / 24;
        }
        if (day >= 365) {
            temp = day;
            day = (day % 365);
            year = (temp - day) / 365;
        }
//        return "Period is: " + year + " - year, " + day + " - days, " + hour + " - hour, " + min + " - mins, " + second + " - second.";

        return "Period is: "+ printPeriod();
    }

    public String printPeriod() {
        StringBuilder sb = new StringBuilder();
        toStringBuilder(sb);
        return sb.toString() + ".";
    }


    public void toStringBuilder(StringBuilder sb) {
        if(tempMsec!=0) {
            if (year > 0) {
                sb.append(year + " - year");
            }
            if (day > 0) {
                sb.append(", ");
                sb.append(day + " - days");
            }
            if (hour > 0) {
                sb.append(", ");
                sb.append(hour + " - hour");
            }
            if (min > 0) {
                sb.append(", ");
                sb.append(min + " - mins");
            }
            if (second > 0) {
                sb.append(", ");
                sb.append(second + " - second");
            }
        } else {
            sb.append("0");
        }
    }
}
