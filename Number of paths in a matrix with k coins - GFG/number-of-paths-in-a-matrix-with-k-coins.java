//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            
            int  K = Integer.parseInt(read.readLine());
            int  N = Integer.parseInt(read.readLine());
            int arr[][] = new int[N][N];
            String input_line1[] = read.readLine().trim().split("\\s+");
            int c = 0;
            for(int i=0;i<N;i++){
                for(int j = 0;j<N;j++){
                    arr[i][j] = Integer.parseInt(input_line1[c]);
                    c++;
                }
            }
            Solution obj = new Solution();
            System.out.println(obj.numberOfPath(N, K, arr));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
     static long numberOfPath(int n, int k, int [][]arr) {
        // code here

        long dp[][][]=new long[n][n][k+1];
    return getCoinsNumber(n,k,arr,dp,0,0,0);
    }
    public static long getCoinsNumber(int n,int k,int arr[][],long dp[][][],int row,int col,int sum){
        if(row>=arr.length||col>=arr[0].length){
            return 0;
        }
        
        
   if(k<0) return 0;
            if(row==arr.length-1&&col==arr[0].length-1){
        if(arr[row][col]==k) return 1;
         return 0;
    }
        if(dp[row][col][k]!=0) return dp[row][col][k];
        
    long down= getCoinsNumber(n,k-arr[row][col],arr,dp,row+1,col,sum);
        long right= getCoinsNumber(n,k-arr[row][col],arr,dp,row,col+1,sum);
    return dp[row][col][k]=down+right;
    }
}