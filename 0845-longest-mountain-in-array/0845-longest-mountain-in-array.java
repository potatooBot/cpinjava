class Solution {
    public int longestMountain(int[] nums) {
        int n= nums.length;
int dp[]=new int[n];
       // Arrays.fill(dp,1);
        for (int ind = 1; ind <n ; ind++) {

                if(nums[ind]>nums[ind-1]){
                    dp[ind]=1+dp[ind-1];
                }
        }
int dp2[]=new int[n];

        for (int idx = n-2; idx >=1 ; idx--) {

                if(nums[idx]>nums[idx+1]){
                    dp2[idx]=1+dp2[idx+1];
                }



        }
        int ans=0;
     //   System.out.println(Arrays.toString(dp));

        for (int i = 0; i <n-1 ; i++) {
            if (dp[i] > 0 && dp2[i] > 0) {
                ans = Math.max(ans, dp[i] + dp2[i] +1);
            }

        }
return ans;
    }
}