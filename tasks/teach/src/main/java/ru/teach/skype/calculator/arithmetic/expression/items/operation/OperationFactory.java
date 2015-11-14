package ru.teach.skype.calculator.arithmetic.expression.items.operation;

/**
 * Class contain the array with operations which you can use in an arithmetic expressions.
 */
public class OperationFactory {

//    static String availableOperations = availableOperation();
    /**
     * Array consist from elements, every element in array it is a some operation.
     */
    private static IOperationItem[] operations = {
            new PlusOperationItem(),
            new MinusOperationItem(),
            new MultiplicationOperationItem(),
            new DivisionOperationItem()
    };

    /**
     * Method is for define a operation.
     *
     * @param operation value from which will be defined operation.
     * @return found a operation.
     */
    public static IOperationItem getOperation(char operation) {
        for (IOperationItem operationItem : operations) {
            if (operationItem.getOperation() == operation) {
                return operationItem;
            }
        }
        throw new IllegalArgumentException("Operation not identifies: " +"\""+ operation +"\""+ ". Available operations: " + availableOperation());
    }

//    private static String availableOperation() {
//        String allOperations = "";
//        for (IOperationItem operation : operations) {
//            allOperations += operation.getOperation() + ",";
//        }
//        int i = allOperations.length();
//        allOperations = allOperations.substring(0, i - 1);
//        return allOperations + ".";
//    }

    private static String availableOperation() {
        StringBuilder allOperations = new StringBuilder();
        for (IOperationItem operation : operations) {
            allOperations.append(operation.getOperation()).append(",");
        }
        allOperations.setCharAt(allOperations.length()-1,'.');
        return allOperations.toString();
    }
}
