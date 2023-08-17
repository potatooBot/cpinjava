package Algorithm.SDE_QUESTIONS.Possible_Path_Between_Two_Nodes;

import java.util.ArrayList;

public class Possible_Path_Between_Two_Nodes {
    public static boolean  dfs(int v,ArrayList<ArrayList<Integer>> adj,int source,int destination,int maxi[]){

        if(source==destination) {
            maxi[0]++;
            return true;
        }

        for (int it:adj.get(source)
             ) {
            dfs(v,adj,it,destination,maxi);

            }

        return false;
    }
    static    public int countPaths(int V, ArrayList<ArrayList<Integer>> adj, int source,
                                    int destination) {
     if(source==destination) return 1;
        int maxi[]=new int[1];
        for (int it: adj.get(source)) {
          dfs(V, adj,it, destination, maxi);

        }

     return maxi[0];   // Code here
    }
    public static void main(String[] args) {
        int V = 5, E = 7;
        int edges[][]={
                {0, 1},
        {0, 2},
        {0, 4},
        {1, 3},
        {1, 4},
        {2, 4},
        {3, 2}};

        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for (int i = 0; i <V ; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < edges.length ; i++) {
            adj.get(edges[i][0]).add(edges[i][1]);
        }
        int ans=countPaths(V,adj,0,4);
        System.out.println(ans);
    }
}
