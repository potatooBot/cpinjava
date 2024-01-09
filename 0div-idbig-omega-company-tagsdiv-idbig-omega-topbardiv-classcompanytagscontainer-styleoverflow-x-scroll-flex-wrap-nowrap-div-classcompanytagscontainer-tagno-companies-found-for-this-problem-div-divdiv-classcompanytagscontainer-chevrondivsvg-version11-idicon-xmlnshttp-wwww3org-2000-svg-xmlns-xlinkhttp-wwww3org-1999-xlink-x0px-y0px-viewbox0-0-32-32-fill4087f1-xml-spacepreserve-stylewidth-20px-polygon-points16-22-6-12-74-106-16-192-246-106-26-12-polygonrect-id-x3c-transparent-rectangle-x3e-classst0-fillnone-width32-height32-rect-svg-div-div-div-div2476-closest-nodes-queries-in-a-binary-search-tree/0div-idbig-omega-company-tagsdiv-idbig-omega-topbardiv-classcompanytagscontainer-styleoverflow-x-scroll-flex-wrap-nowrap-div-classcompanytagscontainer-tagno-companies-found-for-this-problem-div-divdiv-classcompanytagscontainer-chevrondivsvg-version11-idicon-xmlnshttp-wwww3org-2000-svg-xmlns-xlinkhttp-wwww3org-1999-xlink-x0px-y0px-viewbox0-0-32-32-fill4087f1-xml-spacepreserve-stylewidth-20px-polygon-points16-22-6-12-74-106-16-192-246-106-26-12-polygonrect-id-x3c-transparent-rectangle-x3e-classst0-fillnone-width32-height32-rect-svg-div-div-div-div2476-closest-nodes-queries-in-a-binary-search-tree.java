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
    public static void inorder(TreeNode root,ArrayList<Integer>ds){
        if(root==null) return;

        inorder(root.left,ds);
ds.add(root.val);
inorder(root.right,ds);
    }

    public static int findFloor(ArrayList<Integer> ds,int val){
int low=0;
int high=ds.size()-1;

int ans=-1;
while(low<=high)
{
int mid=(low+high)/2;
if(ds.get(mid)<=val){
    ans=ds.get(mid);
    low=mid+1;
}
else{
    high=mid-1;
}

}
return ans; 
    }
        public static int findCeil(ArrayList<Integer> ds,int val){
int low=0;
int high=ds.size()-1;

int ans=-1;
while(low<=high)
{
int mid=(low+high)/2;
if(ds.get(mid)>=val){
    ans=ds.get(mid);
    high=mid-1;
}
else{
    low=mid+1;
}

}
return ans; 
    }
    public List<List<Integer>> closestNodes(TreeNode root, List<Integer> queries) {
        List<List<Integer>> ans=new ArrayList<>();
ArrayList<Integer> ds=new ArrayList<>();

inorder(root,ds);


for(int ele:queries){
    int floor=findFloor(ds,ele);
    int ceil=findCeil(ds,ele);
    List<Integer> list=new ArrayList<>();
    list.add(floor);
    list.add(ceil);
    ans.add(list);
}

return ans;
    }
}