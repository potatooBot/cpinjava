//Time Complexity: O(V+E)+O(V) , where V = no. of nodes and E = no. of edges. There can be at most V components. So, another O(V) time complexity.

//Space Complexity: O(2N) + O(N) ~ O(2N): O(2N) for two visited arrays and O(N) for recursive stack space.



package Graph;

import java.util.*;

public class check_cycke_in_directed_graph_using_dfs {
    // Function to detect cycle in a directed graph.
    private boolean dfsCheck(int node,int vis[],int pathvis[],ArrayList<ArrayList<Integer>> adj){
        vis[node]=1;
        pathvis[node]=1;
        // traverse for adjacent nodes
        for(int it: adj.get(node)){
            if(vis[it]==0){
                if(dfsCheck(it,vis,pathvis,adj)==true) { return true;}
            }

            // if the node has been previously visited
            // but it has to be visited on the same path
            else if(pathvis[it]==1){
                return true;
            }

        }
        pathvis[node]=0;
        return false;
    }
    // Function to detect cycle in a directed graph.
    public boolean isCyclic(int v, ArrayList<ArrayList<Integer>> adj) {
        // code here
        int vis[]=new int[v];
        int pathvis[]=new int[v];


        for(int i=0;i<v;i++){
            if(vis[i]==0){
                if(dfsCheck(i,vis,pathvis,adj)==true) return true;
            }
        }
        return false;

    }
    public static void main(String[] args) {

    }
}
