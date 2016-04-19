package ru.test.skype.game.xo.Controller;

import ru.test.skype.game.xo.Model.Field;
import ru.test.skype.game.xo.Model.Point;
import ru.test.skype.game.xo.Model.User;
import ru.test.skype.game.xo.View.GameView;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 */
public class GameController {
    private Field field;
    private GameView gameView;
    private ActionListener actionListener;


    public GameController(Field field) {
        gameView = new GameView(field.getFillField());
        this.field = field;
    }

    public void controller() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                final int finalI = i;
                final int finalJ = j;
                gameView.getButtons()[i][j].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        field.doShoot(new Point(finalI,finalJ), Field.TypeXO.X);
                        Button tempBtn = gameView.getButton(finalI, finalJ);
                        gameView.changeButtonLabel(tempBtn,Field.TypeXO.X+"");
//                        gameView.fillField(field.getFillField());
                    }
                });
            }
        }
//        actionListener = new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("Ya-Ya, it is working!!!");
//            }
//        };
//        setActionListener();
    }

    private void setActionListener(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                gameView.getButtons()[i][j].addActionListener(actionListener);
            }
        }
    }


    public static void doShoot(Point point, Field.TypeXO type) {
        User.point = point;
        User.isShoot = true;
    }

    public static Field.TypeXO[][] getField() {
//        Field field =  ;
        return new Field().getFillField();
    }

//    public void linkBtn(ActionEvent e){
//        e.
//        String textLabel = e.getActionCommand();
//
//    }

    private void getFinalButtonPosition(){

    }
}
