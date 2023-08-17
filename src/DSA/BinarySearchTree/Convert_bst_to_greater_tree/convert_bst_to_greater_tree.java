package DSA.BinarySearchTree.Convert_bst_to_greater_tree;

import java.util.HashMap;

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
public class convert_bst_to_greater_tree {
    public static void greatSum(TreeNode root,int val[],int cur){
        if(root==null){
            return ;
        }
        greatSum(root.left,val,cur);
        if(root.val>cur)
            val[0]+=root.val;

        greatSum(root.right,val,cur);
    }
    public static void inorder(TreeNode root,TreeNode orig,HashMap<Integer,Integer> map){
        if(root==null) return;
        int val[]=new int[1];

        inorder(root.left,orig,map);
        greatSum(orig,val, root.val);
        map.put(root.val, root.val+val[0]);
val[0]=0;
        inorder(root.right,orig,map);

    }
    public static TreeNode convertBST(TreeNode root) {
        if(root==null) return root;
        HashMap<Integer,Integer> map=new HashMap<>();
        inorder(root,root,map);
        inorderTrversal(root,map);
        return root;
    }
    public static void inorderTrversal(TreeNode root,HashMap<Integer,Integer> map){
        if(root==null) return;
        inorderTrversal(root.left,map);
        root.val=map.get(root.val);
        inorderTrversal(root.right,map);
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(4);
        root.left=new TreeNode(1);
        root.left.left=new TreeNode(0);
        root.left.right=new TreeNode(2);
        root.left.right.right=new TreeNode(3);


        root.right=new TreeNode(6);
        root.right.left=new TreeNode(5);
        root.right.right=new TreeNode(7);
        root.right.right.right=new TreeNode(8);
        convertBST(root);



    }
}
