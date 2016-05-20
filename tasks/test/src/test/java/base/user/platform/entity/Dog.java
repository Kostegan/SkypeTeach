package base.user.platform.entity;

import base.user.platform.IFlyable;

/**
 *
 */
public class Dog implements IFlyable {
    @Override
    public void launch() {
        System.out.println("I can fly, go go go.....");
    }
}
