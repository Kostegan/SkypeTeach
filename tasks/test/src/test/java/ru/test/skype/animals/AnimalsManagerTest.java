package ru.test.skype.animals;

import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 */
public class AnimalsManagerTest {
    private AnimalsManager createAnimalsManager(){
        return new AnimalsManager();
    }

    @Test
    public void changeAnimalsName(){
        Elephant elephant = new Elephant("Mulat",12);
        AnimalsManager manager = createAnimalsManager();
        manager.changeAnimalName(elephant);
        assertEquals("The new elephant name is: ", "Merter", elephant.getName());
    }
}
