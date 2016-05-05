package ru.test.skype.pattern.abstarct.factory.pattern;

import ru.test.skype.pattern.abstarct.factory.pattern.color.IColor;
import ru.test.skype.pattern.abstarct.factory.pattern.factory.AbstractFactory;
import ru.test.skype.pattern.abstarct.factory.pattern.factory.ShapeFactory;
import ru.test.skype.pattern.abstarct.factory.pattern.shape.IShape;

/**
 *
 */
public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
        IShape shape = shapeFactory.getShape("CIRCLE");
        IColor color = colorFactory.getColor("Red");
        color.fill();
        shape.draw();

        ShapeFactory factory = new ShapeFactory();
        IShape shape2 = factory.getShape("Rectangle");
        shape2.draw();
    }
}
