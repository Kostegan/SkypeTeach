package ru.downloader.skype.engine;

import javax.swing.*;
import java.awt.*;

/**
 *
 */
public class A {
    private String name = "Going...";
    public static String nameStatic = "Egor";
    public A(){}
    public A(String name){this.name = name;}
    public void go(){System.out.println(name);}
    public A read(){return new A("No going...");}

    public static void main(String[] args) {
        A a  = new A();
        System.out.println(nameStatic);
    }
}

class Test{
    public static void main(String[] args) {
        A a = new A();
        a.go();
        a.read().go();
        a.go();

        System.out.println(A.nameStatic);
    }
}

