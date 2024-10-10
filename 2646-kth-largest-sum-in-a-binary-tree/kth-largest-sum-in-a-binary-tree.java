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
    public long kthLargestLevelSum(TreeNode root, int k) {
       Queue<TreeNode> q=new LinkedList<>();
       q.add(root);
ArrayList<Long> ans=new ArrayList<>();
       while(!q.isEmpty()){
long sum=0;
        int size=q.size();
for(int i=0;i<size;i++){
TreeNode node=q.poll();
sum=sum+node.val;

if(node.left!=null){
    q.add(node.left);
}

if(node.right!=null){
    q.add(node.right);
}
}
ans.add(sum);

       } 

       Collections.sort(ans,Collections.reverseOrder());
       if(k>ans.size()) return -1;
       return ans.get(k-1);
    }
}