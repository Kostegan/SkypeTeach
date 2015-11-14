package ru.teach.skype.work.wrapper.my.test;

/**
 *
 */
public class UIFish {
    public static void main(String[] args){
        IFish fish1 = new Fish();
        IFish fish2 = new Fish();
        fish1 = new FishWrapper(fish1);
        fish2 = new FishWrapper(fish2);
        fish1.swim();
        fish1.changeName("Robert");
        fish2.eat();
    }
}
