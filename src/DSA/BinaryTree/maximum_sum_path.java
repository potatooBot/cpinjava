package DSA.BinaryTree;
import java.util.*;

class TreeNode2 {
    int val;
    TreeNode2 left, right;
    TreeNode2(int val) {
        this.val = val;
        left = null;
        right = null;
    }
}
public class maximum_sum_path {
    public static int maxPathSum(TreeNode2 root) {
        int maxValue[] = new int[1];
        maxValue[0] = Integer.MIN_VALUE;
        int res=maxPathDown(root, maxValue);
        System.out.println("res is "+res);
        return maxValue[0];
    }

    public static int maxPathDown(TreeNode2 node, int maxValue[]) {
        if (node == null) return 0;
        int left = Math.max(0, maxPathDown(node.left, maxValue));
        int right = Math.max(0, maxPathDown(node.right, maxValue));
        maxValue[0] = Math.max(maxValue[0], left + right + node.val);
        return Math.max(left, right) + node.val;
    }

    public static void main(String args[]) {

        TreeNode2 root = new TreeNode2(-10);
        root.left = new TreeNode2(9);
        root.right = new TreeNode2(20);
        root.right.left = new TreeNode2(15);
        root.right.right = new TreeNode2(7);

        int answer = maxPathSum(root);
        System.out.println("The Max Path Sum for this tree is " + answer);
    }
}
