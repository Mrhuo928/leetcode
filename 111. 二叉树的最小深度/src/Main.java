import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Main {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }


    public int minDepth(TreeNode root) {
        if (root==null)
            return 0;
        if (root.left==null && root.right!=null){
            return minDepth(root.right)+1;
        }else if (root.left!=null && root.right==null){
            return minDepth(root.left)+1;
        }else if (root.left == null && root.right==null){
            return 1;
        }else {
            return Math.min(minDepth(root.left),minDepth(root.right))+1;
        }
    }

    public static void main(String[] args) {


    }
}
