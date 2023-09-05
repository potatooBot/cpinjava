//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int[][] grid = new int[N][M];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    grid[i][j] = sc.nextInt();
                }
            }
            Solution obj = new Solution();
            int res = obj.totalWays(N, M, grid);
            System.out.println(res);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public static int getAns(int grid[][],int dp[][],int row,int col){
        int mod=1000000007;
        if(row>=0&&col>=0&&grid[row][col]==1){
            return 0;
        }
            
        if(row==0&&col==0){
            return 1;
        }
        if(row<0||col<0) 
        return 0;
        
    
        
        if(dp[row][col]!=-1){
            return dp[row][col];
        }
        long up=getAns(grid,dp,row-1,col)%mod;
        long left=getAns(grid,dp,row,col-1)%mod;
        
return dp[row][col]=(int)(up+left)%mod;
        
    }
    public int totalWays(int n, int m, int grid[][]) {
     int dp[][]=new int[n][m];
     
     for(int rows[]:dp){
         Arrays.fill(rows,-1);
     }
     
     
     return getAns(grid,dp,n-1,m-1);
    }
}