package DSA.BinarySearchTree;

public class all_the_values_greater_than_node_in_bst {
    static int prevSum=0;

    public static void inorderReverse(Node root){
        if (root==null) return;
        if (root.right!=null)
            inorderReverse(root.right);



        prevSum=prevSum+root.data;
        root.data=prevSum;
        System.out.println(root.data);

        if(root.left!=null)
            inorderReverse(root.left);
    }
    static  public Node modify(Node root)
    {
        //Write your code here


inorderReverse(root);
if(root==null) return root;
       return root;
    }

    public static void inorderNormal(Node root){
        if (root.left!=null)
            inorderNormal(root.left);


        System.out.println(root.data);

        if(root.right!=null)
            inorderNormal(root.right);
    }
    static  public Node modify2(Node root)
    {
        //Write your code here
inorderReverse(root);

       return root;
    }
    public static void main(String[] args) {
        Node root=new Node(50);
        root.left=new Node(30);
        root.left.left=new Node(20);
        root.left.right=new Node(40);


        root.right=new Node(70);
        root.right.left=new Node(60);
        root.right.right=new Node(80);
   Node nd=modify2(root);


    }
}
