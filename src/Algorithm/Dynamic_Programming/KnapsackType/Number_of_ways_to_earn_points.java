package Algorithm.Dynamic_Programming.KnapsackType;

import java.util.ArrayList;
import java.util.Arrays;

public class Number_of_ways_to_earn_points {
    final static int mod = 1_000_000_007;
    public static int getNumberofWays(int [][]types,int dp[][],int idx,int target){

        if(target==0) return 1;
        if(idx>=types.length) return 0;
        if(dp[idx][target]!=-1) {
            return dp[idx][target];
        }
        int count=types[idx][0];
        int val=types[idx][1];
        int ans=0;
        for (int i = 0; i <=count ; i++) {
            if(target-val*i>=0) {
                ans=(ans+getNumberofWays(types,dp,idx+1,target-val*i))%mod;
            }
        }



        return dp[idx][target]=ans;
    }

    static  public int waysToReachTarget(int target, int[][] types) {

        int n=types.length;
       int dp[][]=new int[n+1][target+1];
        for (int rows[]:
             dp) {
            Arrays.fill(rows,-1);
        }
        return getNumberofWays(types,dp,0,target);
    }
    public static void main(String[] args) {
       int target = 6;int [][] types = {{6,1},{3,2},{2,3}};
int ans=waysToReachTarget(target,types);
        System.out.println(ans);
    }

}
