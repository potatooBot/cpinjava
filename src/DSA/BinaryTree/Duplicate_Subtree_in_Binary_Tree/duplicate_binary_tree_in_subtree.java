package DSA.BinaryTree.Duplicate_Subtree_in_Binary_Tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
public class duplicate_binary_tree_in_subtree {
    public static String inorderCheck(HashMap<String,Integer> map,Node root){
        if(root==null) return "";


        String str="#" +inorderCheck(map,root.left)+"#"+String.valueOf(root.data)+"#"+inorderCheck(map,root.right);
        if(root.left!=null||root.right!=null){
            map.put(str, map.getOrDefault(str,0)+1);
        }

        return str;
    }
    static   int dupSub(Node root) {

        HashMap<String,Integer> map=new HashMap<>();

     inorderCheck(map,root);

        for (Map.Entry<String,Integer> entry:map.entrySet()
             ) {
            if(entry.getValue()>1) return 1;
        }
     return 0;   // code here
    }
    public static void main(String[] args) {
Node root=new Node(1);
root.left=new Node(2);
root.right=new Node(3);
root.left.left=new Node(4);
root.left.right=new Node(5);
root.right.right=new Node(2);
root.right.right.left=new Node(4);
root.right.right.right=new Node(5);
int ans=dupSub(root);
        System.out.println(ans);
            }
}
