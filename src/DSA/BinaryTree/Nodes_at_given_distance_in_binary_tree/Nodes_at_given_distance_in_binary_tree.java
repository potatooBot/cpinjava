package DSA.BinaryTree.Nodes_at_given_distance_in_binary_tree;

import java.util.*;
import java.util.stream.Collectors;

class Node
 {
     int data;
     Node left, right;
     Node (int data){
         this.data=data;
         this.left=null;
         this.right=null;
     }
 }
 class pair{
    int node;int dist;
    pair(int node,int dist){
        this.node=node;
        this.dist=dist;
    }
 }

public class Nodes_at_given_distance_in_binary_tree {
    public static void inorder(Node root,ArrayList<Integer> inorderList){
        if ((root==null) )return;
        inorder(root.left,inorderList);
        inorderList.add(root.data);
        inorder(root.right,inorderList);

    }
public static void makingGraph(Node root,ArrayList<ArrayList<Integer>> adj){
        if(root==null) return;
        if(root.left!=null){
            makingGraph(root.left,adj);
            adj.get(root.data).add(root.left.data);
            adj.get(root.left.data).add(root.data);
        }
    if(root.right!=null){
        makingGraph(root.right,adj);
        adj.get(root.data).add(root.right.data);
        adj.get(root.right.data).add(root.data);
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
    public static ArrayList<Integer> KDistanceNodes(Node root, int target , int k)
    {
        // return the sorted list of all nodes at k dist
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
 dijkstraALgo(adj,dis,target);
        for (int i = 0; i <dis.length ; i++) {
            if(dis[i]==k){
                ans.add(i);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Node root=new Node(20);
    root.left=new Node(8);
    root.right=new Node(22);
        root.left.left=new Node(4);
        root.left.right=new Node(12);
        root.left.right.left=new Node(10);
        root.left.right.right=new Node(14);
        int target=8;
        int k=2;
        ArrayList<Integer> ans=KDistanceNodes(root,target,k);
        System.out.println(ans);
    }
}
