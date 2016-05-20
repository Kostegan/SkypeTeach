package ru.test.skype.test.mvc.example.two.View;

import javax.swing.*;
import java.awt.*;

/**
 *
 */
public class View {

    private JFrame frame;
    private JLabel label;
    private JButton button1;
    private JButton button2;

    public View(String text){
        frame = new JFrame("View");
        frame.setLayout(new BorderLayout());
//        frame.setLayout(new );
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(200,200);
        frame.setVisible(true);

        label =new JLabel(text);
        frame.add(label,BorderLayout.NORTH);

        button1 = new JButton("Button");
        frame.add(button1,BorderLayout.WEST);

        button2 = new JButton("Button2");
        frame.add(button2,BorderLayout.CENTER);

    }

    public JButton getButton1(){
        return button1;
    }


    public JButton getButton2(){
        return button2;
    }

    public void setText(String text){
        label.setText(text);
    }
}
