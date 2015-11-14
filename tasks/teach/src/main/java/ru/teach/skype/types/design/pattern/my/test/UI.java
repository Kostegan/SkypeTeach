package ru.teach.skype.types.design.pattern.my.test;

/**
 *
 */
public class UI {
    public static void main(String[] args){
        IBird bird1 = new Bird();
        IBird bird2 = new BirdWrapper(bird1);
        IBird bird3 = new Bird();

        bird2.fly();
    }
}
