package ru.teach.skype.my.list;

import ru.teach.skype.IEmployee;

/**
 *
 */
public class MyNode<T extends IEmployee> {
    private T employee;
    private MyNode next;

    public MyNode(T employee){
        setEmployee(employee);
    }

    public T getEmployee() {
        return employee;
    }

    public void setEmployee(T employee) {
        this.employee = employee;
    }

    public MyNode<T> getNext() {
        return next;
    }

    public void setNext(MyNode next) {
        this.next = next;
    }
}
