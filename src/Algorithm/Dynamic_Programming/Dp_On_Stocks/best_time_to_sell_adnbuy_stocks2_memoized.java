package Algorithm.Dynamic_Programming.Dp_On_Stocks;

import java.util.Arrays;

public class best_time_to_sell_adnbuy_stocks2_memoized {
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
    public static int maxProfit(int[] prices) {
        int n=prices.length;
        if(n==0) return 0;
        int dp[][]=new int[n][2];
        for(int rows[]:dp) Arrays.fill(rows,-1);


        return getMaxProfit(prices,0,1,dp);

    }

    public static void main(String[] args) {
        int n =6;
       int Arr[] = {7,1,5,3,6,4};

        System.out.println("The maximum profit that can be generated is "+ maxProfit(Arr));
    }
}
