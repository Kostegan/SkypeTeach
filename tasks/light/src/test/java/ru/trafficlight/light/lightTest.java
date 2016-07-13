package ru.trafficlight.light;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 *
 */
public class lightTest {

    @Test
    public void getCurrentTime() {
        ILight light = new Light();
        assertEquals("Current time is: ", 0, light.getCurrentTime());
        light.setCurrentTime(23);
        assertEquals("Current time is: ", 23, light.getCurrentTime());
    }

    @Test
    public void getCurrentColor(){
        ILight light = new Light();
        assertEquals("Current color is: ","Green",light.getCurrentColor().toString());
        light.setCurrentTime(3);
        assertEquals("Current color is: ","Yellow",light.getCurrentColor().toString());
    }
}
