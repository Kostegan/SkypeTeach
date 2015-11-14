package ru.teach.skype.work;

import javax.swing.*;

/**
 *
 */
public class HelloWorld extends JFrame {
    public HelloWorld(){
        setSize(200,100);
        setTitle("Hello World");

        setVisible(true);
    }
    public static void main(String[] args){
        HelloWorld helloWorld = new HelloWorld();
    }
}
