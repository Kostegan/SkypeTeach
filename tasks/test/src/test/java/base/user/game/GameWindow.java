package base.user.game;

import javax.swing.*;
import java.awt.*;

/**
 *
 */
public class GameWindow extends JFrame {
    JPanel jPanel = new JPanel();
    Button[][] buttons = new Button[3][3];

    public void init(){
        setSize(400, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("XO - GAME");

        jPanel.setLayout(new GridLayout(3,3));
        for(int i = 0; i < 3; i++){
            for(int j = 0; j<3;j++){
                Button button = new Button("X");
                buttons[i][j] = button;
                jPanel.add(button);
            }
        }
        add(jPanel);

        setVisible(true);
    }
}
