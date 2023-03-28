package Graph.Kosaraju_SCC;

import java.util.ArrayList;
import java.util.Stack;

public class impllementing_kosaraju {
    public static void dfs(boolean vis[],ArrayList<ArrayList<Integer>> adj,Stack<Integer> stk,int node){
        vis[node]=true;
        for (Integer it :
             adj.get(node)) {
            if(vis[it]==false)
        dfs(vis,adj,stk,it);
        }
        stk.push(node);
    }
    private static void dfsLast(boolean visLast[],ArrayList<ArrayList<Integer>> adjTranspose,int node){
        visLast[node]=true;

        for (Integer it:
             adjTranspose.get(node)) {
            if(visLast[it]==false){
                dfsLast(visLast,adjTranspose,it);
            }
        }

    }
    static  public int kosaraju(int V, ArrayList<ArrayList<Integer>> adj)
    {



        //code here
// !Store vertices in Sorted manner according to finishing ime
        Stack<Integer> stk=new Stack<>();
        boolean vis[]=new boolean[V];
        for (int i = 0; i <V ; i++) {
            if(vis[i]==false){
                dfs(vis,adj,stk,i);
            }
        }

        //! Reverse the graph
        ArrayList<ArrayList<Integer>> adjTranpose=new ArrayList<>();
        for (int i = 0; i <V ; i++) {
            adjTranpose.add(new ArrayList<>());
        }
        for (int i = 0; i <V ; i++) {
            for (Integer it:
                 adj.get(i)) {
                adjTranpose.get(it).add(i);
            }
        }
//! Find again Dfs
        int sccCount=0;
boolean visLast[]=new boolean[V];
while (stk.isEmpty()==false){
    int node=stk.peek();
    stk.pop();

    if(visLast[node]==false)
    {
        sccCount++;
        dfsLast(visLast,adjTranpose,node);
    }
}
        return sccCount;

    }
    public static void main(String[] args) {
        int n = 5;
//        int[][] edges = {
//                {1, 0}, {0, 2},
//                {2, 1}, {0, 3},
//                {3, 4}
//        };

        int[][] edges = {
                {0, 2}, {1, 2},
                {2, 1}, {0, 3},
                {3, 4}
        };

        ArrayList <ArrayList<Integer>> adj=new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < n ; i++) {
            adj.get(edges[i][0]).add(edges[i][1]);
        }
        int ans=kosaraju(n,adj);
        System.out.println(ans);
    }
}
