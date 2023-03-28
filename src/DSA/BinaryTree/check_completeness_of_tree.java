package DSA.BinaryTree;
import java.util.*;
 class TreeNode3{
      int val;
      TreeNode3 left;
      TreeNode3 right;
      TreeNode3() {}
      TreeNode3(int val) { this.val = val; }
      TreeNode3(int val, TreeNode3 left, TreeNode3 right) {
 this.val = val;
          this.left = left;
          this.right = right;
      }
  }

public class check_completeness_of_tree {

    class Solution {
        public boolean isCompleteTree(TreeNode2 root) {
            if(root == null) return true;
            Queue<TreeNode2> q = new LinkedList<>();
            q.offer(root);

            boolean nullBw = false;
            while(!q.isEmpty()){
                int s = q.size();
                for(int x = 0; x<s; x++){
                    TreeNode2 curr = q.poll();
                    if(curr == null) nullBw = true;
                    else {
                        if(nullBw) return false;
                        q.offer(curr.left);
                        q.offer(curr.right);
                    }
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {

    }
}
