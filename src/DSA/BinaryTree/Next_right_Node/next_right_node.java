package DSA.BinaryTree.Next_right_Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

 class Node {
    public int data;
    public Node left;
    public Node right;
    public Node(int data){
        this.data=data;
        this.right=null;
        this.left=null;
    }

}
public class next_right_node {
    static Node nextRight(Node root, int key)
    {
        //Write your code here
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        ArrayList<Node> list=new ArrayList<>();
        while (q.isEmpty()==false){
            int level= q.size();
            for (int i = 0; i <level ; i++) {
                Node it=q.peek();
                q.remove();
           if(it.data==key&&i!=level-1){
               return q.peek();
           }

                if(it.left!=null){
                    q.add(it.left);
                }
                if(it.right!=null){
                    q.add(it.right);
                }


            }
        }

        Node val=new Node(-1);
    return val;
    }
    public static void main(String[] args) {
Node root=new Node(10);
root.left=new Node(2);
root.left.left=new Node(8);
root.left.right=new Node(4);
root.right=new Node(6);
root.right.right=new Node(5);
Node ans=nextRight(root,2);
        System.out.println(ans.data);
    }
}
