package ru.trafficlight;

import ru.trafficlight.light.exception.InvalidTimeException;

/**
 * Class can show a color at the specified time.
 */
public interface ITrafficLight {

//    /**
//     * Defines a glow color in a specified time.
//     * @param time in which need  receive a color.
//     * @return object color.
//     */
//    Color showColorByMin(int time);


    String showColorByMin(int min) throws InvalidTimeException;

    /**
     * User writes a minute and  "TrafficLight" prints a color which will be shined in this minute.
     */
    void printColorByMinute();
}
