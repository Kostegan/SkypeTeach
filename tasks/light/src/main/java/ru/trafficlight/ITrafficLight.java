package ru.trafficlight;

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


    String showColorByMin(int min);
}
