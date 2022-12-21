package DSA.BinarySearchTree;

import java.util.ArrayList;

public class same_tree {
    static class Node {
        int data;
        binary_tree.Node left;
        binary_tree.Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    public static binary_tree.Node insert(binary_tree.Node root, int val) {
        if (root == null) {
            root = new binary_tree.Node(val);
        } else {
            if (root.data > val) {
                root.left = insert(root.left, val);
            } else if (root.data < val) {
                root.right = insert(root.right, val);
            }
        }
        return root;
    }

    public static boolean isSameTree(binary_tree.Node root,binary_tree.Node root2){
if(root==null&&root2==null){
    return (true);
}
else if(root==null|| root2==null){
    return (false);
}
else {
    return ((root.data==root2.data) &&isSameTree(root.left,root2.left) &&isSameTree(root.right,root2.right));
}
    }
public static void inOrder(binary_tree.Node root) {
    if (root == null) {
        return;
    } else {
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }
}
    public static void main(String[] args) {
        int value[]={8,5,3,6,10,11};
        int value2[]={8,5,3,6,10,11};
        binary_tree.Node root=null;
        binary_tree.Node root2=null;
        for (int i = 0; i < value.length ; i++) {
            root=insert(root,value[i]);
        }
        for (int i = 0; i < value2.length ; i++) {
            root2=insert(root2,value2[i]);

        }
//        inOrder(root2);
boolean check =isSameTree(root,root2);
        System.out.println("is The trees same : "+check);
    }
}

