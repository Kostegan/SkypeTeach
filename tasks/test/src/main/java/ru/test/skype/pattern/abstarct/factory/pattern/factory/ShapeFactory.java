package ru.test.skype.pattern.abstarct.factory.pattern.factory;

import ru.test.skype.pattern.abstarct.factory.pattern.color.IColor;
import ru.test.skype.pattern.abstarct.factory.pattern.shape.Circle;
import ru.test.skype.pattern.abstarct.factory.pattern.shape.IShape;
import ru.test.skype.pattern.abstarct.factory.pattern.shape.Rectangle;
import ru.test.skype.pattern.abstarct.factory.pattern.shape.Square;

/**
 *
 */
public class ShapeFactory extends AbstractFactory {
    @Override
    public IColor getColor(String color) {
        return null;
    }

    @Override
    public IShape getShape(String shape) {
        if(shape==null){
            return null;
        }
        if(shape.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shape.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shape.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
