package ru.trafficlight;

import ru.trafficlight.light.Light;
import ru.trafficlight.light.exception.InvalidTimeException;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 */
public class ExternalMethodsTrafficLight {
    public static void printColorByMinute() throws InvalidTimeException {
        Scanner reader = new Scanner(System.in);
        try {
            ITrafficLight light = new Light();
            String exit = "no";
            while (!exit.equals("yes")) {
                System.out.println("Enter minute: ");
                try {
                    int minute = reader.nextInt();
                    System.out.println("On " + minute + " minute the color will be: " + light.showColorByMin(minute));
                    System.out.println("Exit: yes/no ");
                    exit = reader.next();
                } catch (InputMismatchException e) {
                    System.out.println("Minute must be a digit.");
                    exit = reader.next();
                }
            }
        } finally {
            reader.close();
        }
    }
}
