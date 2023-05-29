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
            String[] str = br.readLine().trim().split(" ");
            int N = Integer.parseInt(str[0]);
            int M = Integer.parseInt(str[1]);
            int[][] matrix = new int[N][M];
            for(int i=0; i<N; i++)
            {
                String[] s = br.readLine().trim().split(" ");
                for(int j=0; j<M; j++)
                    matrix[i][j] = Integer.parseInt(s[j]);
            }
            
            Solution obj = new Solution();
            System.out.println(obj.closedIslands(matrix, N, M));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
        public static void dfs(int [][] mat,boolean vis[][],int row,int col){
        vis[row][col]=true;

        int delrow[]={-1,0,1,0};
        int delcol[]={0,1,0,-1};
        for (int i = 0; i <4 ; i++) {
            int neiRow=row+delrow[i];
            int neiCol=col+delcol[i];
if(neiRow>=0&&neiCol>=0&&neiRow< mat.length&&neiCol<mat[0].length&&vis[neiRow][neiCol]==false&&mat[neiRow][neiCol]==1){
    dfs(mat,vis,neiRow,neiCol);
}
        }
    }
    public int closedIslands(int[][] matrix, int n, int m)
    {
               boolean vis[][]=new boolean[n][m];

        for (int i = 0; i <n ; i++) {
            if(vis[i][0]==false&&matrix[i][0]==1){
                dfs(matrix,vis,i,0);
            }
            if(vis[i][m-1]==false&&matrix[i][m-1]==1){
                dfs(matrix,vis,i,m-1);
            }
        }

        for (int j = 0; j <m ; j++) {
            if(vis[0][j]==false&&matrix[0][j]==1){
                dfs(matrix,vis,0,j);
            }
            if(vis[n-1][j]==false&&matrix[n-1][j]==1){
                dfs(matrix,vis,n-1,j);
            }
        }
        int count=0;
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                if(vis[i][j]==false&&matrix[i][j]==1){
                    count++;
                dfs(matrix,vis,i,j);
                }
            }
        }
        return count;// Code here
    }
}