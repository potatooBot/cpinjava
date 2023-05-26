package DSA.BinaryTree.Populate_next_pointer_in_each_node;

public class populate_each_pointer {
    public Node connect(Node root) {
if(root==null) return root;
Node pre=root;
Node cur=null;
while (pre.left!=null){
    cur=pre;

    while (cur!=null){
        cur.left.next=cur.right;
        if(cur.next!=null){
            cur.right.next=cur.next.left;
        }
        cur=cur.next;
    }
    pre=pre.left;
}
        return root;
    }
    public static void main(String[] args) {

    }
}
