package base.user.platform.entity;

import base.user.platform.IFlyable;

/**
 *
 */
public class Cat implements IFlyable {
    @Override
    public void launch() {
        System.out.println("No - no - no, I can't fly .... a - a - a");
    }
}
