package DSA.BinaryTree.Check_if_tree_foldable_or_not;
class Node
{
    int data;
    Node left, right;
    Node(int key)
    {
        data = key;
        left = right = null;
    }
}

public class check_if_tree_foldable_or_not {
    public static boolean checkFold(Node node1,Node node2){

        if(node1==null&&node2==null){
            return true;
        }
        if(node1==null||node2==null){
            return false;
        }

           return checkFold(node1.left,node2.right)&&checkFold(node1.right,node2.left);
    }
    static boolean IsFoldable(Node node)
    {
        if(node==null) return true;
    return checkFold(node.left,node.right);
    }
    public static void main(String[] args) {
Node root=new Node(10);
root.left=new Node(7);
root.right=new Node(15);
root.right.left=new Node(11);

root.left.right=new Node(9);
boolean ans=IsFoldable(root);
        System.out.println(ans);

    }
}
