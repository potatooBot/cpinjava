package DSA.BinarySearchTree;

public class minimum_elelment_bst {
   static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data=data;
        }
    }
    public static Node insert(Node root,int key){
        if(root==null){
            root=new Node(key);
        }
        else {
            if (root.data < key) {
                root.right = insert(root.right, key);
            } else {
                root.left = insert(root.left, key);
            }
        }
        return root;
    }

    public static void inorder(Node root){
       if(root==null){
         return;
       }
       else{
           inorder(root.left);
           System.out.print(root.data+" ");
           inorder(root.right);
       }
    }
    static int minimumElement(Node root) {
        Node current = root;
        if (current == null) {
            return -1;
        } else {

            while (current.left != null) ;
            {
                current = current.left;
            }
            return current.data;
        }
    }
    public static void main(String[] args) {
        int value[]={8,5,3,6,10,11,14,-4};
        minimum_elelment_bst a=new minimum_elelment_bst();
        Node root=null;
        for (int i = 0; i <value.length ; i++) {
            root=a.insert(root,value[i]);
        }
        inorder(root);
        System.out.println();
        System.out.println("The minimum  element is "+a.minimumElement(root));

   }
}
