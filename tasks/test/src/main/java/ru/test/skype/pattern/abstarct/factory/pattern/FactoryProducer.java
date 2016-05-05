package ru.test.skype.pattern.abstarct.factory.pattern;

import ru.test.skype.pattern.abstarct.factory.pattern.factory.AbstractFactory;
import ru.test.skype.pattern.abstarct.factory.pattern.factory.ColorFactory;
import ru.test.skype.pattern.abstarct.factory.pattern.factory.ShapeFactory;

/**
 *
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        }else if(choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return null;
    }
}
