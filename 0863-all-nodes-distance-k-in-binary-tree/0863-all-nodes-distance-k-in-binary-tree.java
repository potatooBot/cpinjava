/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
  class pair{
    int node;int dist;
    pair(int node,int dist){
        this.node=node;
        this.dist=dist;
    }
 }
class Solution {
        public static void inorder(TreeNode root,ArrayList<Integer> inorderList){
        if ((root==null) )return;
        inorder(root.left,inorderList);
        inorderList.add(root.val);
        inorder(root.right,inorderList);

    }
public static void makingGraph(TreeNode root,ArrayList<ArrayList<Integer>> adj){
        if(root==null) return;
        if(root.left!=null){
            makingGraph(root.left,adj);
            adj.get(root.val).add(root.left.val);
            adj.get(root.left.val).add(root.val);
        }
    if(root.right!=null){
        makingGraph(root.right,adj);
        adj.get(root.val).add(root.right.val);
        adj.get(root.right.val).add(root.val);
    }
}
public static void dijkstraALgo(ArrayList<ArrayList<Integer>> adj,int dist[],int src){
    Arrays.fill(dist,(int)1e9);
    Queue<pair> q=new LinkedList<>();
    q.add(new pair(src,0));
    dist[src]=0;
    while (!q.isEmpty()){
        int node=q.peek().node;
        int dis=q.peek().dist;
        q.poll();

        for (int it:
             adj.get(node)) {
            if(dist[node]+1<dist[it]){
                dist[it]=1+dist[node];
                q.add(new pair(it,1+dist[node]));
            }
        }
    }

}
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
            ArrayList<Integer> ans=new ArrayList<>();
    ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
    ArrayList<Integer> inoList=new ArrayList<>();
    inorder(root,inoList);
        int maxi=Collections.max(inoList);
        for (int i = 1; i <=maxi+1 ; i++) {
            adj.add(new ArrayList<>());
        }
makingGraph(root,adj);
        int dis[]=new int[maxi+1];
 dijkstraALgo(adj,dis,target.val);
        for (int i = 0; i <dis.length ; i++) {
            if(dis[i]==k){
                ans.add(i);
            }
        }
        return ans;
    }
}