package Algorithm.Dynamic_Programming.DP_Practice;

import java.util.Arrays;
import java.util.stream.Collectors;

public class wiggle_subsequense {
    static     public int wiggleMaxLength(int[] nums) {
        int n=nums.length;
        if(n==1) return 1;
int dp[]=new int[n];
  Arrays.fill(dp,1);

        for (int i = 1; i <n-1 ; i++) {
            for (int prev_ind = 0; prev_ind <=i ; prev_ind++) {
                if(nums[i]-nums[prev_ind]>0&&nums[i+1]-nums[i]<0 || (nums[i]-nums[prev_ind]<0&&nums[i+1]-nums[i]>0)){
                    dp[i]=dp[prev_ind]+1;
                }
            }
        }
       int maxi=-1;
        for (int i = 0; i < dp.length ; i++) {
            maxi=Math.max(maxi,dp[i]);
        }

        return maxi+1;
    }
    public static void main(String[] args) {
        int [] nums = {1,7,4,9,2,5};
        int ans=wiggleMaxLength(nums);
        System.out.println(ans);
    }
}
