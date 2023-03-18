package Graph.Dijkstra_Algorithm;
import java.util.*;
class pair_dij{
    int node,dist;
    public pair_dij(int node,int dist ){
        this.node=node;
        this.dist=dist;
    }
}
public class print_shortest_path {
    static public List<Integer> shortestPath(int n, int m, int edges[][]) {
        // code here
int src=1;
int dest=n;
        ArrayList <ArrayList<pair_dij>> adj=new ArrayList<>();
        for (int i = 0; i <=n ; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i <m ; i++) {
            adj.get(edges[i][0]).add(new pair_dij(edges[i][1],edges[i][2]));
            adj.get(edges[i][1]).add(new pair_dij(edges[i][0],edges[i][2]));
        }

        int distance[]=new int[n+1];
        int parent[]=new int[n+1];
        for (int i = 1; i <=n ; i++) {
            distance[i]=(int)1e9;
            parent[i]=i;
        }
PriorityQueue <pair_dij> pq=new PriorityQueue<>((x,y)->x.dist-y.dist);
pq.add(new pair_dij(1,0));
distance[src]=0;
while (!pq.isEmpty())
{
    int node=pq.peek().node;
    int dis=pq.peek().dist;
    pq.remove();
    for (pair_dij it:adj.get(node)) {
        int adjNode=it.node;
        int edjWt=it.dist;
    if(edjWt+dis<distance[adjNode]){
distance[adjNode]=edjWt+dis;
    parent[adjNode]=node;
        pq.add(new pair_dij(adjNode,dis+edjWt));
    }
    }
}
List <Integer> path=new ArrayList<>();

if(distance[n]==(int)1e9){
    path.add(-1);
    return path;
        }
int node=n;
while (parent[node]!=node){
    path.add(node);
    node=parent[node];
}
path.add(src);
Collections.reverse(path);
return path;
    }
    public static void main(String[] args) {
        int n = 5, m= 6;
        int [][]edges = {{1,2,2}, {2,5,5}, {2,3,4}, {1,4,1},{4,3,3},{3,5,1}};
List <Integer> path=shortestPath(n,m,edges);
        System.out.println(path);
    }
}
