package ru.test.skype.test.life;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 */
public class Life {

    public static void printNumber(){
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner;
        boolean marker = false;
        while(!marker){
            scanner = new Scanner(System.in);
            int i =Integer.parseInt(scanner.nextLine());
            if(i!=42){
                numbers.add(i);
            } else {
                marker = true;
            }
        }
        for(Integer i : numbers){
            System.out.println(i);
        }
    }

}

class Main2 {
    public static void main(String[] args) {
        Life.printNumber();
    }
}




