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
      public static void greatSum(TreeNode root,int val[],int cur){
        if(root==null){
            return ;
        }
        greatSum(root.left,val,cur);
        if(root.val>cur)
            val[0]+=root.val;

        greatSum(root.right,val,cur);
    }
    public static void inorder(TreeNode root,TreeNode orig,HashMap<Integer,Integer> map){
        if(root==null) return;
        int val[]=new int[1];
       
        inorder(root.left,orig,map);
        greatSum(orig,val, root.val);
        map.put(root.val, root.val+val[0]);
val[0]=0;
        inorder(root.right,orig,map);
        
    }
    public static TreeNode convertBST(TreeNode root) {
        if(root==null) return root;
        HashMap<Integer,Integer> map=new HashMap<>();
        inorder(root,root,map);
        inorderTrversal(root,map);
        return root;
    }
    public static void inorderTrversal(TreeNode root,HashMap<Integer,Integer> map){
        if(root==null) return;
        inorderTrversal(root.left,map);
        root.val=map.get(root.val);
        inorderTrversal(root.right,map);
    }
}