//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            
            int n = Integer.parseInt(S[0]);
            int m = Integer.parseInt(S[1]);
            
            int [][] grid = new int[n][m];
            for(int i=0; i<n; i++)
            {
                String S1[] = read.readLine().split(" ");
                for(int j=0; j<m; j++)
                {
                    grid[i][j] = Integer.parseInt(S1[j]);
                }
            }

            Solution ob = new Solution();
            System.out.println(ob.uniquePaths(n,m,grid));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    public static int getWays(int row,int col,int grid[][],int dp[][]){
        if(row<0||col<0||grid[row][col]==0) return 0;
        if(row==0&&col==0) return 1;
        int mod=(int)Math.pow(10,9)+7;
        
        if(dp[row][col]!=-1) return dp[row][col];
        
        int up=getWays(row-1,col,grid,dp);
        int left=getWays(row,col-1,grid,dp);
        
        
        return dp[row][col]=(up+left)%mod;
    }
    static int uniquePaths(int n, int m, int[][] grid) {
       int dp[][]=new int[n][m];
       
       for(int rows[]:dp){
          Arrays.fill(rows,-1);
       }
      return getWays(n-1,m-1,grid,dp);
    }
};