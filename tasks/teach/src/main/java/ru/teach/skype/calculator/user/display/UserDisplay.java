package ru.teach.skype.calculator.user.display;

import ru.teach.skype.calculator.Calculator;
import ru.teach.skype.calculator.CalculatorResult;
import ru.teach.skype.calculator.ICalculator;
import ru.teach.skype.calculator.arithmetic.expression.ArithmeticExpression;
import ru.teach.skype.calculator.arithmetic.expression.IArithmeticExpression;

import java.util.Scanner;

/**
 *
 */
public class UserDisplay implements IUserDisplay {
    private String example;

    public void setExample(String str) {
        example = str;
    }

    public void printCalculator(){
        System.out.println("Enter expression:");
        Scanner scanner = new Scanner(System.in);
        CalculatorResult result = calculate(scanner.nextLine());
        System.out.println(result.getResult()+"");
    }
    public CalculatorResult calculate(String string) {
        IArithmeticExpression expression = new ArithmeticExpression(string);
        ICalculator calculator = new Calculator();
        CalculatorResult result = calculator.calculate(expression);
        return result;
    }

    public static void main(String[] args) {
        UserDisplay d = new UserDisplay();
        d.printCalculator();
    }

//    /**
//     * Method will convert a string to double and will create a NumberItem.
//     * @param str which will be converted.
//     * @return NumberItem
//     */
//    private NumberItem convertStringToNumberItem(String str) {
//        NumberItem number = new NumberItem();
//        number.setNumber(Double.parseDouble(str));
//        return number;
//    }
//
//    private IOperationItem searchOperation(char arr) {
//        return OperationFactory.getOperation(arr);
//    }
}
