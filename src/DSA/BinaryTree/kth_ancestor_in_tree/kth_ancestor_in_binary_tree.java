package DSA.BinaryTree.kth_ancestor_in_tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
    }
}
public class kth_ancestor_in_binary_tree { public static void inorderCheck(Node root,int node,int [] found,ArrayList<Integer> list){
        if(root==null) return;
        if(root.data==node){
            found[0]=1;
            return;
        }
        inorderCheck(root.left,node,found,list);
        if(found[0]==1){
            list.add(root.data);
            return;
        }
        inorderCheck(root.right,node,found,list);
        if(found[0]==1){
            list.add(root.data);
            return;
        }

    }
    static public int kthAncestor(Node root, int k, int node)
    {
        ArrayList<Integer> list=new ArrayList<>();
        int found[]=new int[1];
        inorderCheck(root,node,found,list);
    return list.size()<k?-1:list.get(k-1);
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        int ans=kthAncestor(root,2,4);
        System.out.println(ans);

    }
}
