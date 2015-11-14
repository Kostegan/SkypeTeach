package ru.teach.skype.types;

import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 */
public class MyNodeTest {

    @Test
    public void addMyNode(){
        MyNode node1 = new MyNode(10);
        MyNode node2 = new MyNode(20);
        MyNode node3 = new MyNode(30);
        MyNode node4 = new MyNode(40);
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        assertEquals(10, node1.getNumber());
        assertEquals(20, node1.getNext().getNumber());
        assertEquals(30, node1.getNext().getNext().getNumber());
        assertEquals(40,node1.getNext().getNext().getNext().getNumber());
        node1.removeNode(node1,20);
        assertEquals(30,node1.getNext().getNumber());
    }
}
