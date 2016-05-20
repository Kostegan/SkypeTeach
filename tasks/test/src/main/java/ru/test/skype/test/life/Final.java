package ru.test.skype.test.life;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 */
public class Final {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = reader.readLine())!= null && !(s.startsWith("42")))
            System.out.println(s);
    }
}
