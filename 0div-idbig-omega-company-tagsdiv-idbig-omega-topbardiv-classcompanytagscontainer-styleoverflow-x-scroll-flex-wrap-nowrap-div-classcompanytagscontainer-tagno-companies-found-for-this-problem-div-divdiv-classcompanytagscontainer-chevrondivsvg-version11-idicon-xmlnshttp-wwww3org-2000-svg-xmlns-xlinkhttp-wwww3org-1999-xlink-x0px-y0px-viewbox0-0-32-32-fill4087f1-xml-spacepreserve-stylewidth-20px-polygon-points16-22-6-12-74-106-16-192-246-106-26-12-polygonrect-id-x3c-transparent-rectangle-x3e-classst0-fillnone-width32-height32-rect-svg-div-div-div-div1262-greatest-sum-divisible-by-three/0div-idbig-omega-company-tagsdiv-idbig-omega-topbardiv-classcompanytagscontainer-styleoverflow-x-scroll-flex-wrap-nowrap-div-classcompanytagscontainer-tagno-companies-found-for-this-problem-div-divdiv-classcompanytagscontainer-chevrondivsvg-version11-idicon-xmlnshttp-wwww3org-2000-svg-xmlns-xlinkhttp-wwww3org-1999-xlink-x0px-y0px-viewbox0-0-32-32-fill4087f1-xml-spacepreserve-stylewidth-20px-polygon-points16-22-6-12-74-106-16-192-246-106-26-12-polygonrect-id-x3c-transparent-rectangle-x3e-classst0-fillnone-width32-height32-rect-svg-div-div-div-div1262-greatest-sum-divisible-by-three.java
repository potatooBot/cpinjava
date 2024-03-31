class Solution {
    public static int getSum(int nums[],int dp[][],int rem,int idx){
        if(idx==nums.length){
            if(rem==0){
return 0;
            }
            else{
                return Integer.MIN_VALUE;
            }
        }

if(dp[idx][rem]!=-1) return dp[idx][rem];
        int take=nums[idx]+getSum(nums,dp,(rem+nums[idx])%3,idx+1);
        int nottake=getSum(nums,dp,rem,idx+1);


        return dp[idx][rem]=Math.max(take,nottake);
    }


    public int maxSumDivThree(int[] nums) {
        int dp[][]=new int[nums.length+1][3];

        for(int rows[]:dp)
        Arrays.fill(rows,-1);

        return getSum(nums,dp,0,0);
    }
}