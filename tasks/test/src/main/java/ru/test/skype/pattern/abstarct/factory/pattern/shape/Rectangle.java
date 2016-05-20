package ru.test.skype.pattern.abstarct.factory.pattern.shape;

/**
 *
 */
public class Rectangle implements IShape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
