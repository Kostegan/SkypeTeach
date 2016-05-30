package ru.test.skype.test.constructor;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        A a = new A();
        B b = new B("Test message!!!");


        A a2 = b;
        b =(B) a2;
        b = (B) a;
        System.out.println(a);

    }
}
