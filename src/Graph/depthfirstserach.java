package Graph;

import java.util.ArrayList;

public class depthfirstserach {

    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
static void printgraph(ArrayList <ArrayList<Integer>> adj){
    for (int i = 1; i <adj.size() ; i++) {
        System.out.println("Adjacency list at vertex "+i);
        for (int j = 0; j <adj.get(i).size() ; j++) {
            System.out.print(adj.get(i).get(j)+" ");
        }
        System.out.println();
    }
}
public static void  dfs(int node,boolean []visited,ArrayList<ArrayList<Integer>> adj,ArrayList <Integer>storedfs){
        visited[node]=true;
        storedfs.add(node);
    for (Integer it:
      adj.get(node)   ) {
        if(visited[it]==false){
            dfs(it,visited,adj,storedfs);
        }
    }
}
public static ArrayList<Integer> dfsofGraph(int v, ArrayList<ArrayList<Integer>> adj){
ArrayList <Integer> storedfs=new ArrayList<>();
boolean visited[] =new boolean [v+1];
    for (int i = 1; i <=v ; i++) {
        if(visited[i]==false){
            dfs(i,visited,adj,storedfs);
        }
    }
   return storedfs;
}

    public static void main(String[] args) {
        ArrayList <ArrayList<Integer>> adj=new ArrayList <ArrayList<Integer>>();
        int V=7;
ArrayList <Integer> storedfs=new ArrayList<>();
        for (int i = 0; i <= V; i++)
            adj.add(new ArrayList<Integer>());
        addEdge(adj, 1, 2);
        addEdge(adj, 2, 4);
        addEdge(adj, 2, 7);
        addEdge(adj, 4, 6);
        addEdge(adj, 6, 7);
        addEdge(adj, 3, 5);
storedfs=dfsofGraph(V,adj);
        System.out.println(storedfs);
    }
}
