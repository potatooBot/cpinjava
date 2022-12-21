package DSA.BinaryTree;
//Time Complexity: O(N)
//
//        Space Complexity: O(N)

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class level_order_traversal {
    static class node {
        int data;
        node left, right;
        public node(int item)
        {
            data = item;
            left = right = null;
        }
    }
    node root=null;
void printLevelOrder(){

    Queue<node> queue = new LinkedList<node>();
    ArrayList <Integer> wrapList = new ArrayList<Integer>();

    if(root == null) return ;

    queue.offer(root);
    while(!queue.isEmpty()){
        int sum=0;
        if(queue.peek().left != null)
            queue.offer(queue.peek().left);

        if(queue.peek().right != null)
            queue.offer(queue.peek().right);

        wrapList.add(queue.poll().data);
    }
    System.out.println(wrapList);

}

    public static void main(String[] args) {
       level_order_traversal tree_level = new level_order_traversal();


        System.out.println("Level order traversal of binary tree is - ");
        tree_level.printLevelOrder();

    }
}
