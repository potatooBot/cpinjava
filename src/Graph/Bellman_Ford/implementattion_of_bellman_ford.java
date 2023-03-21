package Graph.Bellman_Ford;

import java.util.ArrayList;
import java.util.*;
class pair{
    int node,distance;
    public pair(int node,int distance){
        this.node=node;
        this.distance=distance;
    }
}
public class implementattion_of_bellman_ford {
    static int[] bellman_ford(int V, ArrayList<ArrayList<Integer>> edges, int src) {
     int dist[]=new int[V];
     Arrays.fill(dist,(int)1e8);
     dist[src]=0;
        for (int i = 0; i <V-1 ; i++) {
            for (ArrayList <Integer>it: edges) {
int u=it.get(0);
int v=it.get(1);
int edWt=it.get(2);
if(dist[u]!=(int)1e8&&edWt +dist[u]<dist[v]){
    dist[v]=edWt+dist[u];
}
            }
        }

        for (ArrayList <Integer> it:
             edges) {
            int u=it.get(0);
            int v=it.get(1);
            int edWt=it.get(2);
        if(edWt+dist[u]<dist[v]){
        int temp[]=new int[1];
        temp[0]=-1;
        return temp;
        }
        }
     return dist;   // Write your code here

    }
    public static void main(String[] args) {

        int V = 6;
        int S = 0;
        ArrayList<ArrayList<Integer>> edges = new ArrayList<>() {
            {
                add(new ArrayList<Integer>(Arrays.asList(3, 2, 6)));
                add(new ArrayList<Integer>(Arrays.asList(5, 3, 1)));
                add(new ArrayList<Integer>(Arrays.asList(0, 1, 5)));
                add(new ArrayList<Integer>(Arrays.asList(1, 5, -3)));
                add(new ArrayList<Integer>(Arrays.asList(1, 2, -2)));
                add(new ArrayList<Integer>(Arrays.asList(3, 4, -2)));
                add(new ArrayList<Integer>(Arrays.asList(2, 4, 3)));
            }
        };
       int ans[]=bellman_ford(V,edges,S);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}
