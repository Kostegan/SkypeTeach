package ru.test.skype.test.mvc.example.two.Model;

/**
 *
 */
public class Model {
    private int x;

    public Model(){
        x = 0;
    }

    public Model(int x){
        this.x = x;
    }

    public void incX(){
        x++;
    }

    public void reduceX(){
        x--;
    }

    public int getX(){
        return x;
    }
}
