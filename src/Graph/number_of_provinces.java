package Graph;

import java.util.ArrayList;
import java.util.Arrays;

public class number_of_provinces {
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
public static void dfs(int node,boolean vis[],ArrayList<ArrayList<Integer>>adj){
        vis[node]=true;
    for (Integer it:adj.get(node)
         ) {
        if(vis[it]==false){
            dfs(it,vis,adj);
        }
    }
}

    public static int noOfProvinces(ArrayList<ArrayList<Integer>>adj,int v){
        boolean vis[] =new boolean[v];
        Arrays.fill(vis,false);
        int count=0;
        for (int i = 0; i <v ; i++) {
            if(vis[i]==false){
                count++;
                dfs(i,vis,adj);
            }
        }
        return count;
    }


    public static void main(String[] args) {
ArrayList <ArrayList<Integer>> adj =new ArrayList<ArrayList<Integer>>();
int v=9;
        for (int i = 0; i <v ; i++) {
        adj.add(new ArrayList<Integer>());
        }
        insert(adj,1,2);
        insert(adj,2,3);
        insert(adj,4,5);
        insert(adj,5,6);
        insert(adj,7,8);

        int noofProvinces=noOfProvinces(adj,v);
        System.out.println("No of provinces are "+noofProvinces);
    }
}
