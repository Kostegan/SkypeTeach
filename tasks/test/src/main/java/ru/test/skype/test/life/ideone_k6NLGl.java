package ru.test.skype.test.life;/* package whatever; // don't place package name! */

import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = reader.readLine())!= null||s.startsWith("42"))
            System.out.println(s);
    }

    public static boolean fined(String s) {
        int i = Integer.parseInt(s);
        return i != 42;
    }
}