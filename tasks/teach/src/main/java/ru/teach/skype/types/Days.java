package ru.teach.skype.types;

/**
 * Defines days of week
 */
public class Days {

    /**
     * Name days of week.
     */
    public static String[] day = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

    /**
     * Searches next day.
     */
    public static int getNextDay(int i) {
        validateNumberDay(i);
        if (i < day.length) {
            return i + 1;
        } else {
            return 1;
        }
    }

    public static void validateNumberDay(int i) {
        if (i < 1 || i > 7) {
            throw new IllegalArgumentException("The value: " + i + " is incorrect. The value mast be from 1 to 7");
        }
    }

//    public static void validateNumberDay2(int i) {
//        if (i > 0 && i <= 7) {
//        } else {
//            throw new IllegalArgumentException("The value: " + i + " is incorrect. The value mast be from 1 to 7");
//        }
//    }

    public static String getNextDayName(int i) {
        return day[getNextDay(i - 1)];
    }

    public static boolean isWeekend(int i) {
        validateNumberDay(i);
        return i > 5;
    }
}