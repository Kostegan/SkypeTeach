package ru.game.tictactoe.engine.rule;

import ru.game.tictactoe.field.IField;
import ru.game.tictactoe.sign.Sign;

/**
 * This class stores all rules for a game engine.
 */
public interface IRule {
    /**
     * Searches a winning combination on a field..
     * @param field which will be check.
     * @return return true if the winning combination is found
     */
    boolean checkCombination(IField field, Sign sing);
}
