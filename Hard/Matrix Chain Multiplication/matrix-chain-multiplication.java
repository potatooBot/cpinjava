//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String input_line[] = in.readLine().trim().split("\\s+");
            int arr[]= new int[N];
            for(int i = 0; i < N; i++)
                arr[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            System.out.println(ob.matrixMultiplication(N, arr));
        }
    }
}

// } Driver Code Ends




//User function Template for Java

class Solution{
        public static int getNoOfOperation(int i,int j,int arr[],int dp[][]){
if(i==j) return 0;
int mini=(int) Math.pow(10,9);
if(dp[i][j]!=-1) return dp[i][j];
        for (int k = i; k <j ; k++) {

            int steps= arr[i-1]*arr[k]*arr[j] +getNoOfOperation(i,k,arr,dp)  +getNoOfOperation(k+1,j,arr,dp);
            mini=Math.min(mini,steps);
        }
        dp[i][j]=mini;
        return mini;
    }
    static int matrixMultiplication(int N, int arr[])
    {
        // code here
        int dp[][]=new int[N][N];
        for (int [] rows:
             dp) {
            Arrays.fill(rows,-1);
        }
        int i=1;
        int j=N-1;
        return getNoOfOperation(i,j,arr,dp);
    }
}