package DSA.BinaryTree.Most_frequent_subtree_sum;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;

class TreeNode{
    int val;
    TreeNode left,right;
    public TreeNode(int val){
        this.val= val;
        this.left=null;
        this.right=null;

    }
}

public class most_frequent_subtree_sum {
    public static int getMax(TreeNode root, TreeMap<Integer,Integer> map,int maxVAlue[]){
        if(root==null) return 0;
        int left=getMax(root.left,map,maxVAlue);
        int right=getMax(root.right,map,maxVAlue);

        map.put(left+right+root.val,map.getOrDefault(left+right+ root.val,0)+1);

        return left+right+ root.val;
    }
    static    public int[] findFrequentTreeSum(TreeNode root) {


        TreeMap<Integer,Integer> map=new TreeMap<>();
int maxValue[]=new int[1];
        getMax(root,map,maxValue);
        System.out.println(map);
        int maxi=Integer.MIN_VALUE;
        for (Map.Entry<Integer,Integer> entry:
                map.entrySet()  ) {
            maxi=Math.max(maxi,(int)entry.getValue());
        }
        ArrayList<Integer> list=new ArrayList<>();
        for (Map.Entry<Integer,Integer> entry:
                map.entrySet()  ) {
            if(entry.getValue()==maxi)
            list.add((int)entry.getKey());
        }
        int ans[]=new int[list.size()];
        int i=0;
        System.out.println(list);
        for (int ele:list
             ) {
            ans[i++]=ele;
        }
        return ans;
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(10);
        root.left=new TreeNode(5);
        root.right=new TreeNode(15);
        root.right.left=new TreeNode(6);
        root.right.right=new TreeNode(20);
findFrequentTreeSum(root);
    }
}
