package ru.test.skype.pattern.abstarct.factory.pattern.factory;

import ru.test.skype.pattern.abstarct.factory.pattern.color.Blue;
import ru.test.skype.pattern.abstarct.factory.pattern.color.Green;
import ru.test.skype.pattern.abstarct.factory.pattern.color.IColor;
import ru.test.skype.pattern.abstarct.factory.pattern.color.Red;
import ru.test.skype.pattern.abstarct.factory.pattern.shape.IShape;

/**
 *
 */
public class ColorFactory extends AbstractFactory {
    @Override
    public IColor getColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        } else if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        } else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
        return null;
    }

    @Override
    public IShape getShape(String shape) {
        return null;
    }
}
