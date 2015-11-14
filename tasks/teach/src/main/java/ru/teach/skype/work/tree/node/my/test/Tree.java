package ru.teach.skype.work.tree.node.my.test;

/**
 *
 */
public class Tree {
    private TreeNode root;

    public void setRoot(String value) {
        if(isEmpty()){
            root=new TreeNode();
            root.setValue(value);
        }
        root.setValue(value);
    }

    public TreeNode getRoot(){
        return root;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public int getSubNodeCounter(){
        if(isEmpty()){
            return 0;
        }
        return root.getCountNode()+1;
    }

    public String toString(){
        return root.toString();
    }
}
