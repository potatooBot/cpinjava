package Graph.DFS;

import java.util.ArrayList;
import java.util.Arrays;

public class flowring_plant_with_no_adjance {
    public static void dfs(ArrayList<ArrayList<Integer>> adj,int color[],int node,int clr){


        color[node]=clr;
        if(clr==4) clr=1;
        for (Integer it:
                adj.get(node)) {
            if(color[it]==0) dfs(adj,color,it,clr+1);
        if(color[it]==color[node]){
            dfs(adj,color,it,clr);
        }
        }

    }
    static   public int[] gardenNoAdj(int n, int[][] paths) {

        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for (int i = 1; i <=n+1; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < paths.length; i++) {
            adj.get(paths[i][0]).add(paths[i][1]);
            adj.get(paths[i][1]).add(paths[i][0]);
        }
     //   System.out.println(adj);
        int color[]=new int[n+1];
        Arrays.fill(color,0);
        for (int i=1;i<=n;i++)
        {
            if (color[i]==0){
                dfs(adj,color,i,1);
            }
        }
        int ans[]=new int[n];
        for (int i = 0; i <n ; i++) {
            ans[i]=color[i+1];
        }
    return ans;
    }
    public static void main(String[] args) {
        int  n = 3;
        int [][]paths = {{1,2},{2,3},{3,1}};
int ans[]=gardenNoAdj(n,paths);
        for (int i = 0; i < ans.length ; i++) {
            System.out.println(ans[i]);
        }
    }
}
