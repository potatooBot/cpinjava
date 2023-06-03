/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *f     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
       public static TreeNode buildTree(int[] nums, int low, int high){
        if(low==high) return null;
        int maxi=Integer.MIN_VALUE;
        int maxiIndex=-1;
        for (int i = low; i <high ; i++) {
            if(maxi==-1) continue;
        if(maxi<nums[i]){
            maxi=nums[i];
            maxiIndex=i;
        }
        }

        TreeNode root=new TreeNode(maxi);

        root.left=buildTree(nums,low,maxiIndex);
        root.right=buildTree(nums,maxiIndex+1,high);
        return root;
    }
    static  public TreeNode constructMaximumBinaryTree(int[] nums) {

TreeNode root=buildTree(nums,0,nums.length);
        return root;
    }
}