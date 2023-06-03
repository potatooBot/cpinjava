package Algorithm.Dynamic_Programming.Dp_On_Longest_Increasing_Subsequence.Number_of_LIS;
import java.util.*;
public class number_of_lis {
  static   public int findNumberOfLIS(int[] nums) {
        int n= nums.length;
        int maxi=1;

        int dp[]=new int[n];
        int count[]=new int[n];
        Arrays.fill(count,1);
        Arrays.fill(dp,1);
        for (int ind = 0; ind <=n-1 ; ind++) {
            for (int prev_ind = 0; prev_ind <=ind-1 ; prev_ind++) {
                if(nums[ind]>nums[prev_ind]&&dp[ind]<dp[prev_ind]+1){
                    dp[ind]=1+dp[prev_ind];
                    count[ind]=count[prev_ind];
                }
                else if(nums[ind]>nums[prev_ind]&&dp[ind]==dp[prev_ind]+1){
                    count[ind]=count[ind]+count[prev_ind];
                }
            }
            maxi=Math.max(maxi,dp[ind]);
        }
        int ans=0;
        for(int i=0;i<=n-1;i++){
            if(maxi==dp[i]){
                ans=ans+count[i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] nums = {1,3,5,4,7};
  int ans=findNumberOfLIS(nums);
        System.out.println(ans);

  }
}
