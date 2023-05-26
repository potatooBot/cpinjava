package DSA.BinaryTree.Count_Node_equal_to_average_of_subtree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class count_node_equal_to_avergae_of_subtree {
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
     static   public int averageOfSubtree(TreeNode root) {

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
    public static void main(String[] args) {
        TreeNode root=new TreeNode(4);
        root.left=new TreeNode(8);
        root.right=new TreeNode(5);
        root.right.right=new TreeNode(6);
        root.left.left=new TreeNode(0);
        root.left.right=new TreeNode(1);
    int ans=averageOfSubtree(root);
        System.out.println(ans);
     }
}
