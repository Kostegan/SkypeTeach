package ru.trafficlight.light.color;

import org.junit.Test;

import static org.junit.Assert.*;
/**
 *
 */
public class ColorTest {
    @Test
    public void createGreenColor(){
        Color color = Color.Green;
        assertEquals("Green has a glow time: ",2,color.getGlowTime());
    }

    @Test
    public void createYellowColor(){
        Color color = Color.Yellow;
        assertEquals("Green has a glow time: ", 3, color.getGlowTime());
    }

    @Test
         public void createRedColor(){
        Color color = Color.Red;
        assertEquals("Green has a glow time: ",5,color.getGlowTime());
    }
}
