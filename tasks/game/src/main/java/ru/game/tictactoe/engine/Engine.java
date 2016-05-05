package ru.game.tictactoe.engine;

import ru.game.tictactoe.cell.ICell;
import ru.game.tictactoe.engine.rule.IRule;
import ru.game.tictactoe.engine.rule.Rule;
import ru.game.tictactoe.field.Field;
import ru.game.tictactoe.field.IField;
import ru.game.tictactoe.player.IPlayer;
import ru.game.tictactoe.player.Player;
import ru.game.tictactoe.sign.Sign;
import ru.game.ui.UI;

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
    IPlayer currentPlayer;

    private UI ui;

    private IGameState gameState = new GameState(field, currentPlayer);


    public Engine() {
    }

    public Engine(UI ui) {
        this.ui = ui;
    }



    @Override
    public void startGame() throws IOException {
        prepareToGame();
        System.out.println("Name the first player is: " + playerOne.getPlayerName() + ", name the second player is: " + playerTwo.getPlayerName());
        printField();
         currentPlayer= playerTwo;
        while (!gameState.isFinished()) {
            currentPlayer = exchangePlayer(currentPlayer);
            System.out.println("Select cell number: ");
            doStep().setSign(currentPlayer.getPlayerSign());
            printField();
            moveCounter++;
        }
        IPlayer winner = getWinner();
        if (winner == null) {
            System.out.println("Draw!!!");
        } else {
            System.out.println(winner.getPlayerName() + " is winner!!!");
        }
    }

    private IPlayer getWinner() {
        Sign winner = gameState.getWinner();
        return    playerOne.getPlayerSign() == winner
                ? playerOne
                : playerTwo.getPlayerSign() == winner
                ? playerTwo
                : null;
    }

    /**
     * Sets a number players, and creates a players name.
     */
    private void prepareToGame() {
//        Scanner sc = new Scanner(System.in);
        System.out.println("Select a player name ONE:");
        String name1 = ui.enterUserName1();//sc.next();
        setPlayerOneName(name1);
        System.out.println("Select a player name TWO:");
        String name2 = ui.enterUserName2(); //sc.next();
        setPlayerTwoName(name2);
    }

    private void setPlayerOneName(String name) {
        playerOne = new Player();
        playerOne.createPlayer(name, Sign.CROSS);
    }

    private void setPlayerTwoName(String name) {
        playerTwo = new Player();
        playerTwo.createPlayer(name, Sign.TOE);
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
//        UI ui = null; // new ConsoleUI(); // new TestUI
//        IEngine engine = new Engine(ui);
//        IEngine engine = new Engine(ui);
//        engine.startGame();
        IEngine engine = new Engine();
        engine.startGame();
    }
}
