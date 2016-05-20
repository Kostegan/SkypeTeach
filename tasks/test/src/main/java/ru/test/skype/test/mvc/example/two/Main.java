package ru.test.skype.test.mvc.example.two;

import ru.test.skype.test.mvc.example.two.Controller.Controller;
import ru.test.skype.test.mvc.example.two.Model.Model;
import ru.test.skype.test.mvc.example.two.View.View;

import javax.swing.SwingUtilities;


public class Main
{
    public static void main(String[] args) {
        Model model = new Model(0);
        View view = new View("-");
        Controller controller = new Controller(model,view);
        controller.control();

//        Runnable start = new Runnable() {
//            @Override
//            public void run() {
//                Model model = new Model(0);
//                View view = new View("-");
//                Controller controller = new Controller(model,view);
//                controller.control();
//            }
//        };
//        start.run();

//        SwingUtilities.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                Model model = new Model(0);
//                View view = new View("-");
//                Controller controller = new Controller(model,view);
//                controller.control();
//            }
//        });
    }
}
