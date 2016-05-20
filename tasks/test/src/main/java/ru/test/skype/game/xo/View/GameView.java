package ru.test.skype.game.xo.View;

import ru.test.skype.game.xo.Model.Field;

import java.awt.*;

import javax.swing.*;

/**
 *
 */
public class GameView extends JFrame {
    JPanel jPanel = new JPanel();
    Button[][] buttons = new Button[3][3];
    private boolean frameIsEmpty = true;

    public GameView(Field.TypeXO[][] fieldM) {
        setSize(400, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("XO - game");
        jPanel.setLayout(new GridLayout(3, 3));
        fillField(fieldM);
        frameIsEmpty = false;
        add(jPanel);
        setVisible(true);
    }

    public void fillField(Field.TypeXO[][] fieldM) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                String label = fieldM[i][j] + "";
                if (frameIsEmpty) {
                    Button button = createButton(label);
                    buttons[i][j] = button;
                } else{
                    buttons[i][j].setLabel(label);
                }
                jPanel.add(buttons[i][j]);
            }
        }
    }

    public void changeButtonLabel(Button button, String label) {
        button.setLabel(label);
    }

    private Button createButton(String label) {
        return new Button(label);
    }

    public Button[][] getButtons() {
        return buttons;
    }

    public Button getButton(int positionI, int positionJ) {
        return buttons[positionI][positionJ];
    }
}

//    public void init() {
//        setSize(400, 400);
//        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        setTitle("XO - game");
//        jPanel.setLayout(new GridLayout(3, 3));
//        add(jPanel);
//        setVisible(true);
//    }
//        Field.Type[][] cells = GameController.getField();
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                Button button = new Button();
//                button.setLabel(cells[i][j] == Field.Type.NOT_SET ? "." : cells[i][j] + "");
//                buttons[i][j] = button;
//                jPanel.add(button);
//
//                final int finalI = i;
//                final int finalJ = j;
//                button.addActionListener(new ActionListener() {
//                    @Override
//                    public void actionPerformed(ActionEvent e) {
//                        String buttonText = e.getActionCommand();
//                        System.out.printf("Button: %s, x: %d, y: %d\n", buttonText, finalI, finalJ);
//                        GameController.doShoot(new Point(finalI, finalJ), buttonText.equals("X") ? Field.Type.X : Field.Type.O);
////                        buttons[finalI][finalJ].setLabel("0");
////                        putType();
//                    }
//                });
//            }
//        }

//    public void init() {
//        setSize(400, 400);
//        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        setTitle("XO - game");
//
//        jPanel.setLayout(new GridLayout(3, 3));
//
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                Button button = new Button();
//                button.setLabel(".");
//                buttons[i][j] = button;
//                jPanel.add(button);
//
//                final int finalI = i;
//                final int finalJ = j;
//                button.addActionListener(new ActionListener() {
//                    @Override
//                    public void actionPerformed(ActionEvent e) {
//                        String buttonText = e.getActionCommand();
//                        System.out.printf("Button: %s, x: %d, y: %d\n", buttonText, finalI, finalJ);
//                        GameController.doShoot(new Point(finalI, finalJ), buttonText.equals("X") ? Field.Type.X : Field.Type.O);
//                        buttons[finalI][finalJ].setLabel("0");
//                    }
//                });
//            }
//        }


//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                Button button = new Button();
////                button.setLabel(j % 2 == 0 ? "X" : "0");
//                button.setLabel(".");
//                buttons[i][j] = button;
//                jPanel.add(button);
//
//                final int finalI = i;
//                final int finalJ = j;
//                button.addActionListener(new ActionListener() {
//                    @Override
//                    public void actionPerformed(ActionEvent e) {
//                        String buttonText = e.getActionCommand();
//                        System.out.printf("Button: %s, x: %d, y: %d\n", buttonText, finalI, finalJ);
//                        GameController.doShoot(new Point(finalI, finalJ), buttonText.equals("X") ? Field.Type.X : Field.Type.O);
//                        buttons[finalI][finalJ].setLabel("0");
//                    }
//                });
//            }
//        }

//
//    private void putType() {
//        Field.Type[][] cells = GameController.getField();
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                buttons[i][j].setLabel(cells[i][j]+"");
//            }
//        }
//    }

//    private String getLabels(){
//        GameController.getPointType();
//        return "";
//    }
