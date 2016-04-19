package ru.test.skype.test.animal;

import java.io.PrintStream;

/**
 *
 */
public class Main {
    public static void main(String[] args){
        Cat cat = new Cat();
        Dog dog = new Dog();
        cat.say();
        dog.say();
        Animal animal3 = new Cat();
//        Cat cat2 = new Animal();
        Animal a = dog;
        a.say("R..r...r..r..");
        Dog c =(Dog)a;
        c.say();
        PrintStream ps = System.out;
        ps.println("aaa");

    }
}
