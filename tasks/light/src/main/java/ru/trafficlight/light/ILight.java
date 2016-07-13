package ru.trafficlight.light;

import ru.trafficlight.ITrafficLight;
import ru.trafficlight.light.color.Color;

/**
 *  Represents methods(get/set color and time) for work with Light.
 */
public interface ILight extends ITrafficLight {
    void setCurrentTime(int currentTime);
    int getCurrentTime();
    Color getCurrentColor();
}
