//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader in =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while (t-- > 0) {
            int K = Integer.parseInt(in.readLine());
            int N = Integer.parseInt(in.readLine());
            String input_line[] = in.readLine().trim().split("\\s+");
            int A[] = new int[N];
            for (int i = 0; i < N; i++) A[i] = Integer.parseInt(input_line[i]);

            Solution ob = new Solution();
            System.out.println(ob.maxProfit(K, N, A));
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public static int getMax(int arr[],int dp[][][],int buy,int ind,int cap){
        if(ind==arr.length||cap==0){
            return 0;
        }
        
    if(dp[ind][buy][cap]!=-1)
        return dp[ind][buy][cap];
        
        
       int profit=0;
if(buy==0){
 profit=Math.max(0+getMax(arr,dp,0,ind+1,cap),-arr[ind] +getMax(arr,dp,1,ind+1,cap));
}
if(buy==1){
    profit=Math.max(0+getMax(arr,dp,1,ind+1,cap),arr[ind] +getMax(arr,dp,0,ind+1,cap-1));
}
return dp[ind][buy][cap]=profit;
    }
    static int maxProfit(int k, int n, int arr[]) {
        int dp[][][]=new int[n+1][2][k+1];
               for (int i = 0; i < n; i++) {
         for (int j = 0; j < 2; j++) {
            Arrays.fill(dp[i][j], -1);
         }
        }

        
        
        
        return getMax(arr,dp,0,0,k);
        
    }
}