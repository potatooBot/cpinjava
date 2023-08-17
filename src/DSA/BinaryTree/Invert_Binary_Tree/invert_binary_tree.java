package DSA.BinaryTree.Invert_Binary_Tree;

import java.util.ArrayList;
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
public class invert_binary_tree {
    public static void buildTree(TreeNode root,ArrayList<Integer> ds){

        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int idx=0;
        while (!q.isEmpty()){
            if(idx==ds.size()) break;
            TreeNode n=new TreeNode(ds.get(idx));
            root= n;

            idx++;
            int size= q.size();
            TreeNode node=q.peek();
            q.remove();


            for (int i = 0; i <size ; i++) {

                if(node.left!=null){
                    q.add(node.left);
                }
                if(node.right!=null){
                    q.add(node.right);
                }
            }
        }
    }

      public static TreeNode invertTree(TreeNode root){
         if(root==null) return null ;
         TreeNode right=invertTree(root.right);
         TreeNode left=invertTree(root.left);



         root.left=right;
         root.right=left;
return root;
      }
      public static void  inorder(TreeNode root){
        if(root==null) return;
        inorder(root.left);
          System.out.println(root.val);
          inorder(root.right);
      }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(4);
        root.left=new TreeNode(2);
        root.left.left=new TreeNode(1);
        root.left.right=new TreeNode(3);
        root.right=new TreeNode(7);
        root.right.left=new TreeNode(6);
        root.right.right=new TreeNode(9);
//inorder(root);
     TreeNode ans=   invertTree(root);
     inorder(ans);
    }
}
