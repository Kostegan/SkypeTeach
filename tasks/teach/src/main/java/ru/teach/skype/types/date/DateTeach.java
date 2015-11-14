package ru.teach.skype.types.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 */
public class DateTeach {
    public static void main(String[] args) throws Exception {
        long currentTime = System.currentTimeMillis(); // number of milliseconds since 1 Jan 1970 (epoch)
        System.out.println(currentTime);

        long currentTimeNano = System.nanoTime();
        System.out.println(currentTimeNano);

        Date date1 = new Date();
        System.out.println(date1);

        Date date2 = new Date(currentTime-1000);
        System.out.println(date2);

        System.out.println(date1.compareTo(date2));


        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTime);
        System.out.println("year: " + calendar.get(Calendar.YEAR));
        System.out.println("day of week: " + (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.TUESDAY));
        calendar.set(Calendar.MONTH, Calendar.FEBRUARY);
        System.out.println(calendar.getTime());

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(date1));
        String str = "2013-08-31 15:23:44";
        Date date3 = sdf.parse(str);
        calendar.setTime(date3);
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));

        long in5Days = currentTime + 5*60*60*1000;
        // DateTime dt...; dt = dt.addDays(5)
    }
}
