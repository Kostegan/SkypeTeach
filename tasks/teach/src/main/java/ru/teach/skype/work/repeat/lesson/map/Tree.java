package ru.teach.skype.work.repeat.lesson.map;

/**
 *
 */
public class Tree {
    private TreeNode root;

    public boolean isEmpty() {
        return root == null;
    }

    public void setRoot(int value) {
        if (isEmpty()) {
            root = new TreeNode();
        }
        root.setValue(value);
    }

    public TreeNode getRoot(){
        return root;
    }

    public int getSize(){
        if(isEmpty()){
            return 0;
        }
        return root.getSubNodeCount()+1;
    }

    public String toString(){
        if(isEmpty()){
            return "";
        } else {
            return root.toString();
        }
    }

    public String toStringWidth(){

        return root.toStringWidth();
    }
}
