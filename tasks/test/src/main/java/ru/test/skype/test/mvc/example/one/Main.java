package ru.test.skype.test.mvc.example.one;

import ru.test.skype.test.mvc.example.one.Controller.CatController;
import ru.test.skype.test.mvc.example.one.Model.Cat;
import ru.test.skype.test.mvc.example.one.View.CatWindow;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        CatController catController = new CatController(new Cat("Filimon", 22), new CatWindow());
        catController.viewCat();
//        catController.setCatName("Pushok");
//        catController.setCatAge(10);
//        catController.viewCat();
    }
}
