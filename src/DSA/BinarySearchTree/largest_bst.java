package DSA.BinarySearchTree;



//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
import java.math.*;

class Node{
    int data;
    Node left,right;
    Node (int data){
        this.data=data;
        this.left=right=null;
    }
}
class NodeVal{
    public int minNode,maxNode,maxSize;

    NodeVal(int minNode,int maxNode,int maxSize){
        this.minNode=minNode;
        this.maxNode=maxNode;
        this.maxSize=maxSize;
    }

};

class Solution{

    public static NodeVal postorder(Node root){

        if(root==null) {

            return new NodeVal(Integer.MAX_VALUE,Integer.MIN_VALUE,0);
        }

        NodeVal left=postorder(root.left);

        NodeVal right=    postorder(root.right);

        if(left.maxNode<root.data && right.minNode>root.data){

            return new NodeVal(Math.min(root.data,left.minNode),Math.max(root.data,right.maxNode),1+right.maxSize+left.maxSize);
        }

        return new NodeVal(Integer.MIN_VALUE,Integer.MAX_VALUE,Math.max(right.maxSize,left.maxSize));



    }
    // Return the size of the largest sub-tree which is also a BST
    static int largestBst(Node root)
    {
        // Write your code here
        return  postorder(root).maxSize;

    }

    public static void main(String[] args) {

    }

}


