package ru.test.skype.test.life;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 */
public class Main21 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        while (fined(s)) {
            System.out.println(s);
            s = reader.readLine();
        }
    }

    public static boolean fined(String s) {
        int i = Integer.parseInt(s);
        return i != 42;
    }
}
