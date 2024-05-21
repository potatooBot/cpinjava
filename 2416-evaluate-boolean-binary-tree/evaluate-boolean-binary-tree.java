/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public static int inorder(TreeNode root){
            if(root.left==null&&root.right==null) return root.val;
       int a= inorder(root.left);
        int b=inorder(root.right);
    if(root.val==3) return a&b;
    return a|b;
    }
    public boolean evaluateTree(TreeNode root) {

             
    return inorder(root)==1?true:false;

    }
}