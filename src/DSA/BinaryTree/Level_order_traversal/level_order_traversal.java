package DSA.BinaryTree;
//Time Complexity: O(N)
//
//        Space Complexity: O(N)



import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
class node {
    int data;
  node left, right;
    node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
public class level_order_traversal {


static void printLevelOrder(node root){

    Queue<node> queue = new LinkedList<node>();
    ArrayList <Integer> wrapList = new ArrayList<Integer>();
    ArrayList<ArrayList<Integer>> ans=new ArrayList<>();

    if(root == null) return ;

    queue.offer(root);
    while(!queue.isEmpty()){
        int sum=0;
        if(queue.peek().left != null)
            queue.offer(queue.peek().left);

        if(queue.peek().right != null)
            queue.offer(queue.peek().right);

        wrapList.add(queue.poll().data);
        ans.add(new ArrayList<>(wrapList));
    }
    System.out.println(wrapList);

}

    public static void main(String[] args) {
       level_order_traversal tree_level = new level_order_traversal();
        node root = new node(1);
        root.left = new node(2);
        root.left.left = new node(4);
        root.left.right = new node(10);
        root.left.left.right = new node(5);
        root.left.left.right.right = new node(6);
        root.right = new node(3);
        root.right.left = new node(9);
        root.right.right = new node(10);
        System.out.println("Level order traversal of binary tree is - ");
      printLevelOrder(root);

    }
}
