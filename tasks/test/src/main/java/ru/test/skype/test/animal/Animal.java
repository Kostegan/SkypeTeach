package ru.test.skype.test.animal;

/**
 *
 */
public class Animal {
    private String name;
    private int length;
    private int height;

    public Animal() {
    }

    public Animal(String name, int length, int height) {
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

    public void say(String s){
        System.out.println(s);
    };
}
