//{ Driver Code Starts
//Initial Template for JAVA

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            
            String S[] = read.readLine().split(" ");
            
            int[] cost = new int[N];
            
            for(int i=0 ; i<N ; i++)
                cost[i] = Integer.parseInt(S[i]);

            Solution ob = new Solution();
            System.out.println(ob.minCostClimbingStairs(cost,N));
        }
    }
}
// } Driver Code Ends


//Back-end complete function Template for Java

class Solution {
      public static int getMinimumCost(int cost[],int dp[],int idx){
        if(idx==cost.length-1) return cost[idx];
       if(idx>cost.length-1) return 0;
        if(dp[idx]!=-1) return dp[idx];
        int jumpOne= getMinimumCost(cost,dp,idx+1) +cost[idx];
        int second=Integer.MAX_VALUE;

            second= getMinimumCost(cost,dp,idx+2) +cost[idx];

        return dp[idx]=Math.min(jumpOne,second);
    }
    static int minCostClimbingStairs(int[] cost , int N) {
int dp[]=new int[cost.length+1];
        Arrays.fill(dp,-1);
        int dp2[]=new int[cost.length+1];
        Arrays.fill(dp2,-1);


        return Math.min(getMinimumCost(cost,dp,0),getMinimumCost(cost,dp2,1));
    }
};