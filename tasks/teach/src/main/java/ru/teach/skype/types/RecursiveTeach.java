package ru.teach.skype.types;

/**
 *
 */
public class RecursiveTeach {
    // []
    // [main]
    // [printNumber, main]
    // [printNumber(9), printNumber(10), main]
    // [printNumber(9), printNumber(9), printNumber(10), main]
    // [printNumber(9), printNumber(9), printNumber(9), printNumber(10), main]

    public static void main(String[] args) {
//        for (int i=0; i<=10; i++) {
//            printNumber(i);
//        }
        printNumber(10);
//        f1();
    }

    // printNumber(10)
    // -> printNumber(9)
    //    -> printNumber(8)
    //       -> printNumber(7)
    //          -> printNumber(6)
    //             -> printNumber(5)
    //                -> printNumber(4)
    //                   -> printNumber(3)
    //                      -> printNumber(2)
    //                         -> printNumber(1)
    //                            -> printNumber(0)
    //                               0
    //                            -> 1
    //                         -> 2
    //                      -> 3
    //                   -> 4
    //                -> 5
    //             -> 6
    //          -> 7
    //       -> 8
    //    -> 9
    // -> 10


    // printNumber(10)
    // -> 10
    // -> printNumber(9)
    //    -> 9
    //    -> printNumber(8)
    //    ...

    private static void printNumber(int number) {
        System.out.println(number + (number == 1 ? StaticTeach.JANUARY : ""));
        if (number != 0) {
            printNumber(number-1);
        }
    }

    private static void f1() {
        f2();
    }

    private static void f2() {
        f3();
    }

    private static void f3() {
        throw new RuntimeException("Error in f3");
    }
}
