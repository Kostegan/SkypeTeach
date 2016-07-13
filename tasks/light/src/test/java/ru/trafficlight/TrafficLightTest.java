package ru.trafficlight;
import org.junit.Test;
import ru.trafficlight.light.exception.InvalidTimeException;

import static org.junit.Assert.*;

/**
 *
 */
public class TrafficLightTest {
    private ITrafficLight createTrafficLight(){
        return new TrafficLight();
    }

    @Test
    public void checkInvalidTime()throws InvalidTimeException {
        ITrafficLight trafficLight = createTrafficLight();
        trafficLight.showColorByMin(-34);
    }
    @Test
    public void checkOnGreenColorTimeAtZero()throws InvalidTimeException{
        ITrafficLight trafficLight = createTrafficLight();
        assertEquals("Color is a: ", "Green", trafficLight.showColorByMin(0).toString());
    }

    @Test
    public void checkOnGreenColorTimeAtOne()throws InvalidTimeException{
        ITrafficLight trafficLight = createTrafficLight();
        assertEquals("Color is a: ", "Green", trafficLight.showColorByMin(1).toString());
    }


    @Test
    public void checkOnGreenColorFifteenth()throws InvalidTimeException{
        ITrafficLight trafficLight = createTrafficLight();
        assertEquals("Color is a: ", "Yellow", trafficLight.showColorByMin(15).toString());
    }

    @Test
    public void checkOnGreenColorTimeAtTwoHour()throws InvalidTimeException{
        ITrafficLight trafficLight = createTrafficLight();
        assertEquals("Color is a: ", "Green", trafficLight.showColorByMin(120).toString());
    }

    @Test
    public void checkOnYellowColorTimeAtOne()throws InvalidTimeException{
        ITrafficLight trafficLight = createTrafficLight();
        assertEquals("Color is a: ", "Green", trafficLight.showColorByMin(2).toString());
    }

    @Test
    public void checkOnYellowColorTimeAtFive()throws InvalidTimeException{
        ITrafficLight trafficLight = createTrafficLight();
        assertEquals("Color is a: ", "Yellow", trafficLight.showColorByMin(5).toString());
    }

    @Test
    public void checkOnYellowColorSeventeenth()throws InvalidTimeException{
        ITrafficLight trafficLight = createTrafficLight();
        assertEquals("Color is a: ", "Red", trafficLight.showColorByMin(17).toString());
    }

    @Test
    public void checkOnYellowColorTimeAtTwoHour()throws InvalidTimeException{
        ITrafficLight trafficLight = createTrafficLight();
        assertEquals("Color is a: ", "Green", trafficLight.showColorByMin(122).toString());
    }

    @Test
    public void checkOnYellowColorTimeAtSix()throws InvalidTimeException{
        ITrafficLight trafficLight = createTrafficLight();
        assertEquals("Color is a: ", "Red", trafficLight.showColorByMin(6).toString());
    }

    @Test
    public void checkOnRedColorTimeAtNine()throws InvalidTimeException{
        ITrafficLight trafficLight = createTrafficLight();
        assertEquals("Color is a: ", "Red", trafficLight.showColorByMin(9).toString());
    }

    @Test
    public void checkOnRedColorSeventeenth()throws InvalidTimeException{
        ITrafficLight trafficLight = createTrafficLight();
        assertEquals("Color is a: ", "Green", trafficLight.showColorByMin(20).toString());
    }

    @Test
    public void checkOnYellowRedColorTimeAtTwoHour()throws InvalidTimeException{
        ITrafficLight trafficLight = createTrafficLight();
        assertEquals("Color is a: ", "Yellow", trafficLight.showColorByMin(125).toString());
    }



}
