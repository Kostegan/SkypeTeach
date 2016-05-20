package ru.game.seabattle.learn;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        Cell[][] cells;

        cells = new Cell[10][10];
        cells[0][0] = new Cell();
        System.out.println(cells[0][0].isShoot);

    }
}
