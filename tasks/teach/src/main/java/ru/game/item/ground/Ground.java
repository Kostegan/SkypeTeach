package ru.game.item.ground;

import ru.game.item.gameObject;

/**
 * This class creates object a ground. The ground have coordinates. On the ground we can set a new object.
 */
public class Ground implements gameObject {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    /**
     * Empty constructor.
     */
    public Ground(){

    }

    /**
     *  Constructor which declares the ground coordinates.
     */
    public Ground(int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    /**
     * Declares ground coordinates.
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     */
    public void setCoordinate(int x1, int y1, int x2, int y2){

    }

}
