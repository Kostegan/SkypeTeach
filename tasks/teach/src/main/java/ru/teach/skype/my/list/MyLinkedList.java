package ru.teach.skype.my.list;

import ru.teach.skype.IEmployee;

/**
 *
 */
public class MyLinkedList<T extends IEmployee> implements IMyList<T> {
    private MyNode<T> first;
    private MyNode<T> last;

    /**
     * specified element will appended to end list
     * if list is empty then the element set to first
     *
     * @param employee object which will be append
     * @throws NullPointerException �������� ��� add null
     */
    @Override
    public void addEmployee(T employee) throws NullPointerException {
        if (employee != null) {
            if (first != null) {
                last.setNext(new MyNode<>(employee));
                last = last.getNext();
            } else {
                first = last = new MyNode<>(employee);
            }
        } else {
            throw new NullPointerException("append employee is null");
        }
    }

//    /**
//     * Delete element from list
//     * 1 -> 6 -> 10 -> 15 -> 20 => 1 -> 6 -> 10 -> 20
//     * delete 15:
//     * 0. prev=null, current=1
//     * 1. prev=current=1, current=current.next=6
//     * 2. prev=current=6, current=current.next=10
//     * 3. prev=current=10, current=current.next=15
//     * 3.1 prev.next=current.next (10 -> 20)
//     */

    @Override
    public void deleteEmployeeByIndex(int index) {
        if (index >= 0 && first != null) {
            MyNode<T> deletedNode = first;
            MyNode<T> prevNode = null;
            int counter = 0;
            while (index != counter) {
                prevNode = deletedNode;
                deletedNode = deletedNode.getNext();
                if (deletedNode != null) {
                    counter++;
                } else {
                    throw new IllegalArgumentException("Index value is more then is list size.");
                }
            }
            deleteNode(deletedNode, prevNode);
        } else {
            throw new IllegalArgumentException("Index is negative or list is empty.");
        }
    }

    @Override
    public int deleteEmployee(T employee) {
        int count = 0;
        if (first != null) {
            MyNode<T> deletedNode = first;
            MyNode<T> prevNode = null;
            while (deletedNode != null) {
                if (deletedNode.getEmployee().equals(employee)) {
                    deleteNode(deletedNode, prevNode);
                    count++;
                } else {
                    prevNode = deletedNode;
                }
                deletedNode = deletedNode.getNext();
            }
        }
        if (count > 0) {
            return count;
        } else {
            return -1;
        }

    }


    /**
     * 1,2,3
     * deleteNode(2), prevNode(1)
     * <p>
     * 1
     * deleteNode(1), prevNode(1)
     */

    private void deleteNode(MyNode<T> deletedNode, MyNode<T> prevNode) {
        if (first == deletedNode) {
            first = first.getNext();
            deletedNode = first;
        } else {
            prevNode.setNext(deletedNode.getNext());
        }
        if (last == deletedNode) {
            last = prevNode;
        }
    }

    private boolean amountEmployee(int i) {
        if (first != null) {
            int index = 1;
            MyNode current = first;
            if (i == 1) {
                return true;
            } else {
                while (index <= i) {
                    if (current.getNext() != null) {
                        index++;
                    } else {
                        return false;
                    }
                }
            }
        }

        return false;
    }

    private int findsEmployee(T employee) {
        int i = -1;
        MyNode prev = null;
        MyNode current = first;
        while (current.getNext() != null) {
            if (current.getEmployee().equals(employee)) {
                prev.setNext(current.getNext());
                i = 0;
                i++;
            } else {
                prev = current;
                current.getNext();

            }
        }
        return i;
    }


    @Override
    public int size() {
        int i = 0;
        if (first != null) {
            i++;
            MyNode current = first;
            while ((current = current.getNext()) != null) {
                i++;
            }
        }
        return i;
    }

    @Override
    public T getEmployeeByIndex(int index) {
        if (first != null) {
            MyNode<T> current = first;
            int i = 0;
            if (index >= 0) {
                while (current != null) {
                    if (i != index) {
                        current = current.getNext();
                        i++;
                    } else {
                        return current.getEmployee();
                    }
                }
            } else {
                throw new IllegalArgumentException("Index value is negative.");
            }
        }
        throw new IllegalArgumentException("List is empty.");
    }

    @Override
    public int getIndexByEmployee(T employee) {
        MyNode<T> current = first;
        int index = 0;
        while (current != null) {
            if (current.getEmployee().equals(employee)) {
                return index;
            }
            current = current.getNext();
            index++;
        }
        return -1;
    }

    @Override
    public boolean containsEmployee(T employee) {
        MyNode<T> current = first;
        while (current != null) {
            if (current.getEmployee().equals(employee)) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }
}
