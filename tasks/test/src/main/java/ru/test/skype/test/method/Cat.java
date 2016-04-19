package ru.test.skype.test.method;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 */
public class Cat extends Frame {
    private String name;
    private int length;
    private int height;

    public Cat() {
    }

    public Cat(String name, int length, int height) {
        this.name = name;
        this.length = length;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void isRun(int speed){
        System.out.println("Cat is run, the cat speed is :"+speed+" km/h.");
    }

    Button button = new Button();
}

class Main{
    public static void main(String[] args){
        Cat cat = new Cat();
        Integer speed = 28;
        cat.isRun(speed);
        cat.button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
