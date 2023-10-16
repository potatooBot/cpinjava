class Solution {
    public static int solveMem(int start,int end,int dp[][]){
        if(start>=end){
return 0;
        }
if(dp[start][end]!=-1){
    return dp[start][end];
}
int ans=1000000;
for(int i=start;i<=end;i++){
ans=Math.min(ans,i+Math.max(solveMem(start,i-1,dp),solveMem(i+1,end,dp)));
}
return dp[start][end]=ans;
    }
    public int getMoneyAmount(int n) {
        int dp[][]=new int[n+1][n+1];
        for(int rows[]:dp){
            Arrays.fill(rows,-1);
        }

        return solveMem(1,n,dp);
    }
}