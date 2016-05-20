package ru.test.skype.superTest;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        Male people1 = new Male("Ron",21,"Good");
        System.out.println("People1 has name: "+people1.getName()+","+'\n'+"his age is: "+people1.getAge()+","+'\n'+"and his mode: "+people1.getMode());
    }
}
