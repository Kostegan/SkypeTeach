package ru.trafficlight;

import ru.trafficlight.light.Light;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        ITrafficLight light = new Light();
        light.printColorByMinute();
    }
}





