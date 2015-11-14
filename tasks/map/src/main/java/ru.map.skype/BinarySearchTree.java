import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class BinarySearchTree extends Tree {

    public BinarySearchTree() {

    }

    public BinarySearchTree(String str) {
        parse(str);
    }

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
        char[] strArray = str.toCharArray();
        for (char c : strArray) {
            TreeNode node = new TreeNode(c);
        }

    }


//    public boolean contains(int targetValue) {
//        if (isEmpty()) {
//            return false;
//        }
//        TreeNode node = getRoot();
//        while (node != null) {
//            if (node.getValue() >= targetValue) {
//                if (node.getValue() > targetValue) {
//                    node = node.getLeftNode();
//                } else {
//                    return valueEquals(node.getValue(), targetValue);
//                }
//            }
//            if (node.getValue() <= targetValue) {
//                if (node.getValue() < targetValue) {
//                    node = node.getRightNode();
//                } else {
//                    return valueEquals(node.getValue(), targetValue);
//                }
//            }
//        }
//        return false;
//    }
//

    public boolean contains(int targetValue) {
        TreeNode node = getRoot();
        while (node != null) {
            if (node.getValue() > targetValue) {
                node = node.getLeftNode();
            } else if (node.getValue() < targetValue) {
                    node = node.getRightNode();
            } else{
                return true;
            }
        }
        return false;
    }

    private boolean valueEquals(int valueNode, int targetValue) {
        return valueNode == targetValue;
    }

    public List<Integer> getSortValues() {
        List<Integer> values = new ArrayList<>();
        if(!isEmpty()){
            TreeNode node = this.getRoot();
            setSortValues(values,node);
        }
        return values;
    }

    private void setSortValues(List<Integer> values,TreeNode node){
        if(node.getLeftNode()!=null){
            setSortValues(values,node.getLeftNode());
        }
        values.add(node.getValue());
        if(node.getRightNode()!=null){
            setSortValues(values,node.getRightNode());
        }

    }

    public int getMinValue() {
        int result;
        TreeNode node = getRoot();
        result = node.getValue();
        while (node.getLeftNode() != null) {
            result = node.getLeftNode().getValue();
            node = node.getLeftNode();
        }
        return result;
    }

    public int getMaxValue() {
        int result;
        TreeNode node = getRoot();
        result = node.getValue();
        while (node.getRightNode() != null) {
            result = node.getRightNode().getValue();
            node = node.getRightNode();
        }
        return result;
    }


}
