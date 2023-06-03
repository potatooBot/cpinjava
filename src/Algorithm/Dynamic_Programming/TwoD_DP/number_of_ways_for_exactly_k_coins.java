package Algorithm.Dynamic_Programming.TwoD_DP;

import java.util.Arrays;

public class number_of_ways_for_exactly_k_coins {
    static long numberOfPath(int n, int k, int [][]arr) {
        // code here

        int dp[][][]=new int[n][n][100];
        for (int mat[][]:
             dp) {
            for (int rows[]:
               mat  ) {
                Arrays.fill(rows,-1);
            }
        }


    return getCoinsNumber(n,k,arr,dp,0,0,0);
    }
    public static int getCoinsNumber(int n,int k,int arr[][],int dp[][][],int row,int col,int sum){
        if(row<0||row==arr.length||col<0||col==arr[0].length){
            return 0;
        }
        sum=sum+arr[row][col];
        if(dp[row][col][sum]!=-1) return dp[row][col][sum];
    if(row==arr.length-1&&col==arr[0].length-1){
        if(sum==k) return 1;
        else return 0;
    }
    int down= getCoinsNumber(n,k,arr,dp,row+1,col,sum);
        int right= getCoinsNumber(n,k,arr,dp,row,col+1,sum);
    return dp[row][col][sum]=down+right;
    }
    public static void main(String[] args) {
        int K = 12;int N = 3;
        int arr[][] = {{1, 2, 3},
            {4, 6, 5},
            {3, 2, 1}};
        long ans=numberOfPath(N,K,arr);
        System.out.println(ans);
    }
}
