package ru.teach.skype.types.myTests;

/**
 *
 */
public class Fibonacci {
    int cycle;

    public Fibonacci(int i){
        cycle = i;
    }
    public void countFibonacci(){
        int n1, n2 , n3;
        n1 = 1;
        n2 = 1;
        System.out.println(n1 + ",\n" + n2 + ",");
        int j = cycle;
        for (int i = 0; i <= j; i++){
            n3 = n1 + n2;
            if(i != j) {
                System.out.println(n3 + ", ");
            } else {
                System.out.println(n3 + ".");
            }
            n1 = n2;
            n2 = n3;
            i++;
        }

    }

    public static void main(String[] args){
        Fibonacci fib = new Fibonacci(45);
        fib.countFibonacci();
    }

}
