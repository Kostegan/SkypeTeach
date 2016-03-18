package ru.game.tictactoe.engine;

import ru.game.tictactoe.cell.ICell;
import ru.game.tictactoe.engine.rule.IRule;
import ru.game.tictactoe.engine.rule.Rule;
import ru.game.tictactoe.field.Field;
import ru.game.tictactoe.field.IField;
import ru.game.tictactoe.player.IPlayer;
import ru.game.tictactoe.player.Player;
import ru.game.tictactoe.sign.Sign;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 */
public class Engine implements IEngine {
    private IPlayer playerOne;
    private IPlayer playerTwo;
    private IField field = new Field();
    private IRule rule = new Rule();
    private int moveCounter;


    @Override
    public void startGame() throws IOException {
        prepareToGame();
        System.out.println("Name the first player is: " + playerOne.getPlayerName() + ", name the second player is: " + playerTwo.getPlayerName());
        printField();
        IPlayer currentPlayer = playerTwo;
        while (rule.checkCombination((field), currentPlayer.getPlayerSign()) && moveCounter != 9) {
            currentPlayer = exchangePlayer(currentPlayer);
            System.out.println("Select cell number: ");
            doStep().setSign(currentPlayer.getPlayerSign());
            printField();
            moveCounter++;
        }
        if (moveCounter == 9) {
            System.out.println("Draw!!!");
        } else {
            System.out.println(currentPlayer.getPlayerName() + " is winner!!!");
        }
    }

    /**
     * Sets a number players, and creates a players name.
     */
    private void prepareToGame() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select a player name ONE:");
        String name1 = sc.next();
        setPlayerOneName(name1);
        System.out.println("Select a player name TWO:");
        String name2 = sc.next();
        setPlayerTwoName(name2);
    }

    private void setPlayerOneName(String name) {
        playerOne = new Player();
        playerOne.setPlayerName(name);
        playerOne.setPlayerSign(Sign.CROOS);
    }

    private void setPlayerTwoName(String name) {
        playerTwo = new Player();
        playerTwo.setPlayerName(name);
        playerTwo.setPlayerSign(Sign.TOE);
    }

    private void printField() {
        field.printField();
    }


    private IPlayer exchangePlayer(IPlayer player) {
        if (player == playerOne) {
            return playerTwo;
        } else {
            return playerOne;
        }
    }

    private ICell doStep() {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        return field.findCellByNumber(number);
    }

    private boolean endGame() {
        return true;
    }
}

class main {
    public static void main(String[] args) throws IOException {
        IEngine engine = new Engine();
        engine.startGame();
    }
}
