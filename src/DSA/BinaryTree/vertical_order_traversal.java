package DSA.BinaryTree;

import java.util.*;

public class vertical_order_traversal {
    static class Node
    {
        int data;
        Node left;
        Node right;

        // Constructor
        Node(int data)
        {
            this.data= data;

        }
    }
public static void levelOrder(Node root,int idx,TreeMap <Integer,List<Integer>> tmap){
        Queue <Node> q=new LinkedList<>();
        Queue <Integer> lines=new LinkedList<>();
        q.add(root);
        lines.add(0);
        while (q.size()>0){
            Node node=q.poll();
            int lineidx=lines.poll();
if(!tmap.containsKey(lineidx)) {
    tmap.put(lineidx,new ArrayList());
}
tmap.get(lineidx).add(node.data);

            if(root.left!=null){
                q.add(node.left);
                lines.add(idx-1);
            }

            if(root.right!=null){
                q.add(node.right);
                lines.add(idx+1);
            }
        }
}
    public static List<List<Integer>> verticalTraversal(Node root) {
        List<List<Integer>> list=new ArrayList();
        TreeMap <Integer,List<Integer>> tmap=new TreeMap();
        if(root==null) return list;
        levelOrder(root,0,tmap);
        list.addAll(tmap.values());
        return list;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.left.right = new Node(8);
        root.right.right.right = new Node(9);

        System.out.println("Vertical Order traversal is");
        List<List<Integer>> list=new ArrayList();
        list=verticalTraversal(root);
        System.out.println(list);
    }
}
