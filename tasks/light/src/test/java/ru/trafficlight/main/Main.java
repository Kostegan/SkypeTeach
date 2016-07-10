package ru.trafficlight.main;

import ru.trafficlight.ITrafficLight;
import ru.trafficlight.TrafficLight;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        ITrafficLight trafficLight = new TrafficLight();
        trafficLight.printColor();
    }
}
