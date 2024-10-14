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

    public int dfs(TreeNode root, ArrayList<Integer> ds){
if(root==null) return 0;

int leftSub=dfs(root.left,ds);
int rightSub=dfs(root.right,ds);

if(leftSub==rightSub){
    ds.add(leftSub+rightSub+1);
    return leftSub+rightSub+1;
}

return -1;
    }
    public int kthLargestPerfectSubtree(TreeNode root, int k) {
        ArrayList<Integer> ds=new ArrayList<>();
        dfs(root,ds);

        Collections.sort(ds);
        Collections.reverse(ds);
        if(ds.size()<k) return -1;
        return ds.get(k-1);
    }
}