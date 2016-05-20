package ru.test.skype.test;

/**
 *
 */
public class Test {
    public static void main (String[] args){
        String temp = Singleton.getInstance().getName();
        System.out.println(temp);
        String temp2 = Singleton.getInstance().getName();
        System.out.println(temp2);
    }
}

class Singleton{
    private static Singleton instance = new Singleton();
    private String name = "First";
    private Singleton(){

    }

    public static Singleton getInstance(){
        return instance;
    }

    public String getName(){
        return name;
    }
}
