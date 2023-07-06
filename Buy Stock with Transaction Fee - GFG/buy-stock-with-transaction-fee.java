//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG{
    public static void main(String args[]) throws IOException{
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int N=sc.nextInt();
            long []prices=new long[N];
            for(int i=0;i<N;i++){
                prices[i]=sc.nextLong();
            }
            int fee=sc.nextInt();
            Solution obj=new Solution();
            long res=obj.maximumProfit(prices,N,fee);
            System.out.println(res);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    public long maximumProfit(long prices[], int N, int fee){
              int n=prices.length;
        if(n==0) return 0;
      long dp[][]=new long[n+1][2];

        for (int idx = n-1; idx >=0 ; idx--) {
            for (int buy = 0; buy <=1 ; buy++) {
                if(buy==0){ //We can buy Stock

                    dp[idx][buy]=Math.max(-prices[idx] + dp[idx+1][1], 0 + dp[idx+1][0]);
                }


                if(buy==1) { //We can sell stock

                    dp[idx][buy]=Math.max(prices[idx]+dp[idx+1][0]-fee ,0 + dp[idx+1][1]);
                }
            }
        }

        return dp[0][0];
    }
}