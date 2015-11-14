package ru.teach.skype.work.wrapper.my.test;

/**
 *
 */
public class FishWrapper implements IFish {
    private IFish fish;

    public FishWrapper(IFish fish){
        this.fish = fish;
    }
    @Override
    public void swim() {
        System.out.println("I am start swim");
        fish.swim();
    }

    @Override
    public void eat() {
        System.out.println("I am start eat");
        fish.eat();
    }

    @Override
    public void changeName(String name){
        System.out.println("Can't change name");
    }
}
