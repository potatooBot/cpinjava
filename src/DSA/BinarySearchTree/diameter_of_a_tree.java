package DSA.BinarySearchTree;

public class diameter_of_a_tree {

    static class Node
    {
        int data;
        Node left, right;
    }
// Time Complexity: O(N)

    // Space Complexity: O(1) Extra Space + O(H) Recursion Stack space (Where “H”  is the height of binary tree )
    static class A
    {
        int ans = Integer.MIN_VALUE;
    }

    /* Function to find height of a tree */
    static int height(Node root, A a)
    {
        if (root == null)
            return 0;

        int left_height = height(root.left, a);

        int right_height = height(root.right, a);

        // update the answer, because diameter of a
        // tree is nothing but maximum value of
        // (left_height + right_height + 1) for each node
        a.ans = Math.max(a.ans, 1 + left_height +
                right_height);

        return 1 + Math.max(left_height, right_height);
    }

    /* Computes the diameter of binary
    tree with given root. */
   static int diameter(Node root) {
        // Your code here

        int diam[]=new int[1];

        height(root,diam);
        return diam[0] +1;

    }

    public static int height(Node root,int diam[]){
        if(root==null) return 0;


        int lh=height(root.left,diam);
        int rh=height(root.right,diam);


        //To get the maximum node at each point and update the node if it is greater than prev node diameter
        diam[0]=Math.max(diam[0],lh+rh);

        return 1 + Math.max(lh,rh);




    }
    static Node newNode(int data)
    {
        Node node = new Node();
        node.data = data;
        node.left = null;
        node.right = null;

        return (node);
    }

    // Driver code
    public static void main(String[] args)
    {
        Node root = newNode(1);
        root.left = newNode(2);
        root.right = newNode(3);
        root.left.left = newNode(4);
        root.left.right = newNode(5);

        System.out.println("Diameter is " + diameter(root));
    }
}
