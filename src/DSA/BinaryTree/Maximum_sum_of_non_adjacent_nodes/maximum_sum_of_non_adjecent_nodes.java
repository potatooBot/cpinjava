package DSA.BinaryTree.Maximum_sum_of_non_adjacent_nodes;
import java.util.*;
class Node
{
    int data;
    Node left, right;

    Node(int data)
    {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class maximum_sum_of_non_adjecent_nodes {

    public static int getSum(Node root,HashMap<Node,Integer> map){
        if (root == null) {
            return 0;
        }

        if (map.containsKey(root)){
         return map.get(root);
        }
        int inc=0,exc=0;
        inc +=root.data;
        if(root.left!=null){
            inc +=getSum(root.left.left,map) +getSum(root.left.right,map);

        }
        if(root.right!=null){
            inc +=getSum(root.right.left,map) +getSum(root.right.right,map);

        }
        exc+=getSum(root.left,map);
        exc+=getSum(root.right,map);
        map.put(root,Math.max(inc,exc));
        return Math.max(inc,exc);

    }

    static int getMaxSum(Node root)
    {
     if (root==null) return 0;

HashMap<Node,Integer> map=new HashMap<>();

    int ans=getSum(root,map);

        System.out.println(map);
    return ans;
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.right.left=new Node(5);
        root.right.right=new Node(6);
  int ans= getMaxSum(root);
        System.out.println(ans);

    }
}
