package DSA.BinarySearchTree;

import javax.swing.*;
import java.util.*;

public class binary_tree {

    static int count=0;
    static int result=0;
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
        } else {
            if (root.data > val) {
                root.left = insert(root.left, val);
            } else if (root.data < val) {
                root.right = insert(root.right, val);
            }
        }
        return root;
    }

//    public static void inorder(Node root) {
//     if(root!=null) {
//            inorder(root.left);
//            System.out.print(root.data + " ");
//            inorder(root.right);
//        }
//
//    }

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }

        else {
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);

        }
    }

    public static void postorder(Node root) {
        if (root == null) {
            return;
        } else {

            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
    }

    public static boolean search(Node root, int key) // Time Complexity is O(H)
    {
        if (root == null) return false;
        if (root.data > key)//left sub-tree
        {
            return search(root.left, key);
        } else if (root.data == key)  //Key found
        {
            return true;
        } else {
            return search(root.right, key); //rigth subtree
        }
    }
    public static void printInRange(Node root,int x,int y){
        if (root==null){
            return;
        }
        if(root.data>=x&&root.data<=y) //If root lies between x and y
        {
            printInRange(root.left,x,y);
            System.out.print(root.data+" ");
           printInRange(root.right,x,y);
        }
        else if(root.data>=y) //If root value if greater than y(Highest value in range ) .the all the element will be found in left subtree.
        {
            printInRange(root.left,x,y);
        }
        else { //If root value if less than x(Smallest value in range ) .Then all the element will be found in right subtree.
            printInRange(root.right,x,y);
        }
    }

    public static Node deletetion(Node root, int key) {
        if (root.data > key) {
            root.left = deletetion(root.left, key);
        } else if (root.data < key) {
            root.right = deletetion(root.right, key);
        }
        else {
            if (root.left == null && root.right == null) //Case 1:The node to be deleted is a leaf node
            {
                return null; //as we always return root .we can return null to the root and the deleted root will be lost forever .
            }
            if (root.left == null) //Case 2:  The node to be deleted has only one child
            {
                return root.right;
            }
            else if (root.right == null) {
                return root.left;
            }

        Node inorderSuc = Inordersuceesor(root.right);
        root.data = inorderSuc.data;
        deletetion(root.right, key);
    }
return root;
}
    public static Node Inordersuceesor(Node root){
while (root.left!=null){
    root.left=Inordersuceesor(root.left);
}
return root;
    }
public static void printPath(ArrayList <Integer> path){
    for (int i = 0; i <path.size() ; i++) {
        System.out.print(path.get(i)+"->");

    }
    System.out.println();
}
    public static void printroot2leaf(Node root, ArrayList <Integer> path){
        if (root==null){
            return;
        }
        path.add(root.data);
        if(root.left==null&&root.right==null){ //Leaf Node
            printPath(path);
        }
        else{ //non leaf node
            printroot2leaf(root.left,path);
            printroot2leaf(root.right,path);
        }
        path.remove(path.size()-1);
    }
    public static int minimumElement(Node root) {
        Node current = root;
        if (current == null) {
            return -1;
        } else {

            while (current.left!= null) ;
            {
                current = current.left;
            }
            return current.data;
        }
    }

    static void minValue(Node root){
        Node current=root;
        while (current.left!=null){
            current=current.left;
        }
        System.out.println("The Min Value is "+current.data);
    }
    static void maxValue(Node root){
        Node current=root;
        while (current.right!=null){
            current=current.right;
        }
        System.out.println("The Max Value is "+current.data);
    }
    public static void inorder(Node root,int k,PriorityQueue <Integer> mihheap){

        if(root!=null){

            inorder(root.left,k,mihheap);
                mihheap.add(root.data);
            inorder(root.right,k,mihheap);
        }
    }

    public static int KthSmallestElement(Node root, int K) {
        PriorityQueue <Integer> mihheap=new PriorityQueue<>();
        inorder(root,K,mihheap);
        System.out.println(mihheap);
    if(mihheap.size()<K) return -1;
    int result=0;
        for (int i = 0; i <K ; i++) {
            result=mihheap.poll();
        }
        return result;
    }
    public static void main(String[] args) {
int value[]={1,2,3};
Node root=null;
        for (int i = 0; i < value.length ; i++) {
            root=insert(root,value[i]);
        }

        int res= KthSmallestElement(root,2);
        System.out.println(res);

    }
}
