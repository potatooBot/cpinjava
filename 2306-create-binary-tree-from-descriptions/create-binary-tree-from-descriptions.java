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
    public static TreeNode build(int val,HashMap<Integer,ArrayList<Integer>> map){

        TreeNode root=new TreeNode(val);
        if(map.containsKey(val)==true){
        ArrayList<Integer> ds= map.get(val);
        
int lt=ds.get(0);
int rt=ds.get(1);

if(lt!=0){
    root.left=build(lt,map);
}
if(rt!=0){
    root.right=build(rt,map);
}
        }
return root;
    }
    public TreeNode createBinaryTree(int[][] des) {
        HashMap<Integer,Integer> map1=new HashMap<>();
          HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
    for(int arr[]:des){
        int par=arr[0];
        int child=arr[1];
        int val=arr[2];
        map1.put(child,par);
        if(val==1){
         if(map.containsKey(par)==false){
            ArrayList<Integer> ds=new ArrayList<>(2);
           ds.add(0);
           ds.add(0);
         ds.set(0,child);
         map.put(par,new ArrayList<>(ds));
         }
         else{
            ArrayList<Integer> ds=map.get(par);
            ds.set(0,child);
   map.put(par,new ArrayList<>(ds));
         }
        }
        else if(val==0){
            if(map.containsKey(par)==false){
            ArrayList<Integer> ds=new ArrayList<>(2);
           ds.add(0);
           ds.add(0);
         ds.set(1,child);
         map.put(par,new ArrayList<>(ds));
         }
         else{
            ArrayList<Integer> ds=map.get(par);
            ds.set(1,child);
   map.put(par,new ArrayList<>(ds));
         }
        }
    }
    int rt =0;
   for(int arr[]:des){
        int val1=arr[0];
        int val2=arr[1];
        if(map1.containsKey(val1)==false) {
            rt=val1;
            break;
        }
   
    }
    //System.out.println(map);
    TreeNode root=build(rt,map);

return root;
    }
}