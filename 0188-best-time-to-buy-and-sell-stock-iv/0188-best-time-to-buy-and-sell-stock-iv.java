class Solution {
    public int maxProfit(int k, int[] prices) {
        int n=prices.length;


 int dp[][][]=new int [n+1][2][k+1];
   /*/     for (int i = 0; i < n; i++) {
         for (int j = 0; j < 2; j++) {
            Arrays.fill(dp[i][j], -1);
         }
        }
*/

for(int idx=n-1;idx>=0;idx--){

   for(int buy=0;buy<=1;buy++){
  for(int cap=1;cap<=k;cap++){

if(buy==0){

 dp[idx][buy][cap]=Math.max(-prices[idx]+dp[idx+1][1][cap],0+dp[idx+1][0][cap]);
}
if(buy==1){
   dp[idx][buy][cap]=Math.max(prices[idx]+dp[idx+1][0][cap-1],0+dp[idx+1][1][cap]);
}
}
}
}
return dp[0][0][k];
    }
}