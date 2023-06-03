//
//Given an array of distinct integers nums and a target integer target, return the number of possible combinations that add up to target.
//
//        The test cases are generated so that the answer can fit in a 32-bit integer.
//
//
//
//        Example 1:
//
//        Input: nums = [1,2,3], target = 4
//        Output: 7
//        Explanation:
//        The possible combination ways are:
//        (1, 1, 1, 1)
//        (1, 1, 2)
//        (1, 2, 1)
//        (1, 3)
//        (2, 1, 1)
//        (2, 2)
//        (3, 1)
//        Note that different sequences are counted as different combinations.
//        Example 2:
//
//        Input: nums = [9], target = 3
//        Output: 0

package Algorithm.Dynamic_Programming.KnapsackType.Combination_Sum_4;
import java.util.*;
public class combination_sum_4 {
    public static int getCombination(int nums[],int dp[][],int target,int idx){

        if(target==0){
            return 1;
        }
        if(idx<0) return 0;
        if(dp[idx][target]!=-1) return dp[idx][target];
        int notPick=0;
        int pick=0;
        notPick=getCombination(nums,dp,target,idx-1);
        if(nums[idx]<=target){
            // like coin change 2
            // only difference is that permutations have to start from 0
            // to take other rearrangements
            pick=getCombination(nums,dp,target-nums[idx],nums.length-1);
        }

        return dp[idx][target]=pick+notPick;
    }
    public static int combinationSum4(int[] nums, int target) {
        int n=nums.length;
        int dp[][]=new int[n][target+1];
        for(int rows[]:dp){
            Arrays.fill(rows,-1);
        }
        return getCombination(nums,dp,target,n-1);
    }
    public static void main(String[] args) {
int nums[] = {1,2,3};int target = 4;
    int ans=combinationSum4(nums,target);
        System.out.println(ans);
    }
}
