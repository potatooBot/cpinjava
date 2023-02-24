package Algorithm.Dynamic_Programming.Dp_On_Stocks;

import java.util.Arrays;

public class best_time_to_buy_sell_stock_2_tabulation {
    public static int maxProfit(int[] prices) {
        int n=prices.length;
        if(n==0) return 0;
        int dp[][]=new int[n+1][2];

        for (int idx = n-1; idx >=0 ; idx--) {
            for (int buy = 0; buy <=1 ; buy++) {
                if(buy==0){ //We can buy Stock

                    dp[idx][buy]=Math.max(-prices[idx] + dp[idx+1][1], 0 + dp[idx+1][0]);
                }


                if(buy==1) { //We can sell stock

                    dp[idx][buy]=Math.max(prices[idx]+dp[idx+1][0] ,0 + dp[idx+1][1]);
                }
            }
        }

        return dp[0][0];

    }
    public static void main(String[] args) {
        int n =6;
        int Arr[] = {7,1,5,3,6,4};

        System.out.println("The maximum profit that can be generated is "+ maxProfit(Arr));
    }
}
