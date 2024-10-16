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
     public static void getSum(TreeNode root,List<List<Integer>> ans,ArrayList<Integer> ds ){    
         if(root == null) return;
    ds.add(root.val);
if(root.left==null&&root.right==null){

        ans.add(new ArrayList<> (ds));
    
    return;
}
       if(root.left!=null){
getSum(root.left,ans,ds);
ds.remove(ds.size()-1);
       }


if(root.right!=null) {
getSum(root.right,ans,ds);
ds.remove(ds.size()-1);
    }
   
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List <List<Integer> > ans=new ArrayList <>();
ArrayList<Integer> ds=new ArrayList<>();
getSum(root,ans,ds);
List<String> res=new ArrayList<>();
for(List<Integer> ele:ans){
    String str="";
    for(int i=0;i<ele.size();i++){
       // if(i==ele.length())
        str=str+String.valueOf(ele.get(i));
        if(i==ele.size()-1) continue;
        str=str+"->";
    }
res.add(str);
}
        return res;
    }
}