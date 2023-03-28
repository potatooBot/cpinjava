package DSA.BinaryTree;

public class lowest_common_ancestor {
    public TreeNode2 lowestCommonAncestor(TreeNode2 root, TreeNode2 p, TreeNode2 q) {
        //base case
        if (root == null || root == p || root == q) {
            return root;
        }
        TreeNode2 left = lowestCommonAncestor(root.left, p, q);
        TreeNode2 right = lowestCommonAncestor(root.right, p, q);

        //result
        if(left == null) {
            return right;
        }
        else if(right == null) {
            return left;
        }
        else { //both left and right are not null, we found our result
            return root;
        }
    }
}
