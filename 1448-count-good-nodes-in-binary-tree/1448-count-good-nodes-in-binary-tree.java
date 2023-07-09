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
    public static void preorder(TreeNode root,ArrayList<Integer> list,int max){
if(root==null){
    return ;
}

if(root.val>=max){
    list.add(root.val);
    max=root.val;
}
preorder(root.left,list,max);
preorder(root.right,list,max);
    }
    public int goodNodes(TreeNode root) {
        if(root==null) return 0;

ArrayList<Integer> list=new ArrayList<>();
preorder(root,list,-100000);

return list.size();
    }
}