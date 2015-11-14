package ru.teach.skype.types.jf;

import javax.swing.*;

/**
 * Test class, he is show how work the JFrame class
 */
public class HelloWorld extends JFrame {
    public HelloWorld(){
        setSize(1200,300);
        setTitle("HelloWorld");
        setVisible(true);
        setDefaultCloseOperation(2);
        JButton myButton = new JButton("Click here...");
        add(myButton);
    }

    public static void main(String[] args){
        new HelloWorld();
    }
}
