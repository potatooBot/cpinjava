class Solution {
    public int getMinimumCost(int cost[],int dp[],int idx){
        if(idx==cost.length-1) return cost[idx];
       if(idx>cost.length-1) return 0;
        if(dp[idx]!=-1) return dp[idx];
        int jumpOne= getMinimumCost(cost,dp,idx+1) +cost[idx];
        int second=Integer.MAX_VALUE;

            second= getMinimumCost(cost,dp,idx+2) +cost[idx];

        return dp[idx]=Math.min(jumpOne,second);
    }
     public int minCostClimbingStairs(int[] cost) {
int dp[]=new int[cost.length+1];
        Arrays.fill(dp,-1);
        int dp2[]=new int[cost.length+1];
        Arrays.fill(dp2,-1);


        return Math.min(getMinimumCost(cost,dp,0),getMinimumCost(cost,dp2,1));
    }
}