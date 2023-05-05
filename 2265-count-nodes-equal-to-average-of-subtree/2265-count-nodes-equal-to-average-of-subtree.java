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
        static public void getInorder(TreeNode node,int sum[],int count[]){
        if(node==null) return;

        if(node.left!=null){
            getInorder(node.left,sum,count);
        }
        sum[0]=sum[0]+ node.val;
        count[0]++;
        if(node.right!=null){
            getInorder(node.right,sum,count);
        }


    }
     public int averageOfSubtree(TreeNode root) {

         Queue<TreeNode> q=new LinkedList<>();
         q.add(root);
         int countNode=0;
         while (q.isEmpty()==false){
             int level=q.size();
             for (int i = 0; i <level ; i++) {
                 int sum[]=new int[1];
                 int count[]=new int[1];
                 TreeNode it=q.peek();
                 q.remove();
                 getInorder(it,sum,count);
                if(sum[0]/count[0]==it.val) {
                    countNode++;
                }
                 if(it.left!=null){
                     q.add(it.left);
                 }
                 if(it.right!=null){
                     q.add(it.right);
                 }

             }
         }

         return countNode;
     }
}