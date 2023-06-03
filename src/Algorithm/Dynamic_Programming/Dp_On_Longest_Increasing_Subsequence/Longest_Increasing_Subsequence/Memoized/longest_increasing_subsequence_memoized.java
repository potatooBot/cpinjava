package Algorithm.Dynamic_Programming.Dp_On_Longest_Increasing_Subsequence.Longest_Increasing_Subsequence.Memoized;
import java.util.*;
public class longest_increasing_subsequence_memoized {
    public static int longIncreSub(int nums[],int idx,int prev_idx,int dp[][]){
        if(idx==nums.length) return 0;


        if(dp[idx][prev_idx+1]!=-1) return dp[idx][prev_idx+1];

        int len= 0+ longIncreSub(nums,idx+1,prev_idx,dp);

        if(prev_idx==-1||nums[idx]>nums[prev_idx]){
            int take= 1+ longIncreSub(nums,idx+1,idx,dp);
            len=Math.max(len,take);
        }
        return dp[idx][prev_idx+1]=len;
    }
    //Function to find length of longest increasing subsequence.
    static int longestIncreasingSubsequence(int size, int nums[])
    {
        // code here
        //int n=nums.length;
        int dp[][]=new int[size][size+1];
        for(int rows[] : dp ){
            Arrays.fill(rows,-1);
        }

        return longIncreSub(nums,0,-1,dp);
    }
    public static void main(String args[]) {

        int arr[] = {10,9,2,5,3,7,101,18};

        int n = arr.length;

        System.out.println("The length of the longest increasing subsequence is "
                +longestIncreasingSubsequence(n,arr));

    }
}
//    The length of the longest increasing subsequence is 4
//
//        Time Complexity: O(N*N)
//
//        Reason: There are N*N states therefore at max ‘N*N’ new problems will be solved.
//
//        Space Complexity: O(N*N) + O(N)