package ru.teach.skype.types.calendar;

/**
 * Class Date defines current date and calculates a week day for specified date.
 * Current date defined in a field currentDate. Calculation date will be started from the current date.
 */
public interface IDate {
    /**
     * @return current date.
     */
    public int getCurrentDate();

    /**
     * Converts a specified date from a string to the integer.
     * @param date
     * @return
     */
    public int convertStringDateToInteger(String date);
    public void findDayOfWeek(int number);
}
