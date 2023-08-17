package Algorithm.Dynamic_Programming.Dp_On_Longest_Increasing_Subsequence.Maximum_Sum_Increasing_Subsequence;

import java.util.Arrays;

public class maximum_sum_increasing_subsequence {
    static public int maxSumIS(int arr[], int n)
    {
        int dp[]=new int[n];
        int maxi=0;
        for (int ind = 0; ind <n ; ind++) {
            dp[ind]=arr[ind];
            for (int prev_ind = 0; prev_ind <ind ; prev_ind++) {
                if(arr[prev_ind]<arr[ind])
                    dp[ind]=Math.max(dp[ind],dp[prev_ind]+arr[ind]);

            }
            maxi=Math.max(dp[ind],maxi);
        }
        System.out.println(maxi);

        return 0;   //code here.
    }

    public static void main(String[] args) {
        int n = 5, arr[] = {1, 101, 2, 3, 100};
int ans=maxSumIS(arr,n);

    }
}
