package Algorithm.Dynamic_Programming.DP_Practice;

import java.util.Arrays;
import java.util.OptionalInt;

public class longest_arthiemetic_sequence {
    static   public int longestArithSeqLength(int[] nums) {



            int n = nums.length;
            int max = 0;
            int[][] dp = new int[n][1001];

            for (int i = 1; i < n; i++) {
                for (int j = 0; j < i; j++) {
                    // Calculate the difference and adjust it to be within the range of the dp array
                    int diff = nums[j] - nums[i] + 500;

                    // Update the length of the arithmetic subsequence ending at index i and with the difference 'diff'
                    dp[i][diff] = dp[j][diff] + 1;

                    // Update the overall maximum length
                    max = Math.max(max, dp[i][diff]);
                }
            }

            // The maximum length is the result plus 1 because we count the current element in the subsequence
            return max + 1;

    }
    public static void main(String[] args) {
        int nums[] = {24,13,1,100,0,94,3,0,3};
int ans=longestArithSeqLength(nums);
        System.out.println(ans);
    }
}
