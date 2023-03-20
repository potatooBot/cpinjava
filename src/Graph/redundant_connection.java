package Graph;

import java.util.*;

public class redundant_connection {
    public static boolean dfs(int node,boolean vis[],ArrayList<ArrayList<Integer>> adj,ArrayList <ArrayList<Integer>> ds,int parent){
        vis[node]=true;

        for (Integer it:
           adj.get(node)  ) {
            if(vis[it]==false){
                dfs(it,vis,adj,ds,node);


            }
            else if(parent!=it){
                ArrayList <Integer> list=new ArrayList<>();
                list.add(it);
                list.add(node);
                ds.add(new ArrayList<>(list));

            }
        }

return false;
    }
  static   public int[] findRedundantConnection(int[][] edges) {
int ans[]=new int[2];
ArrayList <ArrayList<Integer>> adj=new ArrayList<>();
int n= edges[edges.length-1][1];
      System.out.println(n);
      for (int i = 1; i <=n+1 ; i++) {
adj.add(new ArrayList<Integer>());
      }

      int m= edges.length;
      for (int i = 0; i <m ; i++) {
          adj.get(edges[i][0]).add(edges[i][1]);
          adj.get(edges[i][1]).add(edges[i][0]);
      }
      ArrayList <ArrayList<Integer>> ds=new ArrayList<>();

      for (int i = 1; i <=n ; i++) {
          boolean vis[]=new boolean[n+1];
         if(vis[i]==false){

             dfs(i,vis,adj,ds,-1);
         }
      }
      System.out.println(ds);

     ans[0]=ds.get(0).get(0);
     ans[1]=ds.get(0).get(1);
 return ans;

    }
    public static void main(String[] args) {
        int [][] edges1 = {{1,2},
                        {1,3},
                        {2,3}};

        int [][] edges2={{1,2},{2,3},{3,4},{1,4},{1,5}};
        int [][] edges3={{0,1} , {0,2} , {0,3} , {1,2} , {1,3}};
int ans[]=findRedundantConnection(edges1);
        for (int i = 0; i < 2 ; i++) {
            System.out.println(ans[i]);
        }
    }

}
