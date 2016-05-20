package ru.test.skype.test.mvc.example.one.Controller;

import ru.test.skype.test.mvc.example.one.Model.Cat;
import ru.test.skype.test.mvc.example.one.View.ICatWindow;


/**
 *
 */
public class CatController {
    private Cat cat;
    private ICatWindow window;

    public volatile static boolean marker;

    public CatController(Cat cat,ICatWindow window){
        this.cat = cat;
        this.window = window;
    }

    public void setCatName(String name){
        cat.setName(name);
    }

    public String getCatName(){
        return cat.getName();
    }

    public void setCatAge(int age){
        cat.setAge(age);
    }

    public int getCatAge(){
        return cat.getAge();
    }

    public void viewCat(){
        window.printInfo(cat.getName(),cat.getAge());
    }

    public void updateCat(){
        marker = false;
        while(!marker);
        cat.setName(window.getNewCatInfo()[0]);
        cat.setAge(Integer.parseInt(window.getNewCatInfo()[1]));
    }
}
