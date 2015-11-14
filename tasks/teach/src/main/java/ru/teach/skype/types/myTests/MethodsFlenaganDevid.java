package ru.teach.skype.types.myTests;

/**
 *
 */
public class MethodsFlenaganDevid {

    /**
     * numbers multiple 5 change to fizz,
     * numbers multiple 7 change to buzz,
     * numbers multiple 5 and 7 change fizzbuzz
     */
    public void fizzBuzz(){
        for (int i = 1; i <= 100; i++){
            if((i % 5) == 0 && (i % 7) == 0 ){
                System.out.print("fizzbuzz ");
            } else if ((i % 7) == 0) {
                System.out.print("buzz ");
            } else if ((i % 5) == 0) {
                System.out.print("fizz ");
            } else {
                System.out.print(i + " ");
            }
        }
    }

    /**
     * Fibonacci number
     */
    public void fibonacci () {
        int n0 = 1, n1 = 1, n2;
        System.out.print(n0 + " " + n1 + " ");
        for (int i = 0; i < 18 ; i++){
            n2 = n0 + n1;
            System.out.print(n2 + " ");
            n0 = n1;
            n1 = n2;
        }
    }

    public void fizzBuzzSwitch() {
        for (int i = 0; i <= 100; i++ ){
            switch(i % 35){
                case 0:
                    System.out.print("fizzbruzz");
                    break;
            }
        }
    }

}
