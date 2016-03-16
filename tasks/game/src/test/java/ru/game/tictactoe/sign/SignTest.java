package ru.game.tictactoe.sign;

import org.junit.Test;
import static  org.junit.Assert.*;
/**
 *
 */
public class SignTest {
    @Test
    public void createToeSign(){
        Sign toe = Sign.TOE;
        assertEquals("Sign name: ","TOE",toe.name());
    }

    @Test
    public void createCroosSign(){
        Sign croos = Sign.CROOS;
        assertEquals("Sign name: ","CROOS",croos.name());
    }
}
