package ru.trafficlight;

import ru.trafficlight.color.Color;

/**
 * Class can show a color at the specified time.
 */
public interface ITrafficLight {

    /**
     * Defines a glow color in a specified time.
     * @param time in which need  receive a color.
     * @return object color.
     */
    Color defineColor(int time);


    void printColor();
}
