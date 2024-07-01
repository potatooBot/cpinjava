class Solution {
    public int maximumLength(int[] nums, int k) {
        int dp[][]=new int[k][k];
        int n=nums.length;
        int ans=1;
        for(int i=0;i<n;i++){
            int cur=nums[i]%k;
            for(int mod=0;mod<k;mod++){
                int prev=(mod-cur+k)%k;
dp[cur][mod]=Math.max(dp[cur][mod],1+dp[prev][mod]);
ans=Math.max(ans,dp[cur][mod]);
            }
        }
        return ans;
    }
}