class Solution {
     int mod = 1000000007;
public  int getWays(int n,int k,int target,int dp[][]){
       if(n == 0 && target == 0 ) return 1;
        if(n == 0 || target <= 0 ) return 0;
    
    
    if(dp[n][target]!=-1) return dp[n][target]%mod;
    dp[n][target]=0;
for(int i=1;i<=k;i++){
 dp[n][target]=(dp[n][target]+getWays(n-1,k,target-i,dp))%mod;
}
return dp[n][target];
}
    public int numRollsToTarget(int n, int k, int target) {
       int dp[][]=new int [n+1][target+1];
       for(int rows[]:dp){
           
       Arrays.fill(rows,-1);

       }
      return getWays(n,k,target,dp);
    }
}