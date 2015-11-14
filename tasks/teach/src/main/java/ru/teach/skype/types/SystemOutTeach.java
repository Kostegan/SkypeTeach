package ru.teach.skype.types;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.PriorityQueue;

/**
 *
 */
public class SystemOutTeach {
    public static void main(String[] args) throws Exception {
        System.setOut(new PrintStream(new FileOutputStream("1.txt")));

        System.out.print("FirstLine\n\tSecondLine");
        System.out.println("\nThird line");


    }
}

