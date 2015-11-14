package ru.teach.skype.work.tree.node.my.test;

/**
 *
 */
public class TreeNode {
    private String value;

    public TreeNode(){

    }

    public TreeNode(String value){
        this.value = value;
    }

    private TreeNode leftNode;

    private TreeNode rightNode;

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setLeftNode(TreeNode node) {
        leftNode = node;
    }

    public void setRightNode(TreeNode node) {
        rightNode = node;
    }

    public TreeNode getLeftNode() {
        return leftNode;
    }

    public TreeNode getRightNode() {
        return rightNode;
    }

    public int getCountNode() {
        int count = 0;
        if (leftNode != null) {
            count += leftNode.getCountNode() + 1;
        }
        if (rightNode != null) {
            count += rightNode.getCountNode() + 1;
        }
        return count;
    }

    public String toString(){
        String str = value;
        if(leftNode!=null){
            str +=" "+leftNode.toString();
        }
        if(rightNode!=null){
            str+=" "+rightNode.toString();
        }
        return str;
    }

    /**
     *
     */
    public String toStringWide(){
        String str = value;
        TreeNode currentNode = leftNode;
        while(currentNode!=null){
            str+=currentNode.getValue();
        }
        if(leftNode!=null){
            str +=" "+leftNode.toString();
        }
        if(rightNode!=null){
            str+=" "+rightNode.toString();
        }
        return str;
    }
}
