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
    public static void postOrder(ArrayList<TreeNode> ans,TreeNode root,ArrayList<Integer> del){
        if(root==null) return;

        postOrder(ans,root.left,del);
        postOrder(ans,root.right,del);
             if(root.left!=null&&del.contains(root.left.val))
             {
                // ans.add(root);
                root.left=null;
             }
         if(root.right!=null&&del.contains(root.right.val))
         {
         // ans.add(root);
          root.right=null;
         }
       if(del.contains(root.val)){
            if(root.left!=null) ans.add(root.left);
            if(root.right!=null) ans.add(root.right);
         //   root=null;
        }
   

    }
    public List<TreeNode> delNodes(TreeNode root, int[] to_del) {
        ArrayList<Integer> del=new ArrayList<>();
ArrayList<TreeNode> ans=new ArrayList<>();
        for(int ele:to_del) del.add(ele);
postOrder(ans,root,del);
//System.out.println(del.get(0));
       if(del.contains(root.val)==false) ans.add(root);
     /*  else{
ans.remove(ans.remove(ans.size()-1));
       }*/

return ans;

    }
}