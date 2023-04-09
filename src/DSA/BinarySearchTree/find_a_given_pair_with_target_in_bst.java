package DSA.BinarySearchTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

//class Node {
// Node  left,right;
// int data;
// Node (int data){
//     this.left=null;
//     this.right=null;
//    this.data= data;
// }
//        }
public class find_a_given_pair_with_target_in_bst {
    public static void inorder(Node root,ArrayList<Integer> ds,int target){


        if(root.left!=null) {
         inorder(root.left, ds, target);
        }
  ds.add(root.data);

        if(root.right!=null) {
            inorder(root.right, ds, target);
        }


    }
    static   public int isPairPresent(Node root, int target)
    {
        // Write your code here

        HashMap<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> ds=new ArrayList<>();
        inorder(root,ds,target);

for (int i = 0; i <ds.size() ; i++) {
        if(map.containsKey(target-ds.get(i))) return 1;
        map.put(ds.get(i),i );
    }

    return 0;
    }
    public static void main(String[] args) {
//Node root=new Node(6);
//root.left=new Node(5);
//root.left.left=new Node(3);
//root.left.left.left=new Node(1);
//root.left.left.right=new Node(4);

Node root=new Node(2);
root.left=new Node(1);
root.right=new Node(3);

int sum=2;
    int ans=isPairPresent(root,sum);
        System.out.println(ans);
    }
}
