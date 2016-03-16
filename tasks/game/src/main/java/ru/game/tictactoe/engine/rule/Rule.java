package ru.game.tictactoe.engine.rule;

import ru.game.tictactoe.cell.ICell;
import ru.game.tictactoe.field.IField;
import ru.game.tictactoe.sign.Sign;

/**
 *
 */
public class Rule implements IRule {
    private Sign sign;

    @Override
    public boolean checkCombination(IField field, Sign sign) {
        this.sign = sign;
        ICell[][] cells =field.getField();
        Sign cell1 = cells[0][0].getSign();
        Sign cell2 = cells[0][1].getSign();
        Sign cell3 = cells[0][2].getSign();
        Sign cell4 = cells[1][0].getSign();
        Sign cell5 = cells[1][1].getSign();
        Sign cell6 = cells[1][2].getSign();
        Sign cell7 = cells[2][0].getSign();
        Sign cell8 = cells[2][1].getSign();
        Sign cell9 = cells[2][2].getSign();
        if(cell1 ==sign && cell2 == sign && cell3 == sign){
            return true;
        }
        if(cell4 ==sign && cell5 == sign && cell6 == sign){
            return true;
        }
        if(cell7 ==sign && cell8 == sign && cell9 == sign){
            return true;
        }
        return false;
    }


}
