package DSA.BinaryTree.Cousin_Binary_Tree_2;

import java.util.*;

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

public class cousin_binary_tree_2 {
    public static TreeNode replaceValueInTree(TreeNode root) {

        List<Integer> level_sum = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){
            int n = q.size();
            int sum = 0;

            while(n-- > 0){
                TreeNode res = q.poll();
                sum += res.val;

                if(res.left != null){
                    q.offer(res.left);
                }
                if(res.right != null){
                    q.offer(res.right);
                }
            }

            level_sum.add(sum);
        }

        int idx = 0;
        q.offer(root);
        root.val = 0;

        while(!q.isEmpty()){
            int n = q.size();
            idx++;

            for(int i=0;i<n;i++){
                TreeNode res = q.poll();
                int sum = 0;

                if(res.left != null){
                    q.add(res.left);
                    sum += res.left.val;
                }

                if(res.right != null){
                    q.add(res.right);
                    sum += res.right.val;
                }
                if(res.left != null){
                    res.left.val = level_sum.get(idx) - sum;
                }

                if(res.right != null){
                    res.right.val = level_sum.get(idx) - sum;
                }

            }
        }

        return root;
    }

   public static void preorder(TreeNode root){
       if(root==null) return;
       System.out.println(root.val);
       preorder(root.left);
       preorder(root.right);
   }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(5);
        root.left=new TreeNode(4);
        root.right=new TreeNode(9);
        root.left.left=new TreeNode(1);
        root.left.right=new TreeNode(10);
        root.right.right=new TreeNode(7);

        TreeNode ans=replaceValueInTree(root);
      preorder(root);
    }
}
