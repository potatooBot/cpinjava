package Practice.Build_tree_from_preorder_and_postorder.Path_from_root_with_specified_sum;

import java.util.ArrayList;

class Node{
    int data;
   Node left,right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
public class path_from_root_with_specified_sum {
    public static void getPathSum(Node node,int sum,ArrayList<Integer> ds,ArrayList<ArrayList<Integer>> lisofList){

        ds.add(node.data);
        sum=sum-node.data;
        if(sum==0){
            lisofList.add(new ArrayList<>(ds));
            ds.remove(ds.size()-1);
        return ;
        }
//        if(node==null) {
//            return;
//        }

        if(node.left!=null)
    getPathSum(node.left,sum,ds,lisofList);


if(node.right!=null)
            getPathSum(node.right,sum,ds,lisofList);
ds.remove(ds.size()-1);

    }
     public static ArrayList<ArrayList<Integer>> printPaths(Node root, int sum)
    {
        ArrayList<ArrayList<Integer>> listofList=new ArrayList<>();
ArrayList<Integer> ds=new ArrayList<>();

getPathSum(root,sum,ds,listofList);
        System.out.println(listofList);
        return listofList;
        //code here
    }
    public static void main(String[] args) {
        int sum = 38;
        Node root=new Node(10);
        root.left=new Node(28);
        root.right=new Node(13);
        root.right.left=new Node(14);
        root.right.left.left=new Node(21);
        root.right.left.right=new Node(22);
        root.right.right=new Node(15);
        root.right.right.left=new Node(23);
        root.right.right.right=new Node(24);
        printPaths(root,sum);
    }
}
