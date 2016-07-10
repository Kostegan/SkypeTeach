package ru.trafficlight;

import ru.trafficlight.color.Color;
import ru.trafficlight.exception.InvalidTimeException;

import java.util.Scanner;

/**
 *
 */
public class TrafficLight implements ITrafficLight {

    public TrafficLight() {
    }


    @Override
    public Color defineColor(int time) {
        checkTimeOnValid(time);
        return defineColorByTime(optimizesTime(time));
    }

    private void checkTimeOnValid(int time) {
        if (time < 0) {
//            throw new InvalidTimeException("Value a specified time: "+time+" in invalid. Value must be positive numbers");
            System.out.println(" Value must be positive numbers");
        }
    }

    /**
     * Parses a specified time, delete all digits except a last.
     * @param time which will be parse.
     * @return a last digit.
     */
    private int optimizesTime(int time){
        String str = time+"";
        str = str.substring(str.length()-1);
        return Integer.parseInt(str);
    }

    /**
     * Define a color in a specified time.
     * @param time
     * @return
     */
    private Color defineColorByTime(int time) {
        Color color;
        if (time <= 2) {
            color = Color.Green;
        } else if (time <= 5) {
            color = Color.Yellow;
        }else {
            color = Color.Red;
        }
        return color;
    }

    @Override
    public void printColor() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter minute: ");
        System.out.println("Traffic light has a \""+defineColor(sc.nextInt()).toString()+"\" color.");
    }
}
