package DSA.BinaryTree.Construct_tree_from_postorder_inorder;
import java.util.*;
class TreeNode {
    int val;
    TreeNode left;
 TreeNode right;
    TreeNode(int val) {
        this.val = val;
        left = null;
        right = null;
    }
}
class Solution {
    public static TreeNode buildTree(int[] postorder, int[] inorder) {

        HashMap <Integer,Integer> map=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        TreeNode root=build(postorder,0,postorder.length-1,inorder,0,inorder.length-1,map);
        return root;
    }
    static TreeNode build(int postorder[],int postStart,int postEnd,int inorder[],int inStart,int inEnd,HashMap <Integer,Integer> map){
        if(postStart>postEnd ||inStart> inEnd) return null;
        TreeNode root=new TreeNode(postorder[postStart]);

        int inoderIdx=map.get(postorder[postStart]);
        int numleft=inoderIdx-inStart;
        root.right=build(postorder,postStart+numleft+1,postEnd,inorder,inoderIdx+1,inEnd,map);

        return root;
    }


    public static void main(String args[]) {

        int postorder[] = {9,15,7,20,3};
        int inorder[] = {9,3,15,20,7};
     TreeNode root = buildTree(postorder, inorder);
    }
}
