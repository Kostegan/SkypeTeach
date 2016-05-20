package ru.test.skype.game.xo.Model;

/**
 *
 */
public class MainGame {
    public static Field field = new Field();
    public static Computer computer = new Computer();
    public static User user = new User();


    public static void start(){
        field.show();
        for(int i = 0; i<10;i++){
            field.doShoot(computer.getShoot(), Field.TypeXO.X);
            field.show();

            field.doShoot(user.getShoot(), Field.TypeXO.O);
            field.show();
        }
    }
}
