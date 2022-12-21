package DSA.BinarySearchTree;

import java.util.ArrayList;

public class find_closest_element_in_bst {
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


    public static void inorder(Node root,ArrayList <Integer> list){
        if(root!=null) {
            inorder(root.left,list);
            list.add(root.data);
            inorder(root.right,list);
        }

    }
    static void minDiff(Node  root, int k)
    {
        // Write your code here
        ArrayList <Integer> list=new ArrayList<>();
        inorder(root,list);
        int res=list.get(list.size()-1);
        for (int i = list.size()-1; i >=0 ; i--) {
            if(k<=list.get(i)){
 res=list.get(i);
            }
        }
        System.out.println(list);
        System.out.println(res);
    }
    public static void main(String[] args) {
        int arr[]={13 ,12 ,1 ,7 ,6 ,8 ,4 ,11};
        Node root=null;
        for (int i = 1; i < arr.length ; i++) {
            root=insert(root,arr[i]);
        }
        minDiff(root,1);

    }
}
