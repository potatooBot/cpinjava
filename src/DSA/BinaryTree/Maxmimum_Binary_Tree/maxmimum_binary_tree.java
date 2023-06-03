package DSA.BinaryTree.Maxmimum_Binary_Tree;

import java.util.Arrays;
import java.util.Collections;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;
    public TreeNode(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }

}
public class maxmimum_binary_tree {
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
    static  public TreeNode constructMaximumBinaryTree(int[] nums,int rootIndex) {

TreeNode root=buildTree(nums,0,nums.length);
        return root;
    }
    public static void preOrder(TreeNode root){
        if(root==null) return;
        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String[] args) {
int []nums = {3,2,1};
int rootIndex=0;
int maxi=-1;
        for (int i = 0; i < nums.length ; i++) {
            if(maxi<nums[i]){
                maxi=nums[i];
            rootIndex=i;
            }
        }
TreeNode ans=constructMaximumBinaryTree(nums,rootIndex);
preOrder(ans);
    }
}
