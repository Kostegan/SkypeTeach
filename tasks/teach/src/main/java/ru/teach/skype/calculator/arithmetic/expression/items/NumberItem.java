package ru.teach.skype.calculator.arithmetic.expression.items;

/**
 *
 */
public class NumberItem  implements IArithmeticExpressionItem {
    private double number;

    public NumberItem(){

    }


    public NumberItem(double number){
        setNumber(number);
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public String toString(){
        return ""+number;
    }
}
