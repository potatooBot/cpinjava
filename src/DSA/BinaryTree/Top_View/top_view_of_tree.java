package DSA.BinaryTree.Top_View;
import java.util.*;
class TreeNode_top_view {
    int data;
    TreeNode_top_view left, right;
    TreeNode_top_view(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
class tuple{
    int lev;
   TreeNode_top_view node;
    tuple(int lev,TreeNode_top_view node){
        this.lev=lev;
        this.node=node;
    }
}
public class top_view_of_tree{

        // add your code
        static ArrayList<Integer> topView(TreeNode_top_view root)
        {
            // add your code

            Queue<tuple> q=new LinkedList<>();
            TreeMap<Integer,Integer> map=new TreeMap<>();
            ArrayList<Integer> list=new ArrayList<>();
            if(root==null) return list;
            q.add(new tuple(0,root));
            while(!q.isEmpty()){

                tuple tup=q.poll();
                int level=tup.lev;
                TreeNode_top_view temp=tup.node;
                if(map.get(level)==null){
                    map.put(level,temp.data);
                }
                if(temp.left!=null){
                    q.add(new tuple(level-1,temp.left));
                }

                if(temp.right!=null){
                    q.add(new tuple(level+1,temp.right));
                }
            }
            for(Map.Entry<Integer,Integer> ele:map.entrySet()){
                list.add(ele.getValue());
            }
            return list;
        }


    public static void main(String[] args) {
        TreeNode_top_view root = new TreeNode_top_view(1);
        root.left = new TreeNode_top_view(2);
        root.left.left = new TreeNode_top_view(4);
        root.left.right = new TreeNode_top_view(10);
        root.left.left.right = new TreeNode_top_view(5);
        root.left.left.right.right = new TreeNode_top_view(6);
        root.right = new TreeNode_top_view(3);
        root.right.left = new TreeNode_top_view(9);
        root.right.right = new TreeNode_top_view(10);

        ArrayList <Integer> list = new ArrayList < > ();
        list = topView(root);

        System.out.println("The Top View is : ");
        for (int it: list) {

                System.out.print(it + " ");

            System.out.println();
        }

    }
}
