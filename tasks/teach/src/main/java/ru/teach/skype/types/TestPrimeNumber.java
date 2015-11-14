package ru.teach.skype.types;

/**
 *
 */
public class TestPrimeNumber {
    public static void main(String[] args) {
        int a = 30;
        int d = 11;

        String c = "abc";
        long r = 55;

//        if (typeof (c) ){
//
//        } else if (c instanceof String) {
//
//        }

//        String t = c / r;

//        System.out.println(t);

        // a / b
        // a = q*b + r

        // 30 / 11
        // 30 = 2*11 + 8

        // r == 0

        // 30 / 10
        // 30 = 3*10 + 0
//
//        int c = a % d;
//
//        System.out.println("c = a % d: " + c);

//        primeNumber(21);

    }



    public static boolean primeNumber(long value){
        long x;
        for (long i = value; i >= 1; i--) {
            i--;
            x = value % i;
            if (x == 0){
                System.out.println("Число не простое :" + value +" "+ x);
                return false;
            }
            else{
                System.out.println("Число простое");

            }
        }
        return true;

    }
}





