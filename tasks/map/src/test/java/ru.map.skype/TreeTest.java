import org.junit.Test;

import static org.junit.Assert.*;

/**
 *
 */
public class TreeTest {

    /**
     *                       1
     *              10              20
     *        210      220       310    340
     *    315    345
     *
     *
     */
    @Test
    public void toStringWidth(){
        Tree tree = new Tree();
        tree.setRoot(1);
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
        String result = " 1 10 20 210 220 310 340 315 345";
        assertEquals("To string (must be 1 10 20  210  220 310 340 315 345) : ",result,tree.toStringWidth());
    }
}
