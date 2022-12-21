package Graph;

import java.util.ArrayList;
import java.util.Arrays;

public class bipartite_graph_using_dfs {
    public static void insert(ArrayList <ArrayList<Integer>>adj, int v, int u){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    public static void printGraph(ArrayList<ArrayList<Integer>> adj){
        for (int i = 0; i <adj.size() ; i++) {
            System.out.println("The element of verted "+i);
            for (int j = 0; j <adj.get(i).size() ; j++) {
                System.out.println(adj.get(i).get(j));
            }
        }
    }

    public static boolean checkforBipartite(int node,int col,int colours[],ArrayList<ArrayList<Integer>>adj){
        colours[node]=col;

        for (Integer it :adj.get(node)){

            if(colours[it]==-1){

                if(checkforBipartite(it,1-col,colours,adj)==false){

                    return false;

                }


            }
            else if(colours[it]==col) {return false;}
        }

        return true;

    }
    public static boolean isBipartite(int V, ArrayList<ArrayList<Integer>>adj)
    {
        // Code here

        int colours[]=new int[V];
        Arrays.fill(colours,-1);
        for(int i=0;i<V;i++){
            if(colours[i]==-1){
                if(checkforBipartite(i,0,colours,adj)==false) return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        ArrayList <ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>();
        int v=9;
        for (int i = 0; i <v ; i++) {
            adj.add(new ArrayList<>());
        }
        insert(adj,1,2);
        insert(adj,2,3);
        insert(adj,2,6);
        insert(adj,3,4);
        insert(adj,4,5);
        insert(adj,4,7);
        insert(adj,5,6);
        insert(adj,7,8);
//printGraph(adj);
     boolean check =isBipartite(v,adj);
        System.out.println(check);
    }
}
