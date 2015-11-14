/**
 * 1
 * |                  |
 * 10                  20
 * |       |            |         |
 * 210      220          310       340
 * /\
 * 315   345
 * <p>
 * 1
 * |                  |
 * 10                  20
 * |       |
 * 210      220
 */
public class TreeMain {
    public static void main(String[] args) {
        Tree tree = new Tree();
        System.out.println("Tree is empty: " + tree.isEmpty() + ".");
        tree.setRoot(1);
        System.out.println("Tree is empty: " + tree.isEmpty() + ".");
        TreeNode left1 = new TreeNode(10);
        TreeNode right1 = new TreeNode(20);
        TreeNode left2 = new TreeNode(210);
        TreeNode right2 = new TreeNode(220);
        TreeNode left3 = new TreeNode(315);
        TreeNode right3 = new TreeNode(345);
        TreeNode left4 = new TreeNode(310);
        TreeNode right4 = new TreeNode(340);
        tree.getRoot().setLeftNode(left1);
        tree.getRoot().setRightNode(right1);
        left1.setLeftNode(left2);
        left1.setRightNode(right2);
        left2.setLeftNode(left3);
        left2.setRightNode(right3);
        right1.setLeftNode(left4);
        right1.setRightNode(right4);
        System.out.println("Tree has : " + tree.getSize() + " elements.");
        System.out.println("To string (must be 1 10 210  220   20) : " + tree.toString());
        System.out.println("To string (must be 1 10 20  210  220 310 340 315 345) : " + tree.toStringWidth());

        /**
         *                                   100
         *                             /             \
         *                          /                    \
         *                       90                       110
         *                   /       \                  /      \
         *                 80         95             105         115
         *               /   \       /  \            / \        /   \
         *             70     85    92   97       102   107   112   117
         */
        BinarySearchTree binaryTree = new BinarySearchTree();
        binaryTree.add(100);
        binaryTree.add(90);
        binaryTree.add(80);
        binaryTree.add(95);
        binaryTree.add(70);
        binaryTree.add(85);
        binaryTree.add(92);
        binaryTree.add(97);
        binaryTree.add(110);
        binaryTree.add(105);
        binaryTree.add(115);
        binaryTree.add(102);
        binaryTree.add(107);
        binaryTree.add(112);
        binaryTree.add(117);

        System.out.println("Value 112 is set to tree: " + binaryTree.contains(112));
        System.out.println("To string: " + binaryTree.toStringWidth());
        System.out.println("Minimal value in the tree is : " + binaryTree.getMinValue());
        System.out.println("Maximum value in the tree is : " + binaryTree.getMaxValue());

        System.out.println(""+binaryTree.getSortValues());
    }
}
