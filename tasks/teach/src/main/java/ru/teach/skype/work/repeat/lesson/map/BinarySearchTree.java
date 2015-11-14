package ru.teach.skype.work.repeat.lesson.map;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class BinarySearchTree extends Tree {
    public TreeNode add(int value) {
        if (isEmpty()) {
            this.setRoot(value);
            return getRoot();
        }
        TreeNode node = getRoot();
        while (true) {
            if (node.getValue() > value) {
                if (node.getLeftNode() == null) {
                    TreeNode result = new TreeNode(value);
                    node.setLeftNode(result);
                    return result;
                }
                node = node.getLeftNode();
            }
            if (node.getValue() < value) {
                if (node.getRightNode() == null) {
                    TreeNode result = new TreeNode(value);
                    node.setRightNode(result);
                    return result;
                }
                node = node.getRightNode();
            }
        }
    }

    public void parse(String str) {
        // todo convert string to Tree
        // str = "1:(5:(9,),6:(7:(10,),8:(,0))"
    }

    public boolean contains(int targetValue) {
        if (isEmpty()) {
            return false;
        }
        TreeNode node = getRoot();
        while (node != null) {
            if (node.getValue() >= targetValue) {
                if (node.getValue() > targetValue) {
                    node = node.getLeftNode();
                } else {
                    return valueEquals(node.getValue(), targetValue);
                }
            }
            if (node.getValue() <= targetValue) {
                if (node.getValue() < targetValue) {
                    node = node.getRightNode();
                } else {
                    return valueEquals(node.getValue(), targetValue);
                }
            }
        }
        return false;
    }

    private boolean valueEquals(int valueNode, int targetValue) {
        return valueNode == targetValue;
    }

    public List<Integer> getSortValues() {
        List<Integer> values = new ArrayList<>();
        TreeNode node = getRoot();
        if(node.getLeftNode()!=null){
            values.add(node.getLeftNode().getValue());
        }
        if(node.getRightNode()!=null){
            values.add(node.getRightNode().getValue());
        }
        return values;
    }

    public int getMinValue() {
        int result;
        TreeNode node = getRoot();
        result = node.getValue();
        while(node.getLeftNode()!=null){
            result = node.getLeftNode().getValue();
            node = node.getLeftNode();
        }
        return result;
    }

    public int getMaxValue() {
        int result;
        TreeNode node = getRoot();
        result = node.getValue();
        while(node.getRightNode()!=null){
            result = node.getRightNode().getValue();
            node = node.getRightNode();
        }
        return result;
    }






}
