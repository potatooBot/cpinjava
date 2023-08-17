package Algorithm;
import java.util.*;
public class buy_and_sell {
    public static int getMax(int prices[],int dp[][],int idx,int buy,int n ){
        if(idx==n){
            return 0;
        }
        if(dp[idx][buy]!=-1){
            return dp[idx][buy];
        }
        int profit=0;
        if(buy==0){
            profit=Math.max(0 + getMax(prices,dp,idx+1,0,n), -prices[idx] + getMax(prices,dp,idx+1,1,n));
        }
        if(buy==1){
            profit=Math.max(0 + getMax(prices,dp,idx+1,1,n), prices[idx] + getMax(prices,dp,idx+1,0,n));
        }
        return dp[idx][buy]=profit;
    }
    public static int stockBuyAndSell(int n, int[] prices) {
        int dp[][]=new int[n][n];
        for(int row[]:dp){
            Arrays.fill(row,-1);
        }
        return getMax(prices,dp,0,0,n);

    }
    public static void main(String[] args) {
        int n = 5;
       int price[] = {1, 3, 5, 7, 9};
    int ans=stockBuyAndSell(n,price);
        System.out.println(ans);
    }
}
