package base.user.animals;

/**
 *
 */
public class Cat extends Animal {
    @Override
    void go() {
        System.out.println("Tok-tok");
    }

    @Override
    public void hry() {
        System.out.println("My-my");
    }
}
