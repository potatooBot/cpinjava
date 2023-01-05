package Algorithm.Dynamic_Programming.Memoization;

import java.util.Arrays;
import java.util.Map;

public class minimum_cost_to_climb_stairs {
    public static int getCost(int[] cost,int ind,int dp[]){
        if(ind==0) return cost[ind];
        if(ind<0) return 0;
        if(dp[ind]!=-1){
            return dp[ind];}
        int first=cost[ind]+getCost(cost,ind-1,dp);
        int second=Integer.MAX_VALUE;
        if(ind>=0) second=0+getCost(cost,ind-1,dp);

        return dp[ind]= Math.max(first,second);
    }
    public static int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
int dp[]=new int[n+1];
        Arrays.fill(dp,-1);

        return getCost(cost,n-1,dp);
    }
    public static void main(String[] args) {
        int [] cost = {10,15,20};
        int res=minCostClimbingStairs(cost);
        System.out.println(res);
    }
}
