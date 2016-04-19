package base.user.animals;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Cat();
        Animal animal2 = new Dog();
        animal1.sleep();
        animal1.go();
        animal2.sleep();
        animal2.go();
        animal1.hry();
        animal2.hry();
    }
}
