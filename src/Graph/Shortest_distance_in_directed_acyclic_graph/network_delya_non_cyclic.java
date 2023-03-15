package Graph.Shortest_distance_in_directed_acyclic_graph;

import java.util.*;

class pair_network_delay{
    int v,weight;
    public  pair_network_delay(int v,int weight){
        this.v=v;
        this.weight=weight;
    }
}
public class network_delya_non_cyclic {
    public static void topoSort(int node,boolean vis[],ArrayList<ArrayList<pair_network_delay>> adj,Stack <Integer> stk){
        vis[node]=true;
        for (int i = 0; i <adj.get(node).size() ; i++) {
            int vi=adj.get(node).get(i).v;
            if (vis[vi]==false) {
                topoSort(vi,vis,adj,stk);
            }
        }
        stk.add(node);
    }
    public static int networkDelayTime(int[][] edge, int n, int src) {
        ArrayList<ArrayList<pair_network_delay>> adj=new ArrayList<>();
        for (int i = 1; i <=n+1 ; i++) {
            ArrayList<pair_network_delay> temp=new ArrayList<>();
            adj.add(temp);
        }
        for (int i = 0; i <edge.length ; i++) {
            adj.get(edge[i][0]).add(new pair_network_delay(edge[i][1],edge[i][2]));
        }
       Stack<Integer> stk=new Stack<>();
        boolean vis[]=new boolean[n+1];
        for (int i = 1; i <=n ; i++) {
            if(vis[i]==false){
                topoSort(i,vis,adj,stk);
            }
        }
   int dist[]=new int[n+1];
        for (int i = 1; i <=n; i++) {
            dist[i]=(int)1e9;
        }

        dist[src]=0;
     while (!stk.isEmpty()){
         int node=stk.peek();
         stk.pop();
         for (int i = 0; i <adj.get(node).size() ; i++) {
             int vi=adj.get(node).get(i).v;
             int weight=adj.get(node).get(i).weight;

             if(dist[node]+weight<dist[vi]){
                 dist[vi]=dist[node]+weight;
             }
         }
     }
int maxi=Integer.MIN_VALUE;
        for (int i = 1; i <=n ; i++) {
        if(dist[i]==1e9) return -1;
            maxi=Math.max(maxi,dist[i]);
        }

        return maxi;
        }



    public static void main(String[] args) {
//  int [][] times = {{2,1,1},{2,3,1},{3,4,1}};
  int [][] times = {{1,2,1}};
  int n = 2, k = 1;
  int ans=networkDelayTime(times,n,k);
        System.out.println(ans);
    }
}
