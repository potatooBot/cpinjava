package Algorithm.Dynamic_Programming.MCM_Types;

import java.util.Arrays;

public class mcm_tabulation {
    static int matrixMultiplication(int N, int arr[])
    {
        // code here
        int dp[][]=new int[N][N];

        for (int i = 1; i <N ; i++) {
            dp[i][i]=0;
        }

        for (int i = N-1; i >=1 ; i--) {
            for (int j = i+1; j <N ; j++) {
                int mini = (int) Math.pow(10, 9);
                for (int k = i; k <j; k++) {




                    int steps = arr[i - 1] * arr[k] * arr[j] +dp[i][k] +dp[k+1][j];
                mini=Math.min(mini,steps);
                }
                dp[i][j]=mini;
            }
        }


        return dp[1][N-1];
    }
    public static void main(String[] args) {
        int  N = 5,
                arr[] = {40, 20, 30, 10, 30};
        int ans=matrixMultiplication(N,arr);
        System.out.println(ans);
    }
}
