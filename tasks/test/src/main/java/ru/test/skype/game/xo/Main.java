package ru.test.skype.game.xo;

import ru.test.skype.game.xo.Controller.GameController;
import ru.test.skype.game.xo.Model.Field;
import ru.test.skype.game.xo.Model.MainGame;
import ru.test.skype.game.xo.View.GameView;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        Field field = new Field();
        GameController controller = new GameController(field);
        controller.controller();
        System.out.println("Check");
//        MainGame.start();
//        Field field = new Field();
//        GameView view = new GameView(field.getFillField());
//        gWindow.init();
    }
}
