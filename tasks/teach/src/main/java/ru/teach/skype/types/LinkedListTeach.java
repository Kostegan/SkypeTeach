package ru.teach.skype.types;

/**
 *
 */
public class LinkedListTeach {
    public static void main(String[] args) {
        // 3 -> 5 -> 8 > 2
        Node n3 = new Node(3);
        Node n5 = new Node(5);
        Node n8 = new Node(8);
        Node n2 = new Node(2);

        n3.setNext(n5);
        n5.setNext(n8);
        n8.setNext(n2);

        System.out.println(n3.getValue());
        System.out.println(n3.getNext().getValue());
        System.out.println(n3.getNext().getNext().getValue());
        System.out.println(n3.getNext().getNext().getNext().getValue());

//        n3.setNext(n8); // remove 5
//        n3.setNext(n3.getNext().getNext());
        remove(n3, 5);
        System.out.println("===remove 5====");
        System.out.println(n3.getValue());
        System.out.println(n3.getNext().getValue());
        System.out.println(n3.getNext().getNext().getValue());
    }

    public static void remove(Node first, int value) {
        // todo
    }

}

class Node {
    int value;

    Node next;


    public Node(int value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}