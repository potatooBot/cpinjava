package DSA.BinaryTree;
import  java.util.*;
public class sum_of_leaf_nodes {

    public static int sumOfLeftLeaves(Node root) {
        if(root==null) return 0;

// if left child is a leaf, get left child val and continue down
// right child
        else if(root.left!=null&&root.left.left==null&&root.left.right==null)
        {

            return root.left.data +sumOfLeftLeaves(root.right);
        }
        //if we need to search further . We go for this.
        else {
            return sumOfLeftLeaves(root.left)+sumOfLeftLeaves(root.right);

        }
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(3);
        root.left.left.right = new Node(4);
        root.left.left.right.left = new Node(5);
        root.left.left.right.right = new Node(6);
        root.right = new Node(7);
        root.right.right = new Node(8);
        root.right.right.left = new Node(9);
        root.right.right.left.left = new Node(10);
        root.right.right.left.right = new Node(11);

        int res=sumOfLeftLeaves(root);
        System.out.println(res);





    }
}
