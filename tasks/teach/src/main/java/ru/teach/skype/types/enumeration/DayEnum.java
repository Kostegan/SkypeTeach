package ru.teach.skype.types.enumeration;

import java.util.EnumMap;
import java.util.Map;

/**
 *
 */
public enum DayEnum {
    MONDAY(false) {
        @Override
        public boolean isHard() {
            return true;
        }
    },
    TUESDAY(false),
    WEDNESDAY(false),
    THURSDAY(false),
    FRIDAY(false),
    SATURDAY(true),
    SUNDAY(true);

    private final boolean weekend;

    DayEnum(boolean weekend) {
        this.weekend = weekend;
    }

    public boolean isWeekend() {
        return weekend;
    }

    public boolean isHard() {
        return false;
    }

    public static void main(String[] args) {
        DayEnum day = DayEnum.MONDAY;
        System.out.println(day.name());

        System.out.println("MONDAY: " + MONDAY.ordinal());
        System.out.println("SUNDAY: " + SUNDAY.ordinal());

        System.out.println(SUNDAY.compareTo(MONDAY));

        day = SUNDAY;
        System.out.println(day.name() + " - isWeekend: " + day.isWeekend());

        Map<DayEnum, String> map = new EnumMap<>(DayEnum.class);

        switch(day) {

            case MONDAY:
                System.out.println("Hello");
                break;
            case TUESDAY:
                break;
            case WEDNESDAY:
                break;
            case THURSDAY:
                break;
            case FRIDAY:
                break;
            case SATURDAY:
                break;
            case SUNDAY:
                break;
        }
    }
}
