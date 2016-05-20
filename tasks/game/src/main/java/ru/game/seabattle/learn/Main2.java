package ru.game.seabattle.learn;

import java.util.Random;

/**
 *
 */
public class Main2 {
    public static void main(String[] args) {
        Cell[][] cells;
        cells = new Cell[5][];
        cells[0] = new Cell[4];
        cells[1] = new Cell[1];
        cells[2] = new Cell[2];
        cells[3] = new Cell[3];
        cells[4] = new Cell[1];

        Random random = new Random();

        for (int i = 0; i < cells.length; i++) {
            Cell[] column = cells[i];
            for (int j = 0; j < cells[i].length; j++) {
//            for (int j = 0; j < column.length; j++) {
                cells[i][j] = new Cell();
                cells[i][j].isShoot = random.nextBoolean();
            }
        }

        for (Cell[] column : cells) {
            for (Cell cell : column) {
                System.out.print("The cell value is: "+ cell.isShoot);
                System.out.println();
            }

        }
    }
}
