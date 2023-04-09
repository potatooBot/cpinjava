package Graph.DFS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class all_ancestors_of_a_node_in_DAG {
    static  public void dfs(int node,int n,ArrayList<ArrayList<Integer>> adj,boolean vis[],List<List<Integer>> ans,List<Integer> ds){
        vis[node]=true;

        for (Integer it: adj.get(node)
             ) {
            if(vis[it]==false){
                ds.add(it);
                dfs(it,n,adj,vis,ans,ds);
            }
        }

    }

    static   public List<List<Integer>> getAncestors(int n, int[][] edges) {
        List<List<Integer>> ans=new ArrayList<>();
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < edges.length ; i++) {
           adj.get(edges[i][1]).add(edges[i][0]);
        }


        for (int i = 0; i <n ; i++) {
            boolean vis[]=new boolean[n];
            if (vis[i]==false){
                List<Integer> ds=new ArrayList<>();
                dfs(i,n,adj,vis,ans,ds);
                Collections.sort(ds);
                ans.add(new ArrayList<>(ds));
            }
        }
//        System.out.println(adj);
        return ans;
    }
    public static void main(String[] args) {
        int n = 8;int [][]edgeList = {{0,3},{0,4},{1,3},{2,4},{2,7},{3,5},{3,6},{3,7},{4,6}};

        List<List<Integer>> ans=getAncestors(n,edgeList);
        System.out.println(ans);
    }

}
