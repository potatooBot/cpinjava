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
   class pair{
   int node;
    int time;
    pair(int node,int time){
        this.node=node;
        this.time=time;
    }
  }
class Solution {
      public static void searchNode(TreeNode root,int start,int val[],TreeNode source[]){
        if (root == null) {
            return;
        }
        searchNode(root.left,start,val,source);
      val[0]=Math.max(val[0],root.val );
      if(root.val==start){
          source[0]=root;
      }
        searchNode(root.right,start,val,source);
    }
    public static void convertToGraph(ArrayList<ArrayList<Integer>> adjList,TreeNode root){
        if (root == null) {
            return;
        }
        convertToGraph(adjList,root.left);
        if(root.left!=null) {
            adjList.get(root.val).add(root.left.val);
            adjList.get(root.left.val).add(root.val);
        }
        if(root.right!=null){
            adjList.get(root.val).add(root.right.val);
            adjList.get(root.right.val).add(root.val);
        }
        convertToGraph(adjList,root.right);

    }
    static  public int amountOfTime(TreeNode root, int start) {
        Queue<pair> q = new LinkedList<>();
    int val[]=new int[1];
   TreeNode source[]=new TreeNode[1]  ;
    searchNode(root,start,val,source);
        ArrayList<ArrayList<Integer>> adjList=new ArrayList<>();
        for (int i = 1; i <=val[0]+1 ; i++) {
            adjList.add(new ArrayList<>());
        }
convertToGraph(adjList,root);
        int maxTime=Integer.MIN_VALUE;
        boolean vis[]=new  boolean[val[0]+1];
        q.add(new pair(start,0));
       vis[start]=true;
        while (!q.isEmpty()){
            pair it=q.peek();
            q.remove();
           maxTime=Math.max(maxTime,it.time);
            for (int adjNode:
                 adjList.get(it.node)) {
                if (vis[adjNode] == false) {
                    q.add(new pair(adjNode, it.time + 1));
            vis[adjNode]=true;
                }
            }

        }
        return maxTime;
    }
}