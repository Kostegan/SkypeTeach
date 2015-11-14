import org.junit.Test;

import static org.junit.Assert.*;

/**
 *
 */
public class BinarySearchTreeTest {

    @Test
    public void getMinValue(){
        BinarySearchTree binaryTree = new BinarySearchTree();
        binaryTree.add(100);
        binaryTree.add(95);
        binaryTree.add(70);
        binaryTree.add(92);
        binaryTree.add(97);
        binaryTree.add(117);
        assertEquals("The minimal value in the tree is : ", 70, binaryTree.getMinValue());
    }

    @Test
    public void getMaxValue(){
        BinarySearchTree binaryTree = new BinarySearchTree();
        binaryTree.add(100);
        binaryTree.add(95);
        binaryTree.add(70);
        binaryTree.add(92);
        binaryTree.add(97);
        binaryTree.add(117);
        assertEquals("The maximal value in the tree is : ",117,binaryTree.getMaxValue());
    }

    @Test
    public void containsTrue(){
        BinarySearchTree binaryTree = new BinarySearchTree();
        binaryTree.add(100);
        binaryTree.add(95);
        binaryTree.add(70);
        binaryTree.add(112);
        binaryTree.add(97);
        binaryTree.add(117);
        assertTrue("Value 112 is set to tree: ", binaryTree.contains(112));
    }

    @Test
    public void containsFalse(){
        BinarySearchTree binaryTree = new BinarySearchTree();
        binaryTree.add(100);
        binaryTree.add(112);
        binaryTree.add(97);
        binaryTree.add(117);
        assertFalse("Value 211 is not set to the tree: ", binaryTree.contains(211));
    }

    @Test
    public void binarySearchTree(){
        BinarySearchTree binaryTree = new BinarySearchTree();
        binaryTree.add(100);
        binaryTree.add(120);
        binaryTree.add(90);
        assertEquals("Sort Values","[90, 100, 120]",binaryTree.getSortValues().toString());
    }

    @Test
    public void parseStringOfThreeElements(){
        String str ="1:(5:(9,),6:(7:(10,),8:(,0))";
        BinarySearchTree binaryTree = new BinarySearchTree(str);
        assertEquals("The Root value is 1 :",1,binaryTree.getRoot());

    }


    @Test
    public void binarySearchMore(){
        BinarySearchTree binaryTree = new BinarySearchTree();
        binaryTree.add(100);
        binaryTree.add(120);
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
        assertEquals("Sort Values","[70, 80, 85, 90, 92, 95, 97, 100, 102, 105, 107, 110, 112, 115, 117, 120]",binaryTree.getSortValues().toString());
    }



}
