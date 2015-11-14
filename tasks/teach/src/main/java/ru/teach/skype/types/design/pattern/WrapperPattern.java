package ru.teach.skype.types.design.pattern;

/**
 *
 */
public class WrapperPattern {
    public static void main(String[] args) {
        Bird bird = new BirdImpl();

        bird = new MyBirdWrapper(bird);


        doLogic(bird);
    }

    static void doLogic(Bird bird) {
        bird = new BirdWrapper(bird);
        bird.fly();
    }
}

interface Bird {
   void fly();

    void eat();
}

class BirdImpl implements Bird {
    @Override
    public void fly() {
        System.out.println("Fly!");
    }

    @Override
    public void eat() {
        System.out.println("Eat!");
    }
}

class BirdWrapper implements Bird {
    private Bird bird;

    public BirdWrapper(Bird bird) {
        this.bird = bird;
    }

    @Override
    public void fly() {
        System.out.println("I begin to fly...");
        bird.fly();
    }

    @Override
    public void eat() {
        bird.eat();
    }
}

class MyBirdWrapper implements Bird {
    private Bird bird;

    public MyBirdWrapper(Bird bird) {
        this.bird = bird;
    }

    @Override
    public void fly() {
        bird.fly();
        System.out.println("I finish to fly...");
    }

    @Override
    public void eat() {
        bird.eat();
    }
}
