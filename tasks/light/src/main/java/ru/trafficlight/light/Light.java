package ru.trafficlight.light;

import ru.trafficlight.ITrafficLight;
import ru.trafficlight.light.color.Color;
import ru.trafficlight.light.exception.InvalidTimeException;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 */
public class Light implements ILight {
    private Color currentColor;
    private int currentTime;

    public Light() {
        currentTime = 0;
        setCurrentColor();
    }

    public Light(int currentTime) {
        this.currentTime = currentTime;
    }

    public Color getCurrentColor(){
        return currentColor;
    }

    public int getCurrentTime(){
        return  currentTime;
    }

    @Override
    public void setCurrentTime(int currentTime) throws InvalidTimeException {
        checkTimeOnValid(currentTime);
        this.currentTime = currentTime;
        setCurrentColor();
    }

    /**
     * For a quick search gets and parses currentTime and deletes all digits from currentTime except a last.
     * @return a last digit for a quick search.
     */
    private int optimizesTime() {
        String str = currentTime + "";
        str = str.substring(str.length() - 1);
        return Integer.parseInt(str);
    }

    private void setCurrentColor() {
        int getOptTime = optimizesTime();
        if (getOptTime <= 2) {
            currentColor = Color.Green;
        } else if (getOptTime < 5) {
            currentColor = Color.Yellow;
        } else {
            currentColor = Color.Red;
        }
    }

    /**
     * Time must be a positive number.
     *
     * @param time which will be checked on a validity.
     * @throws ru.trafficlight.light.exception.InvalidTimeException if time is not a positive number.
     */
    private void checkTimeOnValid(int time) throws InvalidTimeException {
        if (time < 0) {
            throw new InvalidTimeException("Value a specified time: " + time + " is invalid. Value must be positive numbers.");
        }
    }

    @Override
    public String showColorByMin(int min) throws InvalidTimeException {
        setCurrentTime(min);
        return currentColor.name();
    }

    @Override
    public void printColorByMinute() {
        Scanner reader = new Scanner(System.in);
        try {
            String exit = "no";
            while (!exit.equals("yes")) {
                System.out.println("Enter minute: ");
                try {
                    int minute = reader.nextInt();
                    setCurrentTime(minute);
                    System.out.println("On " + minute + " minute the color will be: " + currentColor.name());
                    System.out.println("----------------------");
                    System.out.println("Exit: yes/no ");
                    exit = reader.next();
                } catch (InputMismatchException e) {
                    System.out.println("Minute must be a digit.");
                    exit = reader.next();
                }
                catch (InvalidTimeException e){
                    System.out.println("Minute must be positive numbers");
                }
            }
        } finally {
            reader.close();
        }
    }

//    @Override
//    public void printColorByMinute() {
//        Scanner reader = new Scanner(System.in);
//        try {
//            ITrafficLight light = new Light();
//            String exit = "no";
//            while (!exit.equals("yes")) {
//                System.out.println("Enter minute: ");
//                try {
//                    int minute = reader.nextInt();
//                    System.out.println("On " + minute + " minute the color will be: " + light.showColorByMin(minute));
//                    System.out.println("----------------------");
//                    System.out.println("Exit: yes/no ");
//                    exit = reader.next();
//                } catch (InputMismatchException e) {
//                    System.out.println("Minute must be a digit.");
//                    exit = reader.next();
//                }
//            }
//        } finally {
//            reader.close();
//        }
//    }
}
