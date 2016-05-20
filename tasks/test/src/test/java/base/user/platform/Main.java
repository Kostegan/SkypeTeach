package base.user.platform;

import base.user.platform.entity.Cat;
import base.user.platform.entity.Dog;

/**
 *
 */
public class Main {
    public static void main(String[] args){
        IPlatform platform = new Platform();
        IFlyable dog = new Dog();
        IFlyable cat = new Cat();
        platform.setEntity(dog);
        platform.setEntity(cat);
        platform.StartAllPilots();
        platform.setEntity(new IFlyable() {
            @Override
            public void launch() {
                System.out.println("Robot go . . . . .");
            }
        });
        System.out.println("--------------------");
        platform.Start();
    }
}
