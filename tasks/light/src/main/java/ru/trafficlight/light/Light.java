package ru.trafficlight.light;

import ru.trafficlight.ITrafficLight;
import ru.trafficlight.light.color.Color;

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
    public void setCurrentTime(int currentTime) {
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

    @Override
    public String showColorByMin(int min) {
        setCurrentTime(min);
        return currentColor.name();
    }
}
