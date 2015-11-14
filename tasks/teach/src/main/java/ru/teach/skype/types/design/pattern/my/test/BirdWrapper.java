package ru.teach.skype.types.design.pattern.my.test;

/**
 *
 */
public class BirdWrapper implements IBird {
    private IBird bird;

    public BirdWrapper(IBird bird){
        this.bird = bird;
    }

    @Override
    public void fly() {
        System.out.println("Now I am flying...");
        bird.fly();
    }

    @Override
    public void eat() {
        System.out.println("Now I am eating...");
        bird.eat();
    }

    @Override
    public void sleep() {
        System.out.println("Now I am sleeping...");
        bird.sleep();
    }
}
