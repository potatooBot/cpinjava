package DSA.BinarySearchTree;

public class practice_delete {

    static class Node {
        int data;
        low_com_ances.Node left;
        low_com_ances.Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    public static low_com_ances.Node insert(low_com_ances.Node root, int val) {
        if (root == null) {
            root = new low_com_ances.Node(val);
        } else {
            if (root.data > val) {
                root.left = insert(root.left, val);
            } else if (root.data < val) {
                root.right = insert(root.right, val);
            }
        }
        return root;
    }

    public static void inorder(low_com_ances.Node root) {
        if (root == null) {
            return;
        } else {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }
    public static low_com_ances.Node lowest_common_ance (low_com_ances.Node root, int n1, int n2){
        if (root==null){
            return null;
        }

        if(root.data<n1&&root.data<n2){
            return lowest_common_ance(root.right,n1,n2);
        }
        if(root.data>n1&&root.data>n2)
        {
            return lowest_common_ance(root.left,n1,n2);
        }

        return root;
    }

    public static void main(String[] args) {
        int value[]={20,8,22,4,12,10,14,16};
        low_com_ances.Node root=null;

        for (int i = 0; i < value.length ; i++) {
            root=insert(root,value[i]);
        }
        System.out.println("Inorder Trversal is ");
        inorder(root);
        int n1=10;
        int n2=22;
        root= lowest_common_ance(root, n1, n2);
        System.out.println();
        System.out.println("LCA of " + n1 + " and " + n2 + " is " +root.data);
    }
}
