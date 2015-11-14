package ru.teach.skype.calculator.arithmetic.expression;

import ru.teach.skype.calculator.arithmetic.expression.items.IArithmeticExpressionItem;
import ru.teach.skype.calculator.arithmetic.expression.items.NumberItem;
import ru.teach.skype.calculator.arithmetic.expression.items.operation.IOperationItem;
import ru.teach.skype.calculator.arithmetic.expression.items.operation.OperationFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Содержит поле список items  в  которое записывается арифметическое выражение.
 */
public class ArithmeticExpression implements IArithmeticExpression {
    private List<IArithmeticExpressionItem> items = new ArrayList<>();

    public ArithmeticExpression() {

    }

    /**
     * Constructor create ArithmeticExpression and converts specified string to NumberItems and OperationItems.
     * @param string
     */
    public ArithmeticExpression(String string) {
        string = string.replace(" ", "");
        char[] arr = string.toCharArray();
        String number = "";
        for (char i : arr) {
            if (Character.isDigit(i)) {
                number += i;
            } else {
                items.add(convertStringToNumberItem(number));
                items.add(OperationFactory.getOperation(i));
                number="";
            }
        }
        items.add(convertStringToNumberItem(number));
    }

    /**
     * Method will convert a string to double and will create a NumberItem.
     * @param string which will be converted.
     * @return NumberItem
     */
    private IArithmeticExpressionItem convertStringToNumberItem(String string) {
        NumberItem number = new NumberItem();
        number.setNumber(Double.parseDouble(string));
        return number;
    }


    /**
     * @return Список арифметическое выражение
     */
    @Override
    public List<IArithmeticExpressionItem> getItems() {
        return items;
    }


    /**
     * @param index element which must return
     * @return element from list by specified index
     */
    public IArithmeticExpressionItem getIndexItem(int index) {
        return items.get(index);
    }

    /**
     * Make validate
     *
     * @throws ArithmeticExpressionException if List contains = null
     * @throws ArithmeticExpressionException if arithmetic expression have less three elements
     * @throws ArithmeticExpressionException if last item not is instanceof NumberItem class.
     */
    public void validate() throws ArithmeticExpressionException {
        if (items == null || items.size() == 0) {
            throw new ArithmeticExpressionException("List contains null.");
        } else if (items.size() < 3) {
            throw new ArithmeticExpressionException("Arithmetic expression must be have more two items.");
        } else if ((items.get(items.size() - 1)) instanceof IOperationItem) {
            throw new ArithmeticExpressionException("Last element must be NumberItem.");
        }
    }

    /**
     * Converts arithmetic expression to Polish expression.
     *
     * @return list polish expression
     */
    public List listPolishExpression() {
        List<IArithmeticExpressionItem> polishExpression = new ArrayList<>();
        int size = items.size();
        for (int i = 0; i < size; i++) {
            if (items.get(i) instanceof IOperationItem) {
                if (((IOperationItem) items.get(i)).getPriority() < 10 || i == 1 && ((IOperationItem) items.get(i)).getPriority() > 10) {
                    if (i == 1) {
                        polishExpression.add(items.get(i - 1));
                    }
                    polishExpression.add(items.get(i + 1));
                    polishExpression.add(items.get(i));
                }
            }
            if (items.get(i) instanceof IOperationItem && i != 1) {
                if (((IOperationItem) items.get(i)).getPriority() > 10) {
                    polishExpression.add(polishExpression.size() - 1, items.get(i + 1));
                    polishExpression.add(polishExpression.size() - 1, items.get(i));
                }
            }
        }
        return polishExpression;
    }

