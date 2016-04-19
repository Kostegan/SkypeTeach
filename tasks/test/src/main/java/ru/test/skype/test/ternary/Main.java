package ru.test.skype.test.ternary;

/**
 *
 */
public class Main {
    public static int calRemainder(int i){
        int result = i%2;
        if(result >0){
            return i;
        } else {
            return 0;
        }
    }

    public static int calRemainderTernary(int i){
        return   i%2<1 ? i : 0;
    }

    public static void main(String[] args){
        System.out.println(Main.calRemainder(23));
        System.out.println(Main.calRemainderTernary(25));
    }
}
