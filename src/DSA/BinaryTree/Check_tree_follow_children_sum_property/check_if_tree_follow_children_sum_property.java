package DSA.BinaryTree.Check_tree_follow_children_sum_property;
class Node{
    int data;
    Node left,right;

    Node(int key)
    {
        data = key;
        left = right = null;
    }
}
public class check_if_tree_follow_children_sum_property {
   public static boolean preorder(Node root){

       if(root==null||(root.left==null&&root.right==null)){
           return true;
       }
       int leftval=0;
       if(root.left!=null){
           leftval=leftval+root.left.data;
       }
       int rightVal=0;
       if(root.right!=null)
       {
           rightVal=rightVal+root.right.data;
       }
       if(root.data!=(rightVal+leftval)){
           return false;
       }

       return  preorder(root.left)&& preorder(root.right);
   }
    public static int isSumProperty(Node root)
    {
        // add your code here
boolean val=preorder(root);

        return val?1:0;
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(4);
        root.right=new Node(3);
        root.left.left=new Node(5);
        int ans=isSumProperty(root);
        System.out.println(ans);
    }
}
