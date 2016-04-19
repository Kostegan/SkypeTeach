package ru.test.skype.test.mvc.example.one.View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 */
public class CatWindow extends JFrame implements ICatWindow {
    JPanel jPanel = new JPanel();
    Label nameLabel;
    Label ageLabel;
    TextField nameTextField;
    TextField ageTextField;
    Button record;

    private String[] list = new String[2];

    public void init(String str,int age){
        setSize(400,80);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("View a cat.");
        Label label1 = new Label("Cat name:");
        Label label2 = new Label("Cat age:");

        jPanel.setLayout(new GridLayout(3,2));

        jPanel.add(label1);
        jPanel.add(nameTextField = new TextField(str));
        jPanel.add(label2);
        jPanel.add(ageTextField = new TextField(age+""));
        jPanel.add(record = new Button("Record"));

        String nameString = nameTextField.getText();
        String ageString = ageTextField.getText();
        nameTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                list[0]= nameString;
                list[1]= ageString;
            }
        });
        add(jPanel);
        setVisible(true);
    }

    @Override
    public void printInfo(String name, int age) {
        init(name,age);
    }

    public String[] getNewCatInfo(){
        return list;
    }
}
