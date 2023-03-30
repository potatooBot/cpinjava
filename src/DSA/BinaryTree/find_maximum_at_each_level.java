package DSA.BinaryTree;

import java.util.*;

//public class TreeNode {
//      int val;
//      TreeNode left;
//      TreeNode right;
//      TreeNode() {}
//      TreeNode(int val) { this.val = val; }
//      TreeNode(int val, TreeNode left, TreeNode right) {
//          this.val = val;
//          this.left = left;
//          this.right = right;
//      }
//  }

public class find_maximum_at_each_level {
static  public List<Integer> largestValues(TreeNode2 root) {
    List<Integer> ans=new ArrayList<>();
    Queue<TreeNode2> q=new LinkedList<>();
    q.add(root);
    while (!q.isEmpty()){
        int level= q.size();
        int maxi=Integer.MIN_VALUE;
        for (int i = 0; i <level ; i++) {


            if(q.peek().left!=null) q.add(q.peek().left);
            if(q.peek().right!=null) q.add(q.peek().right);
        maxi= Math.max(maxi,q.poll().val);

        }
        ans.add(maxi);
    }

return ans;
}
    public static void main(String[] args) {
        TreeNode2 root=new TreeNode2(1);
        root.left=new TreeNode2(3);
        root.right=new TreeNode2(2);
        root.right.right=new TreeNode2(9);
        root.left.left=new TreeNode2(5);
        root.left.right=new TreeNode2(2);
        List<Integer> ans=largestValues(root);
        System.out.println(ans);
    }
}
