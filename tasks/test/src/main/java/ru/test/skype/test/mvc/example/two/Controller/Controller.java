package ru.test.skype.test.mvc.example.two.Controller;

import ru.test.skype.test.mvc.example.two.Model.Model;
import ru.test.skype.test.mvc.example.two.View.View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 */
public class Controller {
    private Model model;
    private View view;
    private ActionListener actionListener1;
    private ActionListener actionListener2;
//    int i=1;

    public Controller(Model model, View view){
        this.model = model;
        this.view = view;

    }

    public void control(){
        actionListener1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                linkBtnAndLabel();
            }

        };

        actionListener2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                linkBtnAndLabel2();
            }
        };
        view.getButton1().addActionListener(actionListener1);
        view.getButton2().addActionListener(actionListener2);

    }

    private void linkBtnAndLabel(){
        model.incX();
        view.setText(Integer.toString(model.getX()));
    }


    private void linkBtnAndLabel2(){
        model.reduceX();
        view.setText(Integer.toString(model.getX()));
    }

}