    /**
     * 1 + 2 * 3 * 4  - 5 / 6  to  1 2 3 * 4 * + 5 6 / -
     * 1+2*3   123*+
     * 1*2+3   12*3+
     *
     * @return
     */
    public Stack convertToPolish1() {
        Stack<IArithmeticExpressionItem> stack = new Stack<>();
        for (IArithmeticExpressionItem item : items) {
            if (stack.isEmpty()) {
                stack.push(item);
            } else {
                IArithmeticExpressionItem topItem = stack.peek();
                if (item instanceof NumberItem) {
                    if (topItem instanceof NumberItem) {
                        stack.push(item);
                    } else if (topItem instanceof IOperationItem) {
                        stack.pop();
                        IArithmeticExpressionItem topItem2 = stack.peek();
                        if (topItem2 instanceof IOperationItem && ((IOperationItem) topItem2).getPriority() > 10) {
                            stack.pop();
                            stack.push(item);
                            stack.push(topItem2);
                        } else {
                            stack.push(item);
                        }
                    }
                    stack.push(topItem);
                } else if (item instanceof IOperationItem) {
                    if (topItem instanceof NumberItem) {
                        stack.push(item);
                    } else if (topItem instanceof IOperationItem) {
                        if (((IOperationItem) topItem).getPriority() < ((IOperationItem) item).getPriority()) {
                            stack.pop();
                            stack.push(item);
                            stack.push(topItem);
                        } else {
                            stack.push(item);
                        }
                    }
                }
            }
        }
        Stack<IArithmeticExpressionItem> reverseStack = new Stack<>();
        while (!stack.empty()) {
            reverseStack.push(stack.pop());
        }
        return reverseStack;
    }


    public Stack convertToPolishExpression2() {
        Stack<IArithmeticExpressionItem> stack = new Stack<>();
        for (int i = 0; i > items.size(); i++) {
            if (stack.isEmpty()) {
                stack.push(items.get(i));
            } else {
                IArithmeticExpressionItem item = items.get(i);
                IArithmeticExpressionItem topItem = stack.peek();
                if (item instanceof NumberItem) {
                    if (topItem instanceof IOperationItem) {

                    } else {
                        stack.push(item);
                    }
                } else if (item instanceof IOperationItem) {
                    if (topItem instanceof NumberItem) {
                        stack.push(item);
                    } else if (topItem instanceof IOperationItem) {
                        if (((IOperationItem) topItem).getPriority() > ((IOperationItem) item).getPriority()) {
                            stack.pop();
                            stack.push(item);
                            stack.push(topItem);
                        } else {
                            stack.push(item);
                        }
                    }

                }
            }
        }
        return null;
    }

    /**
     * 1 + 2 * 3 -2
     * 1. 1
     * 2. 1 +
     * 3. 12+
     * 4. 12*+
     * 5. 123*+
     * 6. 123*+-
     * 7. 123*+2-
     *
     * @return
     */


    public Stack convertToPolishExpression3() {
        Stack<IArithmeticExpressionItem> stack = new Stack<>();
        for (int i = 0, j = 1; j < items.size(); ) {
            if (stack.isEmpty()) {
                stack.push(items.get(i));
            } else {
                IArithmeticExpressionItem itemOperation = items.get(j);
                IArithmeticExpressionItem itemNumber = items.get(j += 1);
                IArithmeticExpressionItem topItem = stack.peek();
                if (topItem instanceof IOperationItem) {
                    if (((IOperationItem) topItem).getPriority() < ((IOperationItem) itemOperation).getPriority()) {
                        stack.pop();
                        stack.push(itemNumber);
                        stack.push(itemOperation);
                        stack.push(topItem);
                    } else {
                        stack.push(itemNumber);
                        stack.push(itemOperation);
                    }
                } else {
                    stack.push(itemNumber);
                    stack.push(itemOperation);
                }
                j += 1;
            }
        }
        Stack<IArithmeticExpressionItem> reverseStack = new Stack<>();
        while (!stack.empty()) {
            reverseStack.push(stack.pop());
        }
        return reverseStack;
    }


