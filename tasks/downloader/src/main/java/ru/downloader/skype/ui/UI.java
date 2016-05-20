package ru.downloader.skype.ui;

import javax.swing.*;
import java.awt.*;

/**
 *
 */
public class UI implements IUI {
    public UI(){
        //Creates a panel
        JPanel windowContent = new JPanel();
        //Sets layout manager for this panel
        GridLayout gr = new GridLayout(3,3);
        FlowLayout fl = new FlowLayout();
        windowContent.setLayout(gr);
        //Creates controls in memory
        JLabel label1 = new JLabel("Link");
        JTextField fieldLink = new JTextField("Add a link");
        JLabel label2 = new JLabel("Add to...");
        JButton buttonPath = new JButton("Path");
        JTextField fieldPlace = new JTextField("Choose place...");
        JButton buttonStart = new JButton("Start");
        JButton buttonClear = new JButton("Clean");
        //Adds controls to the panel
        windowContent.add(label1);
        windowContent.add(fieldLink);
        windowContent.add(label2);
        windowContent.add(buttonPath);
        windowContent.add(fieldPlace);
        windowContent.add(buttonStart);
        windowContent.add(buttonClear);
        //Creates the frame and add the panel to it:
        JFrame frame = new JFrame("Downloader");
        //Add the panel to the top-level container
        frame.setContentPane(windowContent);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //set the size and make window visible
        frame.setSize(800,200);
        frame.setVisible(true);


    }
    @Override
    public void downloads(String link, String path) {
    }
}

class main{
    public static void main(String[] args ){
        UI ui = new UI();
    }
}
