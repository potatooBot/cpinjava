class Solution {
    public int longestArithSeqLength(int[] nums) {
        


     int maxi=-1;


            int dp[][]=new int[nums.length][1001];
            for (int ind = 1; ind < nums.length; ind++) {
                for (int prev = 0; prev <= ind - 1; prev++) {
                    int diff=nums[ind]-nums[prev]+500;
//                        System.out.println("Changint at " + i + " for "+ nums[ind]);
                     dp[ind][diff]=1+dp[prev][diff];
                 maxi =Math.max(maxi,dp[ind][diff]);

                }
            }






return maxi+1;
    }
}