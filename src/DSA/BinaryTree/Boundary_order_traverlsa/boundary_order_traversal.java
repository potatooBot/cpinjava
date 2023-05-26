
//Time Complexity: O(N).
//
//        Reason: The time complexity will be O(H) + O(H) + O(N) which is ≈ O(N)
//
//        Space Complexity: O(N)

package BinaryTree.Boundary_order_traverlsa;
import java.util.*;
class Node {
    int data;
   Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
public class boundary_order_traversal {
    public static boolean isLeaf(Node root){
        return root.left==null &&root.right==null;
    }
    public static void addLeft(Node root, ArrayList <Integer> ans){
    Node cur=root.left;
        while (cur!=null){
            if(isLeaf(root)==false) ans.add(cur.data);
            if(cur.left!=null) {
                cur=cur.left;
            }
            else cur=cur.right;

        }
    }
    public static void addRight(Node root, ArrayList <Integer> ans){
        Node cur=root.right;
        ArrayList <Integer> temp=new ArrayList<>();
        while (cur!=null){
            if(isLeaf(root)==false) temp.add(cur.data);
            if(cur.right!=null) {
                cur=cur.right;
            }
            else cur=cur.left;
        }
        Collections.reverse(temp);
        for (int i = 0; i <temp.size() ; i++) {
            ans.add(temp.get(i));
        }
    }
   static ArrayList <Integer> boundary(Node node)
    {
        ArrayList < Integer > ans = new ArrayList < Integer > ();
        if(isLeaf(node)==false) ans.add(node.data);
addLeft(node,ans);
addLEaves(node,ans);
addRight(node,ans);
return ans;
    }
    static void addLEaves(Node root, ArrayList <Integer> ans){
        if(isLeaf(root)) {
            ans.add(root.data);
        return;
        }

        //If it consist any node in left and not a leaf node
        if(root.left!=null) addLEaves(root.left,ans);

        //If it consist any node in right and not a right node
        if(root.right!=null) addLEaves(root.right,ans);
    }
    public static void main(String args[]) {

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

        ArrayList < Integer > boundaryTraversal;
        boundaryTraversal = boundary(root);

        System.out.println("The Boundary Traversal is : ");
        for (int i = 0; i < boundaryTraversal.size(); i++) {
            System.out.print(boundaryTraversal.get(i) + " ");
        }

    }
}
