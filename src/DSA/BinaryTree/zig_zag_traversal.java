package DSA.BinaryTree;
import java.util.*;
public class zig_zag_traversal {
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
    void zigzagLevelOrder() {
        Queue <node > queue = new LinkedList < node > ();
        ArrayList < ArrayList < Integer >> wrapList = new ArrayList < > ();

        if (root == null) return;

        queue.offer(root);
        boolean flag = true;
        while (!queue.isEmpty()) {
            int levelNum = queue.size();
            ArrayList < Integer > subList = new ArrayList < Integer > (levelNum);
            for (int i = 0; i < levelNum; i++) {
                int index = i;
                if (queue.peek().left != null) queue.offer(queue.peek().left);
                if (queue.peek().right != null) queue.offer(queue.peek().right);
                if (flag == true) subList.add(queue.poll().data);
                else subList.add(0, queue.poll().data);
            }
            flag = !flag;
            wrapList.add(subList);
        }
        System.out.println(wrapList);
    }
    public static void main(String[] args) {
        zig_zag_traversal tree_level=new zig_zag_traversal();
        tree_level.root = new node(1);
        tree_level.root.left = new node(2);
        tree_level.root.right = new node(3);
        tree_level.root.left.left = new node(4);
        tree_level.root.left.right = new node(5);

        ArrayList < ArrayList < Integer >> res = new ArrayList < > ();
        tree_level.zigzagLevelOrder();

    }
}
