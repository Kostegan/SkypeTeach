package ru.test.skype.test.life;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 */
public class Main3 {
    public static void main(String[] args) {
//        int[] number = {1,2,3,4,5,6,7,8,9,0,9,8,7,6,5,4,3,2,1,11,21,31,41,51,61,71,81,91,99,89,79,69,59,49,39,29,19,42,3,6,11};
//        Main.printNumber(Integer.pargs);
    }

    public static void printNumber(int[] number){
        boolean marker = false;
        int i=0;
        while(!marker){
            if(number[i]!=42 && i<number.length){
                System.out.println(number[i]);
                i++;
            } else{
                marker = true;
            }
        }
    }

//    public static void printNumber(int[] number){
//        boolean marker = false;
//        int i=0;
//        while(!marker){
//            if(number[i]!=42 && i<number.length){
//                System.out.println(number[i]);
//                i++;
//            } else{
//                marker = true;
//            }
//        }
//    }

}
