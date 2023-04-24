package DSA.BinaryTree.Subtree_of_another_tree;

import javax.security.auth.Subject;

class TreeNode{
    int val;
    TreeNode left,right;
    public TreeNode(int val){
        this.val= val;
        this.left=null;
        this.right=null;

    }
}
public class subtree_of_another_tree {
    public static boolean checkSubtree(TreeNode root,TreeNode subRoot){
        if(root==null&&subRoot==null) return true;
        if(root==null||subRoot==null) return false;
if(root.val!= subRoot.val) return false;


        return checkSubtree(root.left,subRoot.left)&&checkSubtree(root.right,subRoot.right);
    }
    public static void inorder(TreeNode root,TreeNode subRoot,boolean ans[]){

        if (root==null)return;
        if(root.left!=null) inorder(root.left,subRoot,ans);
        if(root.val==subRoot.val){
           if(checkSubtree(root,subRoot)){
               ans[0]=true;
           }
        }
        if(root.right!=null) inorder(root.right,subRoot,ans);

    }
    static    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        boolean ans[]=new boolean[1];
inorder(root,subRoot,ans);
        System.out.println(ans[0]);
        if(ans[0]==true)
        return ans[0];
        else return false;
    }
    public static void main(String[] args) {
//        TreeNode root=new TreeNode(3);
//        root.left=new TreeNode(4);
//        root.right=new TreeNode(5);
//        root.left.left=new TreeNode(1);
//        root.left.right=new TreeNode(2);
//        root.left.right.left=new TreeNode(0);
//TreeNode subRoot=new TreeNode(4);
//subRoot.left=new TreeNode(1);
//subRoot.right=new TreeNode(2);
TreeNode root=new TreeNode(1);
 root.left=new TreeNode(1);
TreeNode subRoot=new TreeNode(1);
isSubtree(root,subRoot);
    }
}
