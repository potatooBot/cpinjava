package Graph;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Detect_Cyclei_n_Undirected_Graph_using_BFS {
    public static void insert(ArrayList<ArrayList<Integer>> adj,int u,int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);

    }

    public static void printGraph(ArrayList<ArrayList<Integer>> adj){
        for (int i = 0; i <adj.size() ; i++) {
            System.out.println("The element of vertex "+i);
            for (int j = 0; j <adj.get(i).size() ; j++) {
                System.out.println(adj.get(i).get(j));
            }
        }
    }


    public static void main(String[] args) {
        int v=5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i <v ; i++) {
            adj.add(new ArrayList<Integer>());
        }


        insert(adj,0,1);
        insert(adj,0,2);
        insert(adj,2,3);
        insert(adj,1,3);
        insert(adj,2,4);
printGraph(adj);
        solution obj=new solution();
        boolean ans = obj.isCycle(v,adj);
        if(ans)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}

class Node{
    int first;
    int second;
    public Node(int first,int second){
        this.first=first;
        this.second=second;
    }
}

class solution{

    static boolean checkForCycle(ArrayList <ArrayList<Integer>> adj,int s,boolean vis[]){
        Queue <Node> q=new LinkedList<>();
        q.add(new Node(s,-1));
        vis[s]=true;
        while (!q.isEmpty()){
            int node=q.peek().first;
            int par=q.peek().second;
            q.remove();

            for (Integer it :adj.get(node)){
                if(vis[it]==false){
                    q.add(new Node(it,node));
            vis[it]=true;
                }

                else if(par !=it) return true;
            }
        }
        return false;
    }
    public static boolean isCycle(int v,ArrayList <ArrayList<Integer>> adj){
        boolean vis[]=new boolean[v+1];
        Arrays.fill(vis,false);
        for (int i = 0; i <v ; i++) {
            if(vis[i]==false){
                if(checkForCycle(adj,i,vis)){
                    return true;
                }
            }

        }
        return false;
    }
}
