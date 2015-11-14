package ru.teach.skype.types.my.tests.factorial;

/**
 * Interface implements class CalculateFactorial.
 */
public interface ICalculateFactorial {
    /**
     * Calculates a factorial method foreach.
     * @param number factorial this number will be find.
     * @return factorial number.
     */
    public int calculateFactorialForEach(int number);

    /**
     *  Calculate a factorial method recursive.
     * @param number
     * @return
     */
    public int calculateFactorialRecursive(int number);



}
