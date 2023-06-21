class Solution {
public static int getMaxProfit(int prices[],int idx,int buy,int cap,int dp[][][]){


if(idx==prices.length||cap==0) return 0;


  if(dp[idx][buy][cap]!=-1)
        return dp[idx][buy][cap];


        int profit=0;
if(buy==1){

 profit=Math.max(-prices[idx]+getMaxProfit(prices,idx+1,0,cap,dp),0+getMaxProfit(prices,idx+1,1,cap,dp));
}
if(buy==0){
    profit=Math.max(prices[idx]+getMaxProfit(prices,idx+1,1,cap-1,dp),0+getMaxProfit(prices,idx+1,0,cap,dp));
}


return  dp[idx][buy][cap]=profit;
}

    public int maxProfit(int[] prices) {

int n=prices.length;


 int dp[][][]=new int [n+1][2][3];
   /*/     for (int i = 0; i < n; i++) {
         for (int j = 0; j < 2; j++) {
            Arrays.fill(dp[i][j], -1);
         }
        }
*/

for(int idx=n-1;idx>=0;idx--){

   for(int buy=0;buy<=1;buy++){
  for(int cap=1;cap<=2;cap++){

if(buy==0){

 dp[idx][buy][cap]=Math.max(-prices[idx]+dp[idx+1][1][cap],0+dp[idx+1][0][cap]);
}
if(buy==1){
   dp[idx][buy][cap]=Math.max(prices[idx]+dp[idx+1][0][cap-1],0+dp[idx+1][1][cap]);
}

}
   
}
}

return dp[0][0][2];
    }
}