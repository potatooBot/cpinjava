package DSA.BinaryTree.Level_order_traversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class node2 {
    int data;
    node2 left, right;
    node2(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
public class level_order_type2 {
    static void printLevelOrder(node2 root) {

        Queue<node2> queue = new LinkedList<node2>();

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        if (root == null) return;

        queue.offer(root);
        while (!queue.isEmpty()) {
            ArrayList<Integer> wrapList = new ArrayList<Integer>();
            int level = queue.size();
            for (int i = 0; i < level; i++) {


                if (queue.peek().left != null)
                    queue.offer(queue.peek().left);

                if (queue.peek().right != null)
                    queue.offer(queue.peek().right);


                int val = queue.poll().data;
//        if(queue.size()==0)
                wrapList.add(val);
            }
            ans.add(new ArrayList<>(wrapList));

        }
        System.out.println(ans);
        System.out.println(ans.get(ans.size()-1).get(0));
    }
    public static void main(String[] args) {
        level_order_traversal tree_level = new level_order_traversal();
        node2 root = new node2(1);
        root.left = new node2(2);
        root.left.left = new node2(4);
        root.left.right = new node2(10);
        root.left.left.right = new node2(5);
        root.left.left.right.right = new node2(6);
        root.left.left.right.left = new node2(25);
        root.right = new node2(3);
        root.right.left = new node2(9);
        root.right.right = new node2(10);
        System.out.println("Level order traversal of binary tree is - ");
        printLevelOrder(root);

    }
}
