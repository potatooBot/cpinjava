package DSA.BinarySearchTree;
class TreeNode{
    int val;
    TreeNode left,right;
    public TreeNode(int val){
        this.val=val;
        this.left=right=null;
    }
}
public class recover_bst {
    TreeNode first;
    TreeNode middle;
    TreeNode prev;
    TreeNode last;
    public void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.left);


        if(prev!=null&&root.val<prev.val){
            if(first==null){
                first=prev;
                middle=root;
            }
            else{
                last=root;
            }
        }
        prev=root;
        inorder(root.right);
    }
    public void recoverTree(TreeNode root) {
        first=last=middle=null;
        prev=new TreeNode (Integer.MIN_VALUE);
        inorder(root);
        if(first!=null&&last!=null){
            int t=first.val;
            first.val=last.val;
            last.val=t;
        }
        else if(first!=null&& middle!=null){
            int t=first.val;
            first.val=middle.val;
            middle.val=t;

        }



    }
}
