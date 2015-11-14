package ru.game.pinpong;

import javax.swing.*;
import java.awt.*;

/**
 *
 */
public class CalculateBoxLayout {
    JPanel windowContent;
    JPanel p1;

    public CalculateBoxLayout() {

        JButton button = new JButton("Button1");
        windowContent = new JPanel();
        BorderLayout borderLayout = new BorderLayout();
        FlowLayout f1 = new FlowLayout();
        windowContent.setLayout(borderLayout);
        windowContent.add(button);

        JFrame frame = new JFrame();
        frame.setContentPane(windowContent);
        frame.setSize(300,200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(2);
    }

    public static void main(String[] args) {
        CalculateBoxLayout calculator = new CalculateBoxLayout();
    }
}
