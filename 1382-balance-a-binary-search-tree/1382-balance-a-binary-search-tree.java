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
public static void inorder(TreeNode root,ArrayList<Integer> list)
{
if(root==null) {
    return;
}

inorder(root.left,list);
list.add(root.val);
inorder(root.right,list);

}
public static TreeNode getBst(ArrayList<Integer> list,int low,int high){
if(low>high) return null;


int mid =(low+high)/2;

TreeNode root=new TreeNode(list.get(mid));

root.left=getBst(list,low,mid-1);
root.right=getBst(list,mid+1,high);
return root;
}

    public TreeNode balanceBST(TreeNode root) {
        if(root==null)
        {
            return null;
        }
        ArrayList<Integer> list=new ArrayList<>();
inorder(root,list);
System.out.println(list);
return getBst(list,0,list.size()-1);
    }
}