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
    public static TreeNode makeTree(ArrayList<Integer> ds,int low,int high){
if(low>high) return null;
int mid=(low+high)/2;
TreeNode root=new TreeNode(ds.get(mid));
root.left=makeTree(ds,low,mid-1);
root.right=makeTree(ds,mid+1,high);
return root;
    }

    public static void inorder(ArrayList<Integer> ds,TreeNode root){
        if(root==null) return;
        inorder(ds,root.left);
        ds.add(root.val);
        inorder(ds,root.right);
    }
    public TreeNode balanceBST(TreeNode root) {
    ArrayList<Integer> ds=new ArrayList<>();
    inorder(ds,root);

    TreeNode ans=makeTree(ds,0,ds.size()-1);
  return ans;
    }
}