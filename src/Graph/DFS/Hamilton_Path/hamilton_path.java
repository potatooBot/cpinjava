package Graph.DFS.Hamilton_Path;

import java.util.ArrayList;

public class hamilton_path {
    public static boolean dfs(int node,int V,ArrayList<ArrayList<Integer>> adj,boolean vis[],int count){
        if (count==V) {
            return true;
        }
        vis[node]=true;


        for (int it:
             adj.get(node)) {
            if(vis[it]==false){
                if(dfs(it,V,adj,vis,count+1)==true){
                    return true;
                }
            }

        }
        vis[node]=false;
        return false;
    }
    static   boolean check(int N, int M, ArrayList<ArrayList<Integer>> edges)
    {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for (int i = 1; i <=N ; i++) {
            adj.add(new ArrayList<>());
        }
        for (ArrayList<Integer> list :edges) {
         adj.get(list.get(0)).add(list.get(1));
         adj.get(list.get(1)).add(list.get(0));
        }
boolean vis[]=new boolean[N+1];

        for (int i = 1; i <=N ; i++) {
            if(vis[i]==false){
                if(dfs(i,N,adj,vis,1)==true){
                    return true;
                }
            }
        }


     return false;   // code here
    }

    public static void main(String[] args) {
        int N = 4, M = 4;
        int edges[][]= { {1,2}, {2,3}, {3,4}, {2,4} };

//      int N = 4, M = 3;
//        int edges[][] = { {1,2}, {2,3}, {2,4}};
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for (int i = 0; i <N+1 ; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < M ; i++) {
            adj.get(i).add(edges[i][0]);
            adj.get(i).add(edges[i][1]);
        }
        boolean ans=check(N,M,adj);
        System.out.println(ans);
    }
}
