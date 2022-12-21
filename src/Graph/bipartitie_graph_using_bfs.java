package Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class bipartitie_graph_using_bfs {
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
public static boolean checkBipartiteBfs(ArrayList<ArrayList<Integer>>adj ,int node,int colour[]){

    Queue <Integer> q=new LinkedList<>();
    q.add(node);
    colour[node]=1;
    while (!q.isEmpty()){
        Integer nd=q.poll();
        for (Integer it:
             adj.get(nd)) {
            if(colour[it]==-1){
                colour[it]=1-colour[nd];
                q.add(it);
            }
            else if(colour[it]==colour[nd]) return false;
        }
    }
    return true;
}
    public static boolean isBipartite(ArrayList<ArrayList<Integer>> adj,int v){
        int colours[]=new int[v];
        Arrays.fill(colours,-1);

        for (int i = 0; i <v ; i++) {
            if (colours[i]==-1){
                if(!checkBipartiteBfs(adj,i,colours)){
                    return false;
                }
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
        boolean check=isBipartite(adj,v);
        System.out.println(check);
    }
}
