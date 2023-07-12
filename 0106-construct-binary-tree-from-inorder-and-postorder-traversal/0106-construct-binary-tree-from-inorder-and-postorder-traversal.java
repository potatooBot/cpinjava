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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        HashMap <Integer,Integer> map=new HashMap<>();
for(int i=0;i<inorder.length;i++){
map.put(inorder[i],i);
}
TreeNode root=build(postorder,0,postorder.length-1,inorder,0,inorder.length-1,map);
return root;
    }

    static TreeNode build(int preorder[],int preStart,int preEnd,int inorder[],int inStart,int inEnd,HashMap <Integer,Integer> map){
    if(preStart>preEnd ||inStart> inEnd) return null;

TreeNode root=new TreeNode(preorder[preEnd]);
int inoderIdx=map.get(preorder[preEnd]);
int numleft=inoderIdx-inStart;
root.left=build(preorder,preStart,preStart+numleft-1,inorder,inStart,inoderIdx-1,map);
root.right=build(preorder,preStart+numleft,preEnd-1,inorder,inoderIdx+1,inEnd,map);
return root;
}
}