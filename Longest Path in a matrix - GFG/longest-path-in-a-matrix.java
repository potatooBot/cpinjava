//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] S1 = br.readLine().trim().split(" ");
            int n  = Integer.parseInt(S1[0]);
            int m = Integer.parseInt(S1[1]);
            int[][] matrix = new int[n][m];
            for(int i = 0; i < n; i++){
                String[] S2 = br.readLine().trim().split(" ");
                for(int j = 0; j < m; j++){
                    matrix[i][j] = Integer.parseInt(S2[j]);
                }
            }
            Solution obj = new Solution();
            int ans = obj.longestIncreasingPath(matrix);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
         public static int getLISinGrid(int grid[][],int dp[][],int row,int col){
        int reuslt=1;
        if(dp[row][col]!=-1) return dp[row][col];
        int mod=(int)Math.pow(10,9)+7;
        int dr[]={-1,0,1,0};
        int dc[]={0,1,0,-1};
        int maxi=1;
        for (int i = 0; i <4 ; i++) {
            int neiRow=row+dr[i];
            int neiCol=col+dc[i];

            if(neiRow>=0&&neiRow<grid.length&&neiCol>=0&&neiCol<grid[0].length&&grid[row][col]<grid[neiRow][neiCol])
            {
             maxi=Math.max(maxi,1+getLISinGrid(grid,dp,neiRow,neiCol));
            }
        }
        return dp[row][col]=maxi;
    }
    public int longestIncreasingPath(int[][] grid)
    {
            int n= grid.length;;
        int m= grid[0].length;;
        int dp[][]=new int[n][m];
        for (int rows[]:
                dp) {
            Arrays.fill(rows,-1);
        }
        int result=0;
int maxi=Integer.MIN_VALUE;
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                maxi=(int)Math.max(maxi,getLISinGrid(grid,dp,i,j));
            }
        }

        return (int)maxi;
    }
}