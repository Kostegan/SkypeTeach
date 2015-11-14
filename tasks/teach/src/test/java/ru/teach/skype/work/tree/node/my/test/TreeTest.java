package ru.teach.skype.work.tree.node.my.test;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 */
public class TreeTest {
    @Test
    public void calculateCountNodeTrees(){
        Tree treeRoot = new Tree();
        treeRoot.setRoot("11");
        TreeNode node1 = new TreeNode("22");
        TreeNode node2 = new TreeNode("90");
        TreeNode node3 = new TreeNode("95");
        TreeNode node4 = new TreeNode("100");
        TreeNode node5 = new TreeNode("110");
        TreeNode node6 = new TreeNode("120");

        treeRoot.getRoot().setLeftNode(node1);
        treeRoot.getRoot().setRightNode(node2);
        node1.setLeftNode(node5);
        node1.setRightNode(node6);
        node2.setLeftNode(node3);
        node2.setRightNode(node4);
        System.out.println(treeRoot.toString());

        assertFalse("Tree is not empty: ", treeRoot.isEmpty());
        assertEquals("Amount of nodes :",7,treeRoot.getSubNodeCounter());
    }
}
