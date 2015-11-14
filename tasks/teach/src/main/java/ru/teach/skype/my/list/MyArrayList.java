package ru.teach.skype.my.list;

import ru.teach.skype.Employee;
import ru.teach.skype.IEmployee;

/**
 * List contain employee. Each employee have field name, age, id.
 * Combination name + age + id is unique.
 */
public class MyArrayList<T extends IEmployee> implements IMyList<T> {
    private IEmployee[] arrayEmployee = new IEmployee[0];

    /**
     * append employee to end array
     *
     * @param employee object which will be append
     */
    public void addEmployee(IEmployee employee) {
        if (employee != null) {
            int size = arrayEmployee.length;
            IEmployee[] tmp = new Employee[size + 1];
            for (int i = 0; i < size; i++) {
                tmp[i] = arrayEmployee[i];
            }
            tmp[tmp.length - 1] = employee;
            arrayEmployee = tmp;
        } else {
            throw new NullPointerException("append employee is null");
        }
    }


    /**
     * delete element by specified index
     *
     * @param index specified element
     */
    public void deleteEmployeeByIndex(int index) {
        if (index < size() && index >= 0) {
            IEmployee[] tmp = new Employee[arrayEmployee.length - 1];
            for (int i = 0, j = 0; i < arrayEmployee.length; i++) {
                if (i != index) {
                    tmp[j] = arrayEmployee[i];
                    j++;
                }
            }
            arrayEmployee = tmp;
        } else {
            throw new IllegalArgumentException("Index is negative or index value is more, than is list size.");
        }
    }

    /**
     * @param employee element which be deleted
     */
    public int deleteEmployee(IEmployee employee) throws MyListException {
        int index;
        int amount=0;
            while ((index = getIndexByEmployee(employee)) != -1) {
                deleteEmployeeByIndex(index);
                amount++;
            }
        if(amount >= 1){
            return amount;
        } else {return -1;}
    }


    /**
     * @return amount elements in array
     */
    public int size() {
        return arrayEmployee.length;
    }

    public T getEmployeeByIndex(int index) {
        if (index > this.size() || index < 0) {
            throw new IllegalArgumentException("Index is negative or index is more than is size array");
        }
        return (T)arrayEmployee[index];
    }

    /**
     * @param employee element by which find index
     * @return
     */
    public int getIndexByEmployee(IEmployee employee) {
        if (employee != null) {
            for (int i = 0; i < size(); i++) {
                if (employee.equals(arrayEmployee[i])) {
                    return i;
                }
            }
        }
        return -1;
    }


    /**
     * @param employee element which must check
     * @return
     */
    public boolean containsEmployee(IEmployee employee) {
        return getIndexByEmployee(employee) != -1;
    }
}
