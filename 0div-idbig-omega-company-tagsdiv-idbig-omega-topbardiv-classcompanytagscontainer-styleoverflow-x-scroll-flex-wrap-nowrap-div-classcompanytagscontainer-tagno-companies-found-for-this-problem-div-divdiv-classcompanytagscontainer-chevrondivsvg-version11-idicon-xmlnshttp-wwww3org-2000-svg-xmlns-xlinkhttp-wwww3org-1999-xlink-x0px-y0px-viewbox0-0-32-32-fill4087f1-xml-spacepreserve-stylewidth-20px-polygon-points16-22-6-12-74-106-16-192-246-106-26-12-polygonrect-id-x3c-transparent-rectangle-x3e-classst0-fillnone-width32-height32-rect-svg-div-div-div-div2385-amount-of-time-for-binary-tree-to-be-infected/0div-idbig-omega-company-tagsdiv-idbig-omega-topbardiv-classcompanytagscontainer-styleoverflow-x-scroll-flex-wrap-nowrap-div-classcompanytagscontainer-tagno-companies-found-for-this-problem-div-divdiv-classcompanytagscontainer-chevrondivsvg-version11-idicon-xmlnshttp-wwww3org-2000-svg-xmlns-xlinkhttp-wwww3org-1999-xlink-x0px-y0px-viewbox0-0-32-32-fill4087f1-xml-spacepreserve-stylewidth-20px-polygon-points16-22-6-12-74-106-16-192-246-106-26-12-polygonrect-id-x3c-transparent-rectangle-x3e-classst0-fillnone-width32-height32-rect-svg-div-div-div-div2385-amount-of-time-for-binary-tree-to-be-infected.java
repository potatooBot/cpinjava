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
     public pair(int node,int time){
         this.node=node;
         this.time=time;
     }
 }
class Solution {
    public static void inorder(TreeNode root,int start,int maxValNode[]){
        if(root==null) return;
inorder(root.left,start,maxValNode);
maxValNode[0]=Math.max(maxValNode[0],root.val);
inorder(root.right,start,maxValNode);
    }
    public static void convertToGraph(ArrayList<ArrayList<Integer>> adj,TreeNode root){
        if(root==null) return;
        convertToGraph(adj,root.left);
    if(root.left!=null) {
        adj.get(root.val).add(root.left.val);
        adj.get(root.left.val).add(root.val);
    }
 if(root.right!=null) {
        adj.get(root.val).add(root.right.val);
        adj.get(root.right.val).add(root.val);
    }
    convertToGraph(adj,root.right);
    }

    public int amountOfTime(TreeNode root, int start) {
        //TreeNode maxNode[]=new TreeNode[1];
int maxNodeVal[]= new int[1];
ArrayList<Integer> ds=new ArrayList<>();
inorder(root,start,maxNodeVal);
    ArrayList<ArrayList<Integer>> adj=new ArrayList<>();


    for(int i=1;i<=maxNodeVal[0]+1;i++){
        adj.add(new ArrayList<>());
    }
    convertToGraph(adj,root);
    Queue<pair> q=new LinkedList<>();
q.add(new pair(start,0));
int maxTime=-1;
boolean vis[]=new boolean[maxNodeVal[0]+1];
vis[start]=true;
while(!q.isEmpty())
{
    pair it=q.peek();
    q.remove();
maxTime=Math.max(maxTime,it.time);

for(int adjNode:adj.get(it.node)){
if(vis[adjNode]==false)
{
    q.add(new pair(adjNode,it.time+1));
    vis[adjNode]=true;
}
}

}
return maxTime;
    }
}