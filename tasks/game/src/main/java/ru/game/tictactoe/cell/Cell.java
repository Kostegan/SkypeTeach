package ru.game.tictactoe.cell;

import ru.game.tictactoe.sign.Sign;

/**
 *
 */
public class Cell implements ICell {
    private Sign sign;
    private int cellNumber;
    private static int amount;

    public Cell() {
        Cell.amount++;
        setCellNumber(amount);
    }


    @Override
    public void setSign(Sign sign) {
        if (isEmpty()) {
            this.sign = sign;
        } else {
            throw new IllegalArgumentException("This cell has a sign: " + this.sign.name());
        }

    }

    @Override
    public boolean isEmpty() {
        if (sign != null) {
            return false;
        } else {
            return true;
        }
    }

    public String printCell() {
        if (sign == null) {
            return this.getCellNumber()+"";
        } else if (sign == Sign.CROOS) {
            return "X";
        }
        return "0";
    }

    @Override
    public Sign getSign() {
        return sign;
    }

    private void setCellNumber(int number) {
        cellNumber = amount;
    }

    @Override
    public int getCellNumber() {
        return cellNumber;
    }

    public static int getAmount() {
        return amount;
    }
}
