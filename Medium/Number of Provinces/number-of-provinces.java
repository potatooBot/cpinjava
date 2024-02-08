//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int V = Integer.parseInt(read.readLine());
            
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            
            for(int i=0; i<V; i++)
            {
                String S[] = read.readLine().split(" ");
                ArrayList<Integer> temp = new ArrayList<>();
                for(int j=0; j<V; j++)
                    temp.add(Integer.parseInt(S[j]));
                adj.add(temp);
            }

            Solution ob = new Solution();
            System.out.println(ob.numProvinces(adj,V));
        }
    }
}
// } Driver Code Ends




//User function Template for Java

class Solution {
    public static void dfs(int node,boolean vis[],ArrayList<ArrayList<Integer>>adj){
        vis[node]=true;
    for (Integer it:adj.get(node)
         ) {
        if(vis[it]==false){
            dfs(it,vis,adj);
        }
    }
}
    static int numProvinces(ArrayList<ArrayList<Integer>> adj, int v) {
        // code here
        
        
        
        ArrayList <ArrayList<Integer>> adjl =new ArrayList<ArrayList<Integer>>();
           for (int i = 0; i <v ; i++) {
        adjl.add(new ArrayList<Integer>());
        }
        
        for(int i=0;i<v;i++){
            for(int j=0;j<v;j++){
            if(adj.get(i).get(j)==1&&i!=j){
                adjl.get(i).add(j);
                adjl.get(j).add(i);
            }
        } 
        }
          boolean vis[] =new boolean[v];
        Arrays.fill(vis,false);
        int count=0;
        for (int i = 0; i <v ; i++) {
            if(vis[i]==false){
                count++;
                dfs(i,vis,adjl);
            }
        }
        return count;
    }
};