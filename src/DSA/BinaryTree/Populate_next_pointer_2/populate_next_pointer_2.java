package DSA.BinaryTree.Populate_next_pointer_2;
public class populate_next_pointer_2 {
    static public Node connect(Node root) {
        Node dummy=new Node(0);
        Node pre=root;
        while (pre!=null){
            Node cur=dummy;
            while (pre!=null){
                if(pre.left!=null){
                    cur.next=pre.left;
                    cur=cur.next;
                }
                if(pre.right!=null){
                    cur.next=pre.right;
                    cur=cur.next;
                }
                pre=pre.next;
            }
            pre=dummy.next;
            dummy.next=null;
        }
        return root;
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
    root.left.left=new Node(4);
    root.left.right=new Node(5);
    root.right.left=new Node(6);
    root.right.right=new Node(7);
Node ans=connect(root);
    }
}
