//
//Given the root of a binary tree and an integer targetSum, return all root-to-leaf paths where the sum of the node values in the path equals targetSum. Each path should be returned as a list of the node values, not node references.
//
//        A root-to-leaf path is a path starting from the root and ending at any leaf node. A leaf is a node with no children.
//
//
//
//        Example 1:
//
//
//        Input: root = [5,4,8,11,null,13,4,7,2,null,null,5,1], targetSum = 22
//        Output: [[5,4,11,2],[5,8,4,5]]
//        Explanation: There are two paths whose sum equals targetSum:
//        5 + 4 + 11 + 2 = 22
//        5 + 8 + 4 + 5 = 22




package DSA.BinaryTree;

import java.util.ArrayList;
import java.util.*;
class TreeNode{
    int val;
    TreeNode2 left, right;
    TreeNode(int val) {
        this.val = val;
        left = null;
        right = null;
    }
}
public class path_sum_2 {

    public static List<List<Integer>> pathSum(TreeNode2 root, int targetSum) {
        List <List<Integer> > ans=new ArrayList <>();
        ArrayList<Integer> ds=new ArrayList<>();
        getSum(root,targetSum,ans,ds);
        return ans;
    }


    public static void getSum(TreeNode2 root, int target, List<List<Integer>> ans, ArrayList<Integer> ds ){
        if(root == null) return;
        ds.add(root.val);
        if(root.left==null&&root.right==null){
            if(target-root.val==0){
                ans.add(new ArrayList<> (ds));
            }
            return;
        }
        if(root.left!=null){
            getSum(root.left,target-root.val,ans,ds);
            ds.remove(ds.size()-1);
            System.out.println(ds);
        }


        if(root.right!=null) {
            getSum(root.right,target-root.val,ans,ds);
            ds.remove(ds.size()-1);
        }

    }
    public static void main(String args[]) {

       TreeNode2 root = new TreeNode2(5);
        root.left = new TreeNode2(4);
        root.right = new TreeNode2(8);
        root.left.left = new TreeNode2(11);
        root.left.left.left = new TreeNode2(7);
        root.left.left.right = new TreeNode2(2);
        root.right.left = new TreeNode2(13);
        root.right.right = new TreeNode2(4);
        root.right.right.left = new TreeNode2(5);
        root.right.right.right = new TreeNode2(1);
List <List<Integer>> ans=pathSum(root,22);
        System.out.println(ans);

//        System.out.println("The Max Path Sum for this tree is " + answer);

    }
}
