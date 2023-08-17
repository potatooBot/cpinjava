package Algorithm.Dynamic_Programming.Dp_On_Longest_Increasing_Subsequence.Length_of_Longest_Turbulent_Subarray;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Collectors;

public class longest_turbulent_subarray {
    static  public int maxTurbulenceSize(int[] arr) {
int dp[]=new int[arr.length];


dp[0]=1;
if(arr[1]!=arr[0]){
    dp[1]=2;
}
else {
    dp[1]=0;
}
        for (int i = 2; i <arr.length ; i++) {
            if(arr[i-2]>arr[i-1]&&arr[i-1]<arr[i]|| arr[i-2]<arr[i-1]&&arr[i-1]>arr[i]){
                dp[i]=dp[i-1]+1;
            }
            else {
                if(arr[i]!=arr[i-1]){
                    dp[i]=2;
                }
                else {
                    dp[i]=1;
                }
            }
        }
        int maxi=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length ; i++) {
            maxi=Math.max(maxi,dp[i]);
        }

        return maxi;
    }
    public static void main(String[] args) {
        int arr[] = {9,4,2,10,7,8,8,1,9};
int ans=maxTurbulenceSize(arr);
        System.out.println(ans);
    }
}
