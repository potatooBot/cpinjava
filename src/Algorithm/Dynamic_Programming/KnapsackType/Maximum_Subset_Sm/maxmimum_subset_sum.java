package Algorithm.Dynamic_Programming.KnapsackType.Maximum_Subset_Sm;

import java.util.Arrays;

public class maxmimum_subset_sum {
    public static int getMax(int arr[],int dp[],int idx ){

        if(idx<0) return 0;
        if(idx==0) return arr[0];
        if(dp[idx]!=-1) return dp[idx];
        int jumpOne=arr[idx] +getMax(arr,dp,idx-1);
        int jumpTwo=arr[idx] +getMax(arr,dp,idx-2);



        return dp[idx]=Math.max(jumpTwo,jumpOne);

    }
    public static long findMaxSubsetSum(int n, int[] A) {
     int dp[]=new int[n];
        Arrays.fill(dp,-1);

     return getMax(A,dp,n-1);
        // code here
    }
    public static void main(String[] args) {
        int N = 3;
        int arr[] = {0, 2, 0};
long ans=findMaxSubsetSum(N,arr);
        System.out.println(ans);
    }
}
