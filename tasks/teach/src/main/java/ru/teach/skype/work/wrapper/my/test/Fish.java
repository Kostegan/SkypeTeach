package ru.teach.skype.work.wrapper.my.test;

/**
 *
 */
public class Fish implements IFish {
    private String nameFish;
    @Override
    public void swim() {
        System.out.println("I am swimming ...");
    }

    @Override
    public void eat() {
        System.out.println("I am eating ...");

    }

    @Override
    public void changeName(String name){
        this.nameFish = name;
    }
}
