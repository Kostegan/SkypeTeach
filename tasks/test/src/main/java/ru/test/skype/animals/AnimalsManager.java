package ru.test.skype.animals;

/**
 *
 */
public class AnimalsManager {
    public void changeAnimalName(Elephant elephant){
        if(!elephant.getName().equals("Morde")){
            Elephant changedElephant = elephant;
            changedElephant.setName("Merter");
        }
    }
}
