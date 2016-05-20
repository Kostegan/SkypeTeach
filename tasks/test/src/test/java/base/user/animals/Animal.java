package base.user.animals;

/**
 *
 */
public abstract class Animal {
    final void sleep(){
        System.out.println("I am going to sleep.");
    }
    abstract void go();

    public void hry(){
        System.out.println("Hry-hry");
    }

}
