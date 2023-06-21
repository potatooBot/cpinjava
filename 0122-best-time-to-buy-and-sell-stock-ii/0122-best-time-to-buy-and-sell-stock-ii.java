class Solution {
    public static int getMaxProfit (int pr[],int idx,int buy,int dp[][]){
if(idx==pr.length) {
    return 0; //No Profit to be made
}
if(dp[idx][buy]!=-1) return dp[idx][buy];
int profit=0;
if(buy==0){

profit=Math.max(pr[idx] + getMaxProfit(pr,idx+1,1,dp), 0 + getMaxProfit(pr,idx+1,0,dp));
}


if(buy==1) {
profit=Math.max(-pr[idx]+getMaxProfit(pr,idx+1,0,dp) ,0 + getMaxProfit(pr,idx+1,1,dp));
}


return dp[idx][buy]=profit;

    }
    public int maxProfit(int[] prices) {
        int n=prices.length;
 if(n==0) return 0;
 int dp[][]=new int[n][2];
     for(int rows[]:dp) Arrays.fill(rows,-1);
        

return getMaxProfit(prices,0,1,dp);

    }
}