//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            
            int M = Integer.parseInt(S[0]);
            int N = Integer.parseInt(S[1]);
            int X = Integer.parseInt(S[2]);

            Solution ob = new Solution();
            System.out.println(ob.noOfWays(M,N,X));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
public static  long getWays(int n,int k,int target,long dp[][]){
         int mod = 1000000007;
       if(n == 0 && target == 0 ) return 1;
        if(n == 0 || target <= 0 ) return 0;
    
    
    if(dp[n][target]!=-1) return dp[n][target];
    dp[n][target]=0;
for(int i=1;i<=k;i++){
 dp[n][target]=(dp[n][target]+getWays(n-1,k,target-i,dp));
}
return dp[n][target];
}
    static long noOfWays(int k , int n , int target) {
        long dp[][]=new long [n+1][target+1];
       for(long rows[]:dp){
           
       Arrays.fill(rows,-1);

       }
       int mod = 1000000007;
      return getWays(n,k,target,dp);
    }
};