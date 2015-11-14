package ru.teach.skype.types.my.tests.factorial;

/**
 * Class implements interface IUI. User will can calculate factorial specified number.
 */
public class UI implements IUI {
    /**
     * Number - factorial this number will be need find.
     */
    private int number;

    /**
     * Set specified number to field number.
     */
    public void setNumber(int number){
        this.number = number;
    }

    /**
     * Calculate factorial specified number, and return result.
     * @param number -  factorial this number will be need find.
     * @return factorial number.
     */
    public int calculateFactorialForEach(int number){
        ICalculateFactorial factorial = new CalculateFactorial();
        return factorial.calculateFactorialForEach(number);
    }

    public int calculateFactorialRecursive(int number){
        ICalculateFactorial factorial = new CalculateFactorial();
        return factorial.calculateFactorialRecursive(number);
    }


}
