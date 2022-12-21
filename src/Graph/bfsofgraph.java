package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class bfsofgraph {
    static void addEdge(ArrayList<ArrayList <Integer>> adj,int u,int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    public static void printgrGraph(ArrayList <ArrayList<Integer>> adj){
        for (int i = 0; i < adj.size() ; i++) {
            System.out.println("vertex "+i+" is connected with ");
            for (int j = 0; j < adj.get(i).size() ; j++) {
                System.out.println(adj.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
public static void breadthfirstsearch(int V,ArrayList <ArrayList<Integer>> adj){

//        Made an arraylist to add bfs of graph
        ArrayList <Integer> bfs= new ArrayList<>();

    // Mark all the vertices as not visited(By default
    // set as false)
        boolean visited[]=new boolean[V];
    for (int i = 0; i <V ; i++) {
        Queue<Integer> q = new LinkedList<>();
if(visited[i]==false){

    // Mark the current node as visited and enqueue it
    q.add(i);

    visited[i]=true;
}
while (!q.isEmpty()) {
    // Dequeue a vertex from queue and print it
    Integer node = q.poll();
    bfs.add(node);
    // Get all adjacent vertices of the dequeued vertex s
    // If a adjacent has not been visited, then mark it
    // visited and enqueue it

    for (Integer it :
            adj.get(node)) {
if(visited[it]==false){
    visited[it]=true;
    q.add(it);
}
    }
}
    }
    System.out.println(bfs);
}
    public static void main(String[] args) {
        ArrayList <ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>();
        int V=6;
        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<Integer>());




        addEdge(adj, 0, 1);
        addEdge(adj, 0, 3);
        addEdge(adj, 0, 4);
        addEdge(adj, 1, 2);
        addEdge(adj, 3, 5);
        addEdge(adj, 4, 5);
//        printgrGraph(adj);
    breadthfirstsearch(V,adj);
    }
}
