package ru.teach.skype.types;

import java.util.Scanner;

/**
 *
 */
public class ConsoleReadTeach {
    public static void main(String[] args) throws Exception {

        System.out.println("Enter string:");
        Scanner scanner = new Scanner(System.in);
        String row = scanner.nextLine();
        System.out.println();
        System.out.println("You entered: " + row);
    }
}
