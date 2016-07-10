package ru.trafficlight;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 *
 */
public class TrafficLightTest {
    private ITrafficLight createTrafficLight(){
        return new TrafficLight();
    }

    @Test
    public void checkInvalidTime(){
        ITrafficLight trafficLight = createTrafficLight();
        trafficLight.defineColor(-34);
    }
    @Test
    public void checkOnGreenColorTimeAtZero(){
        ITrafficLight trafficLight = createTrafficLight();
        assertEquals("Color is a: ", "Green", trafficLight.defineColor(0).toString());
    }

    @Test
    public void checkOnGreenColorTimeAtOne(){
        ITrafficLight trafficLight = createTrafficLight();
        assertEquals("Color is a: ", "Green", trafficLight.defineColor(1).toString());
    }


    @Test
    public void checkOnGreenColorFifteenth(){
        ITrafficLight trafficLight = createTrafficLight();
        assertEquals("Color is a: ", "Yellow", trafficLight.defineColor(15).toString());
    }

    @Test
    public void checkOnGreenColorTimeAtTwoHour(){
        ITrafficLight trafficLight = createTrafficLight();
        assertEquals("Color is a: ", "Green", trafficLight.defineColor(120).toString());
    }

    @Test
    public void checkOnYellowColorTimeAtOne(){
        ITrafficLight trafficLight = createTrafficLight();
        assertEquals("Color is a: ", "Green", trafficLight.defineColor(2).toString());
    }

    @Test
    public void checkOnYellowColorTimeAtFive(){
        ITrafficLight trafficLight = createTrafficLight();
        assertEquals("Color is a: ", "Yellow", trafficLight.defineColor(5).toString());
    }

    @Test
    public void checkOnYellowColorSeventeenth(){
        ITrafficLight trafficLight = createTrafficLight();
        assertEquals("Color is a: ", "Red", trafficLight.defineColor(17).toString());
    }

    @Test
    public void checkOnYellowColorTimeAtTwoHour(){
        ITrafficLight trafficLight = createTrafficLight();
        assertEquals("Color is a: ", "Green", trafficLight.defineColor(122).toString());
    }

    @Test
    public void checkOnYellowColorTimeAtSix(){
        ITrafficLight trafficLight = createTrafficLight();
        assertEquals("Color is a: ", "Red", trafficLight.defineColor(6).toString());
    }

    @Test
    public void checkOnRedColorTimeAtNine(){
        ITrafficLight trafficLight = createTrafficLight();
        assertEquals("Color is a: ", "Red", trafficLight.defineColor(9).toString());
    }

    @Test
    public void checkOnRedColorSeventeenth(){
        ITrafficLight trafficLight = createTrafficLight();
        assertEquals("Color is a: ", "Green", trafficLight.defineColor(20).toString());
    }

    @Test
    public void checkOnYellowRedColorTimeAtTwoHour(){
        ITrafficLight trafficLight = createTrafficLight();
        assertEquals("Color is a: ", "Yellow", trafficLight.defineColor(125).toString());
    }



}
