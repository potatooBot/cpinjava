package Algorithm.Dynamic_Programming.Tabulation;

import java.util.Arrays;

public class maximum_sum_in_array_with_adjacent_elements {
    public static int FindMaxSum(int arr[], int n)
    {
        // Your code here
        int dp[]=new int[n];
        return getMaxLoot(arr,n,dp);

    }
    public static int getMaxLoot(int arr[],int n,int dp[]){

     dp[0]=0;
        for (int i = 1; i <n ; i++) {
            int take=arr[i];
            if(i>1) take=take+dp[i-2];
            int nottake=0 + dp[i-1];
            dp[i]=Math.max(take,nottake);
        }
        return dp[n-1];
    }
    public static void main(String[] args) {
        int n = 6,
                a[] = {5,5,10,100,10,5};
        int result=FindMaxSum(a,n);
        System.out.println(result);
    }
}
