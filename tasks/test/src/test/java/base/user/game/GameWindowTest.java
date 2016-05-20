package base.user.game;

import javax.swing.*;
import java.awt.*;

/**
 *
 */
public class GameWindowTest extends JFrame {
    public void init(){
        setSize(400,400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JButton button = new JButton("Hello");
        JButton button2 = new JButton("Bye");
        add(button, BorderLayout.CENTER);
        add(button2, BorderLayout.NORTH);
        add(new JButton("EAST"),BorderLayout.EAST);
        add(new JButton("WEST"),BorderLayout.WEST);
        add(new JButton("NORTH"),BorderLayout.SOUTH);

        setVisible(true);
    }
}
