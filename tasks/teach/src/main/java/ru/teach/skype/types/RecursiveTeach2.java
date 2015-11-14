package ru.teach.skype.types;

/**
 *
 */
public class RecursiveTeach2 {
    public static void main(String[] args){
//        for(int i = 0; i <= 10; i++) {
//            printNumber(i);
//        }
        printNumber(10);
    }

    private static void printNumber(int number){
        if(number!=0){
            printNumber(number-1);
        }
        System.out.println(number);
    }
}
