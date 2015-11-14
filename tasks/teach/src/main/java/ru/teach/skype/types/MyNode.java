package ru.teach.skype.types;

import ru.teach.skype.IEmployee;

/**
 * Test class implements method removeMyNode
 */
public class MyNode {
    private int number;
    IEmployee employee;
    MyNode next;

    public MyNode(int value) {
        setNumber(value);
    }

    public void setNext(MyNode next) {
        this.next = next;
    }

    public MyNode getNext() {
        return next;
    }

    /**
     * @param number the value will be set to number
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * ���������� �������� ������������� � number.
     */
    public int getNumber() {
        return number;
    }


    /**
     * Delete element from list
     * 1 -> 6 -> 10 -> 15 -> 20 => 1 -> 6 -> 10 -> 20
     * delete 15:
     * 0. prev=null, current=1
     * 1. prev=current=1, current=current.next=6
     * 2. prev=current=6, current=current.next=10
     * 3. prev=current=10, current=current.next=15
     * 3.1 prev.next=current.next (10 -> 20)
     */
    public void removeNode(MyNode first ,int value) {

        MyNode prev = null;
        for (MyNode current = first; current != null; ) { // todo while
            if (current.getNumber() != value) {
                current = current.getNext();
            } else{}
        }
    }
}
