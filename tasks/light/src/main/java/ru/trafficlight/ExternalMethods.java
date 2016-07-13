package ru.trafficlight;

import ru.trafficlight.light.Light;
import ru.trafficlight.light.color.Color;

import java.util.Scanner;

/**
 *
 */
public class ExternalMethods {
    public static void printColorByMinute() {
        ITrafficLight light = new Light();
//        System.out.println("Enter minute:");
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            System.out.println("Enter minute or Stop:");
            int min = scanner.nextInt();
            System.out.println(light.showColorByMin(min));
        }
    }
}

class Main2{

    public static void main(String[] args) {
        ExternalMethods.printColorByMinute();
    }
}
