package ru.game.tictactoe.engine;

import ru.game.tictactoe.cell.ICell;
import ru.game.tictactoe.engine.rule.IRule;
import ru.game.tictactoe.engine.rule.Rule;
import ru.game.tictactoe.field.Field;
import ru.game.tictactoe.field.IField;
import ru.game.tictactoe.player.IPlayer;
import ru.game.tictactoe.player.Player;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 */
public class Engine implements IEngine {
    private IPlayer playerOne;
    private IPlayer playerTwo;
    private IField field;
    private IRule rule = new Rule();


    @Override
    public void startGame() throws IOException {
        prepareToGame();
        System.out.println("Name the first player is: " + playerOne.getPlayerName() + ", name the second player is: " + playerTwo.getPlayerName());
        printField();
        IPlayer currentPlayer = playerOne;
        while(rule.checkCombination(field,currentPlayer.getPlayerSign())){
            System.out.println("Select cell: ");

        }
    }

    /**
     * Sets a number players, and creates a players name.
     */
    private void prepareToGame() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select a player name ONE:");
        String  name1 = sc.next();
        setPlayerOneName(name1);
        System.out.println("Select a player name TWO:");
        String  name2 = sc.next();
        setPlayerTwoName(name2);
    }

    private void setPlayerOneName(String name){
        playerOne = new Player();
        playerOne.setPlayerName(name);
    }

    private void setPlayerTwoName(String name){
        playerTwo = new Player();
        playerTwo.setPlayerName(name);
    }

    private void printField(){
        field = new Field();
        field.printField();
    }

    private void doStep(int cellNumber){
        ICell cell = field.findCellByNumber(cellNumber);
//        cells. todo
    }

    private boolean endGame(){
        return true;
    }

//    private void createPlayers(int number) {
//        if(number>=1){
//            playerOne = new Player();
//        }
//        if(number==2){
//            playerTwo = new Player();
//        } else {
//            throw new IllegalArgumentException("Count player might not be more 2, you specified: "+number);
//        }
//    }
}

class main {
    public static void main(String[] args) throws IOException {
        IEngine engine = new Engine();
        engine.startGame();
    }
}
