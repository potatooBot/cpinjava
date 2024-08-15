package Algorithm.Dynamic_Programming.KnapsackType.MAx_Profit_from_stock;
import java.util.*;
public class maximum_profit_from_stock {
    public static int getProfitUtil(int saving,int dp[][],List<Integer> currPrice,List<Integer> futurePrice,int idx){
        if(saving<0||idx<0) return 0;
        if(idx==0){
            if(currPrice.get(0)<=saving){
                return futurePrice.get(0)-currPrice.get(0);
            }
            else {
                return 0;
            }
        }
        if(dp[idx][saving]!=-1) return dp[idx][saving];
        int notTake=0+getProfitUtil(saving,dp,currPrice,futurePrice,idx-1);
int take=Integer.MIN_VALUE;

if(currPrice.get(idx)<=saving){
    take=(futurePrice.get(idx)-currPrice.get(idx)) +getProfitUtil(saving-currPrice.get(idx),dp,currPrice,futurePrice,idx-1);
}
return dp[idx][saving]=Math.max(take,notTake);
    }
    public static int getMaxProfit(int saving,List currenPrice,List futurePrice){
        int n=currenPrice.size();
        int dp[][]=new int[n][saving+1];
        for (int rows[]:
             dp) {
            Arrays.fill(rows,-1);
        }
        int profit=getProfitUtil(saving,dp,currenPrice,futurePrice,n-1);
        return profit;
    }
    public static void main(String[] args) {
        int saving=250;

        List<Integer> currentprice=new ArrayList<>();
        currentprice.add(175);
        currentprice.add(133);
        currentprice.add(109);
        currentprice.add(210);
        currentprice.add(97);


        List<Integer> futurePrice=new ArrayList<>();
        futurePrice.add(200);
        futurePrice.add(125);
        futurePrice.add(128);
        futurePrice.add(228);
        futurePrice.add(133);
        int ans=getMaxProfit(saving,currentprice,futurePrice);
        System.out.println(ans);
    }
}
