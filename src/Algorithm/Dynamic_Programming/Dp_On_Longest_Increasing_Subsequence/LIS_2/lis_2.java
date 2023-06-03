package Algorithm.Dynamic_Programming.Dp_On_Longest_Increasing_Subsequence.LIS_2;

import java.util.Arrays;
import java.util.Collections;
import java.util.*;
public class lis_2 {
    static   public int lengthOfLIS(int[] nums, int k) {

        int n=nums.length;
        int dp[]=new int[n];
        Arrays.fill(dp,1);
int maxi=-1;

        for (int ind = 0; ind <=n-1 ; ind++) {

            for (int prev_ind = 0; prev_ind <=ind-1 ; prev_ind++) {
                if(nums[ind]>nums[prev_ind]&&1+dp[prev_ind]>dp[ind]&&(nums[ind]-nums[prev_ind])<=k){
                    dp[ind]=1+dp[prev_ind];

                }

            }
maxi=Math.max(maxi,dp[ind]);
        }
//        ArrayList<Integer> ans=new ArrayList<>();
//        int lastIndex=-1;
//        for (int i = 0; i <=n-1 ; i++) {
//            if (dp[i]>maxi){
//                maxi=dp[i];
//                lastIndex=i;
//
//            }
//        }
//        ans.add(nums[lastIndex]);
//        while (hash[lastIndex]!=lastIndex){
//            lastIndex=hash[lastIndex];
//            ans.add(nums[lastIndex]);
//        }
//        Collections.reverse(ans);
//        System.out.println(ans);
        return maxi;
    }
    public static void main(String[] args) {
        int []nums = {1,5};
        int k = 1;
int ans=lengthOfLIS(nums,k);
        System.out.println(ans);
    }
}
