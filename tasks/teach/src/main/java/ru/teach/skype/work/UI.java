package ru.teach.skype.work;

import javax.swing.*;
import java.awt.*;

/**
 *
 */
public class UI {
    // Declare all calculators components.
    JPanel windowContent;
    private JTextField displayField;
    JButton button0;
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;
    JButton button7;
    JButton button8;
    JButton button9;
    JButton buttonMultiply;
    JButton buttonPlus;
    JButton buttonMinus;
    JButton buttonDivision;
    JButton buttonEqual;
    JPanel p1;

    public void setDisplayValue(String val){
        this.displayField.setText(val);
    }

    public String getDisplayValue(){

        return this.displayField.getText();
    }
    public UI(){
        windowContent = new JPanel();

        //Set the layout manager for this panel
        BorderLayout b1 = new BorderLayout();
        windowContent.setLayout(b1);

        //Create the display field and place it in the
        //North area of the window
        displayField  = new JTextField(30);
        windowContent.add("North",displayField);

        //Create button


        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");
        button4 = new JButton("4");
        button5 = new JButton("5");
        button6 = new JButton("6");
        button7 = new JButton("7");
        button8 = new JButton("8");
        button9 = new JButton("9");
        button0 = new JButton("0");
        buttonMultiply = new JButton("*");
        buttonPlus = new JButton("+");
        buttonMinus = new JButton("-");
        buttonDivision = new JButton("/");
        buttonEqual = new JButton("=");

        // Create the panel

        p1 = new JPanel();
        GridLayout g1 = new GridLayout(5,4);
        p1.setLayout(g1);

        //add window controls to the panel p1


        p1.add(button1);
        p1.add(button2);
        p1.add(button3);
        p1.add(button4);
        p1.add(button5);
        p1.add(button6);
        p1.add(button7);
        p1.add(button8);
        p1.add(button9);
        p1.add(button0);
        p1.add(buttonPlus);
        p1.add(buttonMinus);
        p1.add(buttonMultiply);
        p1.add(buttonDivision);
        p1.add(buttonEqual);

        CalculatorEngine calcEngine = new CalculatorEngine(this);
        button0.addActionListener(calcEngine);
        button1.addActionListener(calcEngine);
        button2.addActionListener(calcEngine);
        button3.addActionListener(calcEngine);
        button4.addActionListener(calcEngine);
        button5.addActionListener(calcEngine);
        button6.addActionListener(calcEngine);
        button7.addActionListener(calcEngine);
        button8.addActionListener(calcEngine);
        button9.addActionListener(calcEngine);
        buttonPlus.addActionListener(calcEngine);
        buttonMinus.addActionListener(calcEngine);
        buttonDivision.addActionListener(calcEngine);
        buttonMultiply.addActionListener(calcEngine);
        buttonEqual.addActionListener(calcEngine);


        //Add the panel p1 to the center of the window
        windowContent.add("Center",p1);

        //Create the frame and set its content pane

        JFrame frame = new JFrame("ui");
        frame.setContentPane(windowContent);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();

        frame.setVisible(true);
    }

    public static void main(String[] args){
        new UI();
    }


}
