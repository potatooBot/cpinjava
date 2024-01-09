//{ Driver Code Starts

import java.util.*;
import java.io.*;
class Node {
        int data;
        Node left, right;
 
        Node(int item) {
            data = item;
            left = right = null;
        }
    }
class BinarySearchTree {
    public static Node root;
    BinarySearchTree() { 
        root = null; 
    }
    void insert(int key) {
       root = insertRec(root, key);
    }
    Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (key < root.data)
            root.left = insertRec(root.left, key);
        else if (key > root.data)
            root.right = insertRec(root.right, key);
        return root;
    }
 
    public static void inorder()  {
       inorderRec(root);
    }
    public static void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data);
            inorderRec(root.right);
        }
    }
 
    // Driver Program to test above functions
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int []a=new int[n];
            BinarySearchTree obj1=new BinarySearchTree();
            for(int i=0;i<n;i++)
            {
                int b=sc.nextInt();
                obj1.insert(b);
            }
            //inorder();
            Solution obj=new Solution();
            boolean k=obj.isDeadEnd(root);
            if(k==true)
            System.out.println("1");
            else
            System.out.println("0");
        }       
    }
}


// } Driver Code Ends


/*class Node {
        int data;
        Node left, right;
 
        Node(int item) {
            data = item;
            left = right = null;
        }
    }*/

//Function should return true if a deadEnd is found in the bst otherwise return false.
class Solution
{
    public static boolean search(Node root,int val){
        if(root==null){
            return false;
            
        }
        if(root.data==val){
            return true;
        }
         if(root.data>val){
             return search(root.left,val);
         }
         else{
             return search(root.right,val);
         }
    }
    
    public static boolean isDeadEnd(Node root)
    {
     if(root==null) return false;
     Queue<Node> q=new LinkedList<>();
     
     
     q.add(root);
     while(!q.isEmpty())
     {
         Node node=q.poll();
         if(node.left==null&&node.right==null){
         if(node.data==1){
             if(search(root,2)==true) {
                 return true;
             }
         }
         else{
             if(search(root,node.data+1)==true&&search(root,node.data-1)==true){
                 return true;
             }
         }
         
         
         }
         else {
             if(node.left!=null){
                 q.add(node.left);
             }
             if(node.right!=null)
             {
                 q.add(node.right);
             }
         }
     }
     
     
     return false;   
    }
}