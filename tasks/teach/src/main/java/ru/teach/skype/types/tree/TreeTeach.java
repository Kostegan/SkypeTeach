package ru.teach.skype.types.tree;

import java.util.List;

/**
 *
 */
public class TreeTeach {

/*
*                      90
*             150                200
*         60      50          70      780
*       5   4        100
*
*
*
*                        90
*            80                    100
 *       70      85          95          150
 *
 *
 *                        "ivan"
 *              "dima"              "kostya"
   *
   *
   *              [70, 600, 3, 8, 88] => [3, 8, 70, 88, 600]
   *
   *
   *
   *
   *                      100
   *       70                                     500
   *   10           90               250                      600
   *           80             125          300
   *                               150
   *
   *
* */

    /**
     *                     100
     *                             200
     *                                     300
     *                                               400
     *                                                     500
     *                                                             1000
     *
     *                               300
     *                        200            400
     *                   100                           500
     *                                                       1000
     *
     *
     *                                           400
     *                           200                             1000
     *                     100          300               500
     *
     *
     */

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        System.out.println("Must be empty: " + tree.isEmpty());

        tree.add(400);
        tree.add(1000);
        tree.add(500);
        tree.add(200);
        tree.add(300);
        tree.add(100);

        System.out.println("To String (must be: 100 200 300 400 500 1000): " + tree.getSortValues().toString());
    }

    public static void main1(String[] args) {
        Tree tree = new Tree();
        System.out.println("Must be empty: " + tree.isEmpty());
        tree.setRoot(90);

        TreeNode left1 = new TreeNode(150);
        TreeNode right1 = new TreeNode(200);

        tree.getRoot().setLeft(left1);
        tree.getRoot().setRight(right1);

        TreeNode left2 = new TreeNode(70);
//        tree.getRoot().getRight().setLeft(left2);
        right1.setLeft(left2);

        System.out.println("Must NOT be empty: " + tree.isEmpty());
        System.out.println("Nodes count in tree (must be 4): " + tree.getNodesCount());

        System.out.println("To String (must be: 90 150 200 70): " + tree.toString());
    }
}

class BinarySearchTree extends Tree {
    public TreeNode add(int value) {
        if (isEmpty()) {
            setRoot(value);
            return getRoot();
        }
        TreeNode node = getRoot();
        while (true) {
            if (node.getValue() > value) {
                if (node.getLeft() == null) {
                    TreeNode result = new TreeNode(value);
                    node.setLeft(result);
                    return result;
                }
                node = node.getLeft();
            } else {
                if (node.getRight() == null) {
                    TreeNode result = new TreeNode(value);
                    node.setRight(result);
                    return result;
                }
                node = node.getRight();
            }
        }
    }

    public boolean contains(int targetValue) {
        return true; // todo Implement with complexity log N
    }

    public List<Integer> getSortValues() {
        return null; // todo Implement
    }

    public int getMinValue() {
        return 0; // todo Implement
    }

    public int getMaxValue() {
        return 0; // todo Implement
    }
}

class Tree {
    private TreeNode root;

    public boolean isEmpty() {
        return root == null;
    }

    public void setRoot(int value) {
        if (isEmpty()) {
            root =  new TreeNode();
        }
        root.setValue(value);
    }

    public TreeNode getRoot() {
        return root;
    }

    public int getNodesCount() {
        if (isEmpty()) {
            return 0;
        }
        return root.getSubNodesCount() + 1;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "";
        }
        return root.toString();
    }
}





class TreeNode {
    private int value;

    private TreeNode left;

    private TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public int getSubNodesCount() {
        int count = 0;
        if (left != null) {
            count += 1 + left.getSubNodesCount();
        }
        if (right != null) {
            count += 1 + right.getSubNodesCount();
        }
        return count;
    }


    @Override
    public String toString() {
        String str = value + " ";
        if (left != null) {
            str += left.toString() + " ";
        }
        if (right != null) {
            str += right.toString() + " ";
        }
        return str;
    }
}