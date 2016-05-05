package ru.test.skype.pattern.abstarct.factory.pattern.factory;

import ru.test.skype.pattern.abstarct.factory.pattern.color.IColor;
import ru.test.skype.pattern.abstarct.factory.pattern.shape.IShape;

/**
 *
 */
public abstract class AbstractFactory {
    public abstract IColor getColor(String color);
    public abstract IShape getShape(String shape);
}
