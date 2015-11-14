package ru.teach.skype.work.repeat.lesson.map;

import java.util.LinkedList;
import java.util.List;

/**
 *
 */
public class TreeNode {
    private int value;
    private TreeNode leftNode;
    private TreeNode rightNode;

    public int getValue() {
        return value;
    }

    public TreeNode() {

    }

    public TreeNode(int value) {
        this.value = value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public TreeNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public TreeNode getRightNode() {
        return rightNode;
    }

    public boolean isLeaf(){
        return this.getLeftNode()== null && this.getRightNode()==null;
    }

    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }

    public int getSubNodeCount() {
        int count = 0;
        if (leftNode != null) {
            count += getLeftNode().getSubNodeCount() + 1;
        }
        if (rightNode != null) {
            count += getRightNode().getSubNodeCount() + 1;
        }
        return count;
    }


    public int getNextNode(){
        int i=0;
        TreeNode next;
        if(leftNode!=null){
            i += leftNode.getNextNode();
            return i;
        }
        return 0;
    }

    public String toString(){
        String str = value + " ";
        if (leftNode != null) {
            str += getLeftNode().toString()+" ";
        }
        if (rightNode != null) {
            str +=getRightNode().toString()+" ";
        }

        return str;
    }

//    List<TreeNode> nodes = new LinkedList<>();
//    nodes.add(tree.getRoot());
//    while (!nodes.isEmpty()) {
//        TreeNode first = nodes.remove(0);
//        if (first.getLeftNode() != null) {
//            nodes.add(first.getLeftNode());
//        }
//        if (first.getRightNode() != null) {
//            nodes.add(first.getRightNode());
//        }
//        System.out.println(first.getValue());
//    }

    // init: [1]
    // 1) first=1, [10, 20]
    // 2) first=10, [20, 210, 220]
    // 3) first=20, [210, 220, 310, 340]
    // 4) first=210, [220, 310, 340, 315, 345]
    // 5) first=220, [310, 340, 315, 345]
    // 6) first=310, [340, 315, 345]
    // 7) first=340, [315, 345]
    // 8) first=315, [345]
    // 9) first=345, []
    // exit


    public String toStringWidth(){
        List<TreeNode> nodes = new LinkedList<>();
        String str = "";
        nodes.add(this);
        while(!nodes.isEmpty()){
            TreeNode firstNode = nodes.remove(0);
            if(firstNode.getLeftNode()!=null){
                nodes.add(firstNode.getLeftNode());
            }
            if(firstNode.getRightNode()!=null){
                nodes.add(firstNode.getRightNode());
            }
            str+=" "+firstNode.getValue();
        }
        return str;
    }



}
