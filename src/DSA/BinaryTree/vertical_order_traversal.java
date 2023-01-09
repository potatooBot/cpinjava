package DSA.BinaryTree;

import java.util.*;

class TreeNode_vertical_order {
    int data;
    TreeNode_vertical_order left, right;
    TreeNode_vertical_order(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
class Tuple {
    TreeNode_vertical_order node;
    int row;
    int col;
    public Tuple(TreeNode_vertical_order _node, int _row, int _col) {
        node = _node;
        row = _row;
        col = _col;
    }
}
public class vertical_order_traversal {
    public static List < List < Integer >> findVertical(TreeNode_vertical_order root) {
        TreeMap < Integer, TreeMap < Integer, PriorityQueue < Integer >>> map = new TreeMap < > ();
        Queue < Tuple > q = new LinkedList < Tuple > ();
        q.offer(new Tuple(root, 0, 0));
        while (!q.isEmpty()) {
            Tuple tuple = q.poll();
            TreeNode_vertical_order node = tuple.node;
            int x = tuple.row;
            int y = tuple.col;


            if (!map.containsKey(x)) {
                map.put(x, new TreeMap < > ());
            }
            if (!map.get(x).containsKey(y)) {
                map.get(x).put(y, new PriorityQueue < > ());
            }
            map.get(x).get(y).offer(node.data);

            if (node.left != null) {
                q.offer(new Tuple(node.left, x - 1, y + 1));
            }
            if (node.right != null) {
                q.offer(new Tuple(node.right, x + 1, y + 1));
            }
        }
        List < List < Integer >> list = new ArrayList < > ();
        for (TreeMap < Integer, PriorityQueue < Integer >> ys: map.values()) {
            list.add(new ArrayList < > ());
            for (PriorityQueue < Integer > nodes: ys.values()) {
                while (!nodes.isEmpty()) {
                    list.get(list.size() - 1).add(nodes.poll());
                }
            }
        }
        return list;
    }

    public static void main(String args[]) {

        TreeNode_vertical_order root = new TreeNode_vertical_order(1);
        root.left = new TreeNode_vertical_order(2);
        root.left.left = new TreeNode_vertical_order(4);
        root.left.right = new TreeNode_vertical_order(10);
        root.left.left.right = new TreeNode_vertical_order(5);
        root.left.left.right.right = new TreeNode_vertical_order(6);
        root.right = new TreeNode_vertical_order(3);
        root.right.left = new TreeNode_vertical_order(9);
        root.right.right = new TreeNode_vertical_order(10);

        List < List < Integer >> list = new ArrayList < > ();
        list = findVertical(root);

        System.out.println("The Vertical Traversal is : ");
        for (List < Integer > it: list) {
            for (int nodeVal: it) {
                System.out.print(nodeVal + " ");
            }
            System.out.println();
        }

    }
}