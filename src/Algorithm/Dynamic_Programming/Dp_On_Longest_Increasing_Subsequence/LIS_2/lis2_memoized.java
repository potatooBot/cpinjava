package Algorithm.Dynamic_Programming.Dp_On_Longest_Increasing_Subsequence.LIS_2;

import java.util.Arrays;

public class lis2_memoized {
    public static int longIncreSub(int nums[],int idx,int prev_idx,int dp[][],int k){
        if(idx==nums.length) return 0;


        if(dp[idx][prev_idx+1]!=-1) return dp[idx][prev_idx+1];

        int len= 0+ longIncreSub(nums,idx+1,prev_idx,dp,k);

        if(prev_idx==-1||nums[idx]>nums[prev_idx]&&nums[idx]-nums[prev_idx]<=k){
            int take= 1+ longIncreSub(nums,idx+1,idx,dp,k);
            len=Math.max(len,take);
        }
        return dp[idx][prev_idx+1]=len;
    }
    static   public int lengthOfLIS(int[] nums, int k) {
int n= nums.length;
       int dp[][]=new int[n][n+1];
        for (int rows[]:
             dp) {
            Arrays.fill(rows,-1);
        }

 int ans=longIncreSub(nums,0,-1,dp,k);
        System.out.println(ans);
 return 0;
    }
    public static void main(String[] args) {
        int []nums = {7,4,5,1,8,12,4,7};
        int k = 5;
        int ans=lengthOfLIS(nums,k);
//        System.out.println(ans);
    }
}
