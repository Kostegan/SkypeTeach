package ru.test.skype.game.xo.Model;

/**
 *
 */
public class Computer implements Shootable {

    @Override
    public Point getShoot(){
        return Point.getRandomPoint();
    };
}
