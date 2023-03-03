package Algorithm.Dynamic_Programming.MCM_Types;

import java.util.Arrays;

public class mcm_no_of_operation_memoization {
    public static int getNoOfOperation(int i,int j,int arr[],int dp[][]){
if(i==j) return 0;
int mini=(int) Math.pow(10,9);
        for (int k = i; k <j ; k++) {

            int steps= arr[i-1]*arr[k]*arr[j] +getNoOfOperation(i,k,arr,dp)  +getNoOfOperation(k+1,j,arr,dp);
            mini=Math.min(mini,steps);
        }
        dp[i][j]=mini;
        return mini;
    }
    static int matrixMultiplication(int N, int arr[])
    {
        // code here
        int dp[][]=new int[N][N];
        for (int [] rows:
             dp) {
            Arrays.fill(rows,-1);
        }
        int i=1;
        int j=N-1;
        return getNoOfOperation(i,j,arr,dp);
    }
    public static void main(String[] args) {
        int  N = 5,
        arr[] = {40, 20, 30, 10, 30};
        int ans=matrixMultiplication(N,arr);
        System.out.println(ans);
    }
}
