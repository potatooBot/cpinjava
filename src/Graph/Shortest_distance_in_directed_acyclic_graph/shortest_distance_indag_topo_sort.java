package Graph.Shortest_distance_in_directed_acyclic_graph;
import java.util.*;
class pair{
    int v,weight;
    public pair(int v,int weight){
this.v=v;
this.weight=weight;
    }

}
public class shortest_distance_indag_topo_sort {
    public static void topoSort(int node,ArrayList <ArrayList<pair>> adj,int V,boolean vis[],Stack <Integer> stk){

vis[node]=true;
//
//        for (int i = 0; i <adj.get(node).size() ; i++) {
//            int vi=adj.get(node).get(i).v;
//            if (vis[vi]==false) {
//                topoSort(vi,adj,V,vis,stk);
//            }
//        }
        for (pair it: adj.get(node)
             ) {
            if (vis[it.v]==false)
            {
                topoSort(it.v,adj,V,vis,stk);
            }
        }
        stk.add(node);
    }
    public static int[] shortestPath(int N,int M, int[][] edges) {
        //Code here
Stack <Integer> stk=new Stack<>();
ArrayList <ArrayList<pair>> adj=new ArrayList<>();
        for (int i = 0; i <N ; i++) {
            ArrayList <pair> temp=new ArrayList<>();
            adj.add(temp);
        }
        for (int i = 0; i <M ; i++) {
            adj.get(edges[i][0]).add(new pair(edges[i][1],edges[i][2]));
        }
        boolean vis[]=new boolean[N];
        for (int i = 0; i <N ; i++) {
            if(vis[i]==false){
                topoSort(i,adj,N,vis,stk);
            }
        }

        int dist[]=new int[N];
        for (int i = 0; i < N; i++) {
            dist[i] = (int)(1e9);
        }
dist[0]=0;
        while (!stk.isEmpty()){
            int node=stk.peek();
            stk.pop();
            for (int i = 0; i <adj.get(node).size() ; i++) {
               int vi=adj.get(node).get(i).v;
               int wt=adj.get(node).get(i).weight;
               if(dist[node] +wt <dist[vi]){
                   dist[vi]=dist[node]+wt;
               }

            }
        }

        for (int i = 0; i <N ; i++) {
            if(dist[i]==(int)Math.pow(10,9)) {
                dist[i]=-1;
            }
        }

return dist;
    }
    public static void main(String[] args) {
        int n = 6, m= 7;
        int [][]edge={{0,1,2},{0,4,1},{4,5,4}
,{4,2,2},{1,2,3},{2,3,6},{5,3,1}};
int ans[]=shortestPath(n,m,edge);
        for (int i = 0; i < ans.length ; i++) {
            System.out.println(ans[i]);
        }
    }
}
