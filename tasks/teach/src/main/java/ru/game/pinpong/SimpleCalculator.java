package ru.game.pinpong;

import javax.swing.*;
import java.awt.*;

/**
 * Class show how work the FlowLayout manager.
 */
public class SimpleCalculator {
    public static void main(String[] args){
        //Create a panel
        JPanel windowContent = new JPanel();
        //Create a layout manager for this panel and assignment this layout on the panel
        GridLayout l1 = new GridLayout(4,2,5,5);
        windowContent.setLayout(l1);
        //Create controls in memory
        JTextField text = new JTextField(20);
        JLabel label1 = new JLabel("Number 1");
        JTextField field1 = new JTextField(10);
        JLabel label2 = new JLabel("Number 2");
        JTextField field2 = new JTextField(10);
        JLabel label3 = new JLabel("Sum...");
        JTextField field3 = new JTextField(10);
        JButton button = new JButton("go...");
        //add controls to the panel
//        windowContent.add(BorderLayout.NORTH, text);
        windowContent.add(label1);
        windowContent.add(field1);
        windowContent.add(label2);
        windowContent.add(field2);
        windowContent.add(label3);
        windowContent.add(field3);
        windowContent.add(button);

        //create JFrame and add a JPanel to the JFrame
        JFrame frame = new JFrame();
        frame.setContentPane(windowContent);
        frame.setSize(400,100);
        frame.setVisible(true);
    }
    // GridLayout
//    public static void main(String[] args){
//        //Create a panel
//        JPanel windowContent = new JPanel();
//        //Create a layout manager for this panel and assignment this layout on the panel
//        GridLayout gridLayout = new GridLayout(4,2,5,5);
//        windowContent.setLayout(gridLayout);
//        //Create controls in memory
//        JLabel label1 = new JLabel("Number 1");
//        JTextField field1 = new JTextField(10);
//        JLabel label2 = new JLabel("Number 2");
//        JTextField field2 = new JTextField(10);
//        JLabel label3 = new JLabel("Sum...");
//        JTextField field3 = new JTextField(10);
//        JButton button = new JButton("go...");
//        //add controls to the panel
//        windowContent.add(label1);
//        windowContent.add(field1);
//        windowContent.add(label2);
//        windowContent.add(field2);
//        windowContent.add(label3);
//        windowContent.add(field3);
//        windowContent.add(button);
//
//        //create JFrame and add a JPanel to the JFrame
//        JFrame frame = new JFrame();
//        frame.setContentPane(windowContent);
//        frame.setSize(400,100);
//        frame.setVisible(true);
//    }


    // FlowLayout
//    public static void main(String[] args){
//        //Create a panel
//        JPanel windowContent = new JPanel();
//        //Create a layout manager for this panel and assignment this layout on the panel
//        FlowLayout fl = new FlowLayout();
//        windowContent.setLayout(fl);
//        //Create controls in memory
//        JLabel label1 = new JLabel("Number 1");
//        JTextField field1 = new JTextField(10);
//        JLabel label2 = new JLabel("Number 2");
//        JTextField field2 = new JTextField(10);
//        JLabel label3 = new JLabel("Sum...");
//        JTextField field3 = new JTextField(10);
//        JButton button = new JButton("go...");
//        //add controls to the panel
//        windowContent.add(label1);
//        windowContent.add(field1);
//        windowContent.add(label2);
//        windowContent.add(field2);
//        windowContent.add(label3);
//        windowContent.add(field3);
//        windowContent.add(button);
//
//        //create JFrame and add a JPanel to the JFrame
//        JFrame frame = new JFrame();
//        frame.setContentPane(windowContent);
//        frame.setSize(400,100);
//        frame.setVisible(true);
//    }
}
