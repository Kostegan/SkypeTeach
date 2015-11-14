package ru.teach.skype.types.myTests;

/**
 * Это класс представляет прямоугольник. Его поля представляют координаты углов
 * прямоугольника. Его методы определяют операции которые могут осуществляться
 * с объектом Rect
 */
public class Rect {
    public int x1,y1,x2,y2;

    /**
     * Конструктор класса, аргументы конструктора используются для инициализации полей нового объекта.
     */
    public Rect(int x1, int y1,int x2,int y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    /**
     * Constructor 2
     */
    public Rect(int wight, int height){
        this(0,0,wight,height);
    }
    /**
     *Constructor 3
     */
    public Rect(){
        this(0,0,0,0);
    }

    /**
     * Move rect
     * @param deltaX how much move to x
     * @param deltaY how much move to y
     */
    public void move(int deltaX, int deltaY){
        x1 +=deltaX; x2 +=deltaX;
        y1 +=deltaY; y2 +=deltaY;
    }

    public boolean isInside(int x, int y){
        return ((x>=x1)&&(x<=x2)&&(y>=y1)&&(y<=y2));
    }


}
