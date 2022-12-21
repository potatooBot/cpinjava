package Graph;

import java.util.ArrayList;
import java.util.Arrays;

public class cycle_detection_using_DFS {
public static void insert(ArrayList <ArrayList<Integer>>adj,int v,int u){
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

    public static boolean isCycle(ArrayList<ArrayList<Integer>>adj ,int v){
    boolean vis[]=new boolean[v];
        Arrays.fill(vis,false);
        for (int i = 0; i <v ; i++) {
            if (vis[i]==false){
if(checkCycle(i,-1,vis,adj)) return true;
            }
        }
        return false;
    }
    public static boolean checkCycle(int node,int parent,boolean[] vis,ArrayList<ArrayList<Integer>>adj){
        vis[node]=true;

        for (Integer it:
                adj.get(node)) {
            if(vis[it]==false){
                if(checkCycle(it,node,vis,adj)==true){
                    return  true;
                }
            }
            else if(it!=parent) return true;


        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList <ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>();
int v=5;
        for (int i = 0; i <v ; i++) {
adj.add(new ArrayList<>());
        }

       insert(adj,1,2);
       insert(adj,2,3);
       insert(adj,3,4);
       insert(adj,4,1);
printGraph(adj);
       boolean check=isCycle(adj,v);
        System.out.println(check);
}
}
