package ru.teach.skype.types;

/**
 *
 */
public class CyclesTeach {
    public static void main(String[] args) {
        foreachTeach();

    }

    private static void whileTeach() {
        int x = -1;

        System.out.println("While tests: ");
        while (x >= 0) {
            System.out.println(x);
            x--;
        }
    }

    private static void doWhileTeach() {
        int x = -1;

        System.out.println("Do While tests: ");
        do {
            System.out.println(x);
            x--;
        }  while (x >= 0);
    }

    private static void forTeach() {
        int x = 10;

        System.out.println("For tests: ");

        for (int i = x; i >= 0; i--) {
            System.out.println(i);
        }
    }

    private static void foreachTeach() {
        int[] array = {10, 100, 500, 9000};

        System.out.println("For-each tests: ");

//        for (int i=0; i<array.length; i++) {
//            System.out.println(array[i]);
//        }

        for (int element : array) {
            System.out.println(element);
        }
    }
}

