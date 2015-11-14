package ru.teach.skype.work;

import ru.teach.skype.calculator.Calculator;
import ru.teach.skype.calculator.CalculatorResult;
import ru.teach.skype.calculator.ICalculator;
import ru.teach.skype.calculator.arithmetic.expression.ArithmeticExpression;
import ru.teach.skype.calculator.arithmetic.expression.IArithmeticExpression;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 */
public class CalculatorEngine implements ActionListener {

    UI parent;

    CalculatorEngine(UI parent) {
        this.parent = parent;
    }

    public void actionPerformed(ActionEvent e) {
        JButton clickedButton = (JButton) e.getSource();
        String dispFieldText = parent.getDisplayValue();
        String clickButtonLabel = clickedButton.getText();
        if (clickButtonLabel != "=") {
            parent.setDisplayValue(dispFieldText + clickButtonLabel);
        } else {
            IArithmeticExpression expression = new ArithmeticExpression(parent.getDisplayValue());
            ICalculator calculator = new Calculator();
            CalculatorResult result = calculator.calculate(expression);
            String stringResult = result.getResult().getNumber()+"";
            parent.setDisplayValue(stringResult);
        }
    }
}

