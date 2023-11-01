/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public static void inorder(TreeNode root,HashMap<Integer,Integer> map)
    {
        if(root==null) return ;
        inorder(root.left,map);
        map.put(root.val,map.getOrDefault(root.val,0)+1);
        inorder(root.right,map);
    }
    public int[] findMode(TreeNode root) {
       HashMap<Integer,Integer> map=new HashMap<>();
        inorder(root,map);
    int maxi=-1;
    for(Map.Entry<Integer,Integer> entry:map.entrySet()){
        maxi=Math.max(maxi,entry.getValue());
    }
    ArrayList<Integer> ds=new ArrayList<>(); 
     for(Map.Entry<Integer,Integer> entry:map.entrySet()){
        if(entry.getValue()==maxi){
            ds.add(entry.getKey());
        }
    }
int ans[]=new int[ds.size()];
 for(int i=0;i<ds.size();i++){
     ans[i]=ds.get(i);
 }
 return ans;
    }
}