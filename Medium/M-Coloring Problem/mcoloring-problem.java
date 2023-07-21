//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tc = scan.nextInt();

        while (tc-- > 0) {
            int N = scan.nextInt();
            int M = scan.nextInt();
            int E = scan.nextInt();

            boolean graph[][] = new boolean[N][N];

            for (int i = 0; i < E; i++) {
                int u = scan.nextInt() - 1;
                int v = scan.nextInt() - 1;
                graph[u][v] = true;
                graph[v][u] = true;
            }

            System.out.println(new solve().graphColoring(graph, M, N) ? 1 : 0);
        }
    }
}

// } Driver Code Ends


class solve {
    public static boolean isSafe(boolean graph[][],int color[],int node,int n,int col){
        
        for(int i=0;i<n;i++){
            
            
            if(graph[node][i]==true&&color[i]==col){
                
                return false;
            }
            
        }
        return true;
    }
    public static boolean dfs(boolean graph[][],int color[],int node,int n,int m){
        if(node==n){
            return true;
        }
        
        for(int i=1;i<=m;i++){
           
           if(isSafe(graph,color,node,n,i)==true)
           {
               color[node]=i;
               
               if(dfs(graph,color,node+1,n,m)==true){
                   return true;
               }
           }
           color[node]=0;
           
            
        }
        
        
        
        return false;
        
        
    }
    // Function to determine if graph can be coloured with at most M colours
    // such
    // that no two adjacent vertices of graph are coloured with same colour.
    public boolean graphColoring(boolean graph[][], int m, int n) {
        
        
        int color[]=new int[n];
        
    return dfs(graph,color,0,n,m);
    }
}