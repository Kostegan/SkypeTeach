package ru.test.skype.com.spoj.tasks.prime.numbers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class was searches a prime numbers, between two specified digits.
 */
public class PrimeNumbers {

    public static void startCalculate() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] temp;
        String line;
        while ((line = reader.readLine()) != null) {
            temp = parseLine(line);
            if (temp[1] == 0) {
                definePrimeNumber(temp[0]);
            } else {
                findNumbers(temp[0], temp[1]);
            }
        }
    }


    public static void findNumbers(int firstNumber, int secondNumber) {
        for (int i = firstNumber; i <= secondNumber; i++) {
            if (calculatePrimeNumber(i) != 0) {
                System.out.println(i);
            }
        }
    }

    public static void definePrimeNumber(int number) {
        if (calculatePrimeNumber(number) != 0) {
            System.out.println(number);
        }
    }

    /**
     * @return a prime number or 0 if number is not prime
     */
    public static int calculatePrimeNumber(int number) {
        if (number == 1) {
            return 0;
        }
        for (int i = 3; i < number; i++) {
            int oc = number % i;
            if (oc == 0) {
                return 0;
            }
        }
        return number;
    }

    public static int[] parseLine(String line) {
        int[] numbers = new int[2];
//        String BRIEF_PATTERN = "(^\\d+)\\s(\\d+)";
        String PATTERN = "(^\\d+)(\\s(\\d+))*";
        Pattern p = Pattern.compile(PATTERN);
        Matcher matcher = p.matcher(line);
        if (matcher.find()) {
            numbers[0] = Integer.parseInt(matcher.group(1));
            if (matcher.group(2) != null) {
                numbers[1] = Integer.parseInt(matcher.group(3));
            }
        }
        return numbers;
    }
}

class mainPrimeNumber {
    public static void main(String[] args) throws Exception {
        int i = 37;
        Double d = Math.sqrt(i);
//        Long L = Math.incrementExact();

        System.out.println(d);
//        PrimeNumbers.startCalculate();
//        int[] numbers = PrimeNumbers.parseLine("25 35");
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println(numbers[i]);
//        }
//        PrimeNumbers.findNumbers(2, 25);
    }
}
