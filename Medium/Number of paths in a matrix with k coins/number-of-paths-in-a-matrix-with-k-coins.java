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

    

    public long fun(int N, int K, int [][] arr, int i, int j, long [][][] dp){

        if(i >= N || j >= N) return 0;

        if(K < 0) return 0;

        if( i == N-1 && j== N-1){

            // System.out.println("value is "+ K + " i and j is "+ i + " "+ j);

            if( K == arr[i][j]) return 1;

            return 0;

        } 

        if(dp[i][j][K] !=  0) return dp[i][j][K];

        long down = fun(N, K - arr[i][j], arr, i+1, j, dp);

        long right = fun(N, K - arr[i][j], arr, i, j+1, dp);

        

        return dp[i][j][K] = down + right;

        

    }

    

    

    long numberOfPath(int N, int K, int [][]arr) {

        

        long  [][][] dp = new long[N][N][K+1];

        // for(int i=0; i<N; i++){

        //     for(int j=0; j<N; j++){

        //         for(int k=0; k<K; k++) dp[i][j][k] = -;

        //     }

        // }

        return fun(N, K, arr, 0, 0, dp);

    }

}