package Algorithm.Dynamic_Programming.Dp_On_Longest_Increasing_Subsequence.Longest_bitnoic_sequence;

import java.util.Arrays;

public class longest_bitnoic_sequence {
    static  public int LongestBitonicSequence(int[] nums)

    {
        int n=nums.length;
     int dp1[]=new int[n];
     int dp2[]=new int[n];
        Arrays.fill(dp1,1);
        Arrays.fill(dp2,1);
        for (int ind = 0; ind <n ; ind++) {
            for (int prev = 0; prev < ind; prev++) {
if(nums[ind]>nums[prev]&&dp1[ind]<1+dp1[prev]){
    dp1[ind]=1+dp1[prev];
}
            }
        }

        for (int ind = n-1; ind >=0 ; ind--) {
            for (int prev = n-1; prev >ind; prev--) {
                if(nums[ind]>nums[prev]&&dp2[ind]<1+dp2[prev]){
                    dp2[ind]=1+dp2[prev];
                }
            }
        }
        int maxi=-1;
        for (int i = 0; i <n ; i++) {
            maxi=Math.max(maxi,dp1[i]+dp2[i]-1);
        }

     return maxi;   // Code here
    }
    public static void main(String[] args) {
        int nums []= {1, 2, 5, 3, 2};
int ans=LongestBitonicSequence(nums);
        System.out.println(ans);
    }
}
