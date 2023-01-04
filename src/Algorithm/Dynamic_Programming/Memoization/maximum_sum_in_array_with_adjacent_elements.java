package Algorithm.Dynamic_Programming.Memoization;

import java.util.Arrays;

public class maximum_sum_in_array_with_adjacent_elements {
    public static int getMaxLoot(int arr[],int ind,int dp[]){

        if(ind==0) return arr[ind];
        if(ind<0) return 0;
        if(dp[ind]!=-1) return dp[ind];
        int pick=arr[ind]+getMaxLoot(arr,ind-2,dp);
        int nonpick=0+getMaxLoot(arr,ind-1,dp);

        return dp[ind]=Math.max(pick,nonpick);
    }
    public static int FindMaxSum(int arr[], int n)
{
    // Your code here

    int dp[]=new int[n];
    Arrays.fill(dp,-1);
    return getMaxLoot(arr,n-1,dp);

}

    public static void main(String[] args) {
        int n = 6,
        a[] = {5,5,10,100,10,5};
        int result=FindMaxSum(a,n);
        System.out.println(result);
    }
}
