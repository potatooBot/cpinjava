package Graph.DFS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class node_with_hifghest_edge_score {
    public static void dfs(ArrayList<ArrayList<Integer>> adj,boolean vis[],int sum[],int node){
        vis[node]=true;

        for (Integer it:
             adj.get(node)) {
        if(vis[it]==false){
            sum[0]=sum[0]+it;
            dfs(adj,vis,sum,it);
        }
        }

    }
    static     public int edgeScore(int[] edges) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        int n=edges.length;
        for (int i = 0; i <n ; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i <n ; i++) {
            adj.get(edges[i]).add(i);
        }

        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        for (int i = 0; i <adj.size() ; i++) {
            sum=0;
            for (int j = 0; j <adj.get(i).size() ; j++) {
                sum=sum+adj.get(i).get(j);
            }
            map.put(i,sum);
        }
        int maxi=Integer.MIN_VALUE;
        for (Map.Entry<Integer,Integer> entry:
             map.entrySet()) {
            maxi=Math.max(maxi,entry.getValue());
        }
        int idx=Integer.MAX_VALUE;
        for (Map.Entry<Integer,Integer> entry:
             map.entrySet()) {
          if (entry.getValue()==maxi){
              idx=Math.min(idx,entry.getKey());
          }
        }
        System.out.println(idx);
        return idx;
    }
    public static void main(String[] args) {
        int [] edges = {2,0,0,2};
int ans=edgeScore(edges);
        System.out.println(ans);


    }
}
