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

public static void inorder(TreeNode root,int low,int high,int arr[]){
if(root==null) return;

    inorder(root.left,low,high,arr);

    if(root.val>=low&&root.val<=high){
        System.out.println(root.val);
        arr[0]+=root.val;
    }
    inorder(root.right,low,high,arr);
}
    public int rangeSumBST(TreeNode root, int low, int high) {
        int arr[]=new int[1];
    inorder(root,low,high,arr);
    return arr[0];    
    }
}