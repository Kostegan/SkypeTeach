package ru.test.skype.game.xo.Model;

/**
 *
 */
public class Field {
    public enum TypeXO {X, O, NOT_SET}

    private final int ROW_COUNT = 3;
    private final int COLUMN_COUNT = 3;

    TypeXO[][] cells;

    public Field() {
        init();
    }

    public void init() {
        cells = new TypeXO[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                cells[i][j] = TypeXO.NOT_SET;
            }
        }
    }

    public void show() {
        for (int i = 0; i < ROW_COUNT; i++) {
            for (int j = 0; j < COLUMN_COUNT; j++) {
                switch (cells[i][j]) {
                    case X:
                        System.out.print("X");
                        break;
                    case O:
                        System.out.print("0");
                        break;
                    case NOT_SET:
                        System.out.print(".");
                        break;
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public void doShoot(Point point, TypeXO type) {
        if (isNotShoot(point)) {
            cells[point.getX()][point.getY()] = type;
        }
    }

    private boolean isNotShoot(Point point) {
        return cells[point.getX()][point.getY()] == TypeXO.NOT_SET;
    }

    public boolean isWin(TypeXO t) {
        boolean isWin = false;
        if (cells[0][0] == t && cells[1][1] == t && cells[2][2] == t) {
            isWin = true;
        }
        return isWin;
    }

    public TypeXO[][] getFillField (){
        return cells;
    }
    
}
