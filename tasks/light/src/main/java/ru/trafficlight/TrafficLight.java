package ru.trafficlight;

import ru.trafficlight.light.color.Color;
import ru.trafficlight.light.exception.InvalidTimeException;

/**
 *
 */
public class TrafficLight implements ITrafficLight {

    public TrafficLight() {
    }


//
//    private Color showColorByMin(int time) throws InvalidTimeException {
//        checkTimeOnValid(time);
//        return defineColorByTime(optimizesTime(time));
//    }

    /**
     * Time must be a positive number.
     *
     * @param time which will be checked on a validity.
     * @throws InvalidTimeException if time is not a positive number.
     */
    private void checkTimeOnValid(int time) throws InvalidTimeException {
        if (time < 0) {
            throw new InvalidTimeException("Value a specified time: " + time + " is invalid. Value must be positive numbers.");
        }
    }

    /**
     * Parses a specified time, delete all digits except a last.
     *
     * @param time which will be parse.
     * @return a last digit.
     */
    private int optimizesTime(int time) {
        String str = time + "";
        str = str.substring(str.length() - 1);
        return Integer.parseInt(str);
    }

    /**
     * Define a color in a specified time.
     *
     * @param time
     * @return
     */
    private Color defineColorByTime(int time) {
        Color color;
        if (time <= 2) {
            color = Color.Green;
        } else if (time <= 5) {
            color = Color.Yellow;
        } else {
            color = Color.Red;
        }
        return color;
    }

    @Override
    public String showColorByMin(int time) {
        String colorName;
        try {
            checkTimeOnValid(time);
            defineColorByTime(time);
            return "";
        } catch (InvalidTimeException e) {
            e.printStackTrace();
        }
        return "Specified time must be positive numbers. ";

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter minute: ");
//        System.out.println("Traffic light has a \""+showColorByMin(sc.nextInt()).toString()+"\" color.");
//        return null;
    }


}
