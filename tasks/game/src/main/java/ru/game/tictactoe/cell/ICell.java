package ru.game.tictactoe.cell;

import ru.game.tictactoe.sign.Sign;

/**
 * Stores an information about cell.
 */
public interface ICell {

    /**
     * @param sign which will be installed.
     */
    void setSign(Sign sign);

    /**
     * @return true if a cell is empty.
     */
    boolean isEmpty();

    /**
     * @return a sign which was installed in a cell.
     */
    Sign getSign();

    public int printCell();


    public  int getCellNumber();
}