    public Stack convertToPolishExpression() {
        Stack<IArithmeticExpressionItem> stack = new Stack<>();
        int size = items.size() - 1;
        for (int i = size; i >= 0; i--) {
            if (items.get(i) instanceof IOperationItem || i == 0) {
                if (i >= 2 && ((IOperationItem) items.get(i)).getPriority() < 10 && ((IOperationItem) items.get(i - 2)).getPriority() < 10) {
                    stack.push(items.get(i));
                    stack.push(items.get(i + 1));
                } else if (i == size - 1 && ((IOperationItem) items.get(i)).getPriority() < 10) {
                    stack.push(items.get(i));
                    stack.push(items.get(i + 1));
                } else if (items.get(i) instanceof IOperationItem && ((IOperationItem) items.get(i)).getPriority() < 10 && ((IOperationItem) items.get(i + 2)).getPriority() > 10) {
                    stack.push(items.get(i - 1));
                } else if (items.get(i) instanceof IOperationItem && ((IOperationItem) items.get(i)).getPriority() < 10) {
                    stack.push(items.get(i));
                    stack.push(items.get(i + 1));
                } else if (i >= 2 && items.get(i) instanceof IOperationItem && ((IOperationItem) items.get(i)).getPriority() > 10) {
                    stack.push(items.get(i - 2));
                    stack.push(items.get(i));
                    stack.push(items.get(i + 1));
                    stack.push(items.get(i - 1));
                } else if (i == 1 && ((IOperationItem) items.get(i)).getPriority() > 10) {
                    stack.push(items.get(i));
                    stack.push(items.get(i + 1));
                    stack.push(items.get(i - 1));
                } else if (i == 0) {
                    stack.push(items.get(i));
                }
            }
        }
//        Stack<IArithmeticExpressionItem> reverseStack = new Stack<>();
//        while (!stack.empty()) {
//            reverseStack.push(stack.pop());
//        }
//        return reverseStack;
        return stack;
    }


//
//    public Stack convertToPolishExpression() {
//        Stack<IArithmeticExpressionItem> stack = new Stack<>();
//        int size = items.size() - 1;
//        for (int i = size; i >= 0; i--) {
//            if (i >= 2 && items.get(i) instanceof IOperationItem && ((IOperationItem) items.get(i)).getPriority() < 10 && ((IOperationItem) items.get(i - 2)).getPriority() < 10) {
//                stack.push(items.get(i));
//                stack.push(items.get(i + 1));
//            } else if (i==size -1 && items.get(i) instanceof IOperationItem && ((IOperationItem) items.get(i)).getPriority() < 10) {
//                stack.push(items.get(i));
//                stack.push(items.get(i + 1));
//            } else if (items.get(i) instanceof IOperationItem && ((IOperationItem) items.get(i)).getPriority() < 10 && ((IOperationItem) items.get(i + 2)).getPriority() > 10) {
//                stack.push(items.get(i - 1));
//            } else if (items.get(i) instanceof IOperationItem && ((IOperationItem) items.get(i)).getPriority() < 10) {
//                stack.push(items.get(i));
//                stack.push(items.get(i + 1));
//            } else if (i == 0 && items.get(i) instanceof IOperationItem) {
//                stack.push(items.get(i));
//            } else if (i >= 2 && items.get(i) instanceof IOperationItem && ((IOperationItem) items.get(i)).getPriority() > 10) {
//                stack.push(items.get(i - 2));
//                stack.push(items.get(i));
//                stack.push(items.get(i + 1));
//                stack.push(items.get(i - 1));
//            } else if (i == 1 && items.get(i) instanceof IOperationItem && ((IOperationItem) items.get(i)).getPriority() > 10) {
//                stack.push(items.get(i));
//                stack.push(items.get(i + 1));
//                stack.push(items.get(i - 1));
//            } else if (i == 0) {
//                stack.push(items.get(i));
//            }
//        }
//        Stack<IArithmeticExpressionItem> reverseStack = new Stack<>();
//        while (!stack.empty()) {
//            reverseStack.push(stack.pop());
//        }
//        return reverseStack;
//    }

//    public Stack convertToPolishExpression() {
//        Stack<IArithmeticExpressionItem> stack = new Stack<>();
//        for (int i = 0; i < items.size(); i++) {
//            if (i == 1 && items.get(i) instanceof IOperationItem && ((IOperationItem) items.get(i)).getPriority() < 10 && ((IOperationItem) items.get(3)).getPriority() < 10) {
//                stack.push(items.get(i - 1));
//                stack.push(items.get(i + 1));
//                stack.push(items.get(i));
//            } else if (i == 1 && items.get(i) instanceof IOperationItem && ((IOperationItem) items.get(i)).getPriority() < 10 && ((IOperationItem) items.get(3)).getPriority() > 10) {
//                stack.push(items.get(i - 1));
//                stack.push(items.get(i + 1));
//                stack.push(items.get(i));
//            } else if (items.get(i) instanceof IOperationItem && ((IOperationItem) items.get(i)).getPriority() > 10) {
//                stack.push(items.get(i - 1));
//                stack.push(items.get(i + 1));
//                stack.push(items.get(i));
//            } else if (items.get(i) instanceof IOperationItem && ((IOperationItem) items.get(i)).getPriority() < 10) {
//                stack.push(items.get(i + 1));
//                stack.push(items.get(i));
//            }
//        }
//        Stack<IArithmeticExpressionItem> reverseStack = new Stack<>();
//        while (!stack.empty()) {
//            reverseStack.push(stack.pop());
//        }
//        return reverseStack;
//    }

//
//    public Stack convertToPolishExpression() {
//        Stack<IArithmeticExpressionItem> stack = new Stack<>();
//        for (int i = 0; i < items.size(); i++) {
//            if (i == 1 || items.get(i) instanceof IOperationItem && ((IOperationItem) items.get(i)).getPriority() > 1) {
//                stack.push(items.get(i - 1));
//                stack.push(items.get(i + 1));
//                stack.push(items.get(i));
//            } else if (items.get(i) instanceof IOperationItem && ((IOperationItem) items.get(i)).getPriority() == 1) {
//                stack.push(items.get(i + 1));
//                stack.push(items.get(i));
//            }
//        }
//        Stack<IArithmeticExpressionItem> reverseStack = new Stack<>();
//        while (!stack.empty()) {
//            reverseStack.push(stack.pop());
//        }
//        return reverseStack;
//    }

//    public Stack convertToPolishExpression() {
//        Stack<IArithmeticExpressionItem> stack = new Stack<>();
//        for (int i = 0; i < items.size(); i++) {
//            if (i == 0 && items.get(i) instanceof NumberItem) {
//                stack.push(items.get(i));
//                stack.push(items.get(i + 2));
//                stack.push(items.get(i + 1));
//                i = i + 2;
//            } else if (items.get(i) instanceof NumberItem) {
//                stack.push(items.get(i));
//                stack.push(items.get(i - 1));
//            }
//        }
//        Stack<IArithmeticExpressionItem> reverseStack = new Stack<>();
//        while(!stack.empty()){
//            reverseStack.push(stack.pop());
//        }
//        return reverseStack;
//    }

    private Stack copyItemToStack(List<IArithmeticExpressionItem> tmp) {
        Stack<IArithmeticExpressionItem> stack = new Stack<>();
        int size = tmp.size();
        for (int i = 0; i < size; ) {
            stack.push(tmp.get(size - 1));
            size--;
        }
        return stack;
    }


    public void addItem(IArithmeticExpressionItem item) {
        if (items.isEmpty() && item instanceof NumberItem) {
            items.add(item);
        } else {
            if (items.size() != 0) {
                IArithmeticExpressionItem last = items.get(items.size() - 1);
                if (item instanceof IOperationItem && last instanceof NumberItem) {
                    items.add(item);
                } else if (item instanceof NumberItem && last instanceof IOperationItem) {
                    items.add(item);
                } else {
                    throw new ArithmeticExpressionException("Wrong arithmetic expression");
                }
            } else {
                throw new ArithmeticExpressionException("Arithmetic expression must begin with number, not operations.");
            }
        }
    }

}