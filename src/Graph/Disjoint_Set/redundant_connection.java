package Graph.Disjoint_Set;

import java.util.*;

public class redundant_connection {
  static   public int[] findRedundantConnection(int[][] edges) {

int ans[]=new int[2];
int n= edges.length;
DisjointSet ds=new DisjointSet(n);
      for (int i = 0; i <n ; i++) {
          if(ds.findUlp(edges[i][0])==ds.findUlp(edges[i][1])){
              ans[0]=edges[i][0];
              ans[1]=edges[i][1];
          return ans;
          }
          else {
              ds.unionBysize(edges[i][0],edges[i][1]);
          }

      }
      return ans;
    }
    public static void main(String[] args) {
        int [][] edges1 = {{1,2},
                        {1,3},
                        {2,3}};

        int [][] edges2={{1,2},{2,3},{3,4},{1,4},{1,5}};
        int [][] edges3={{0,1} , {0,2} , {0,3} , {1,2} , {1,3}};
int ans[]=findRedundantConnection(edges2);
        for (int i = 0; i < 2 ; i++) {
            System.out.println(ans[i]);
        }
    }

}
