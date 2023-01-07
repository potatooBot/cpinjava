package Algorithm.Dynamic_Programming.Tabulation.TWO_D;

import java.util.Arrays;

public class minimum_path_sum {

    public static int minPathSum(int n,int m,int[][] grid) {
        int dp[][]=new int[n+1][m+1];
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <m; j++) {
                if (i == 0 && j == 0)
                    dp[i][j] = grid[i][j];
                else {
                    int up = 0;
                    int down = 0;
                    if (i > 0) {
                        up = grid[i][j] + dp[i - 1][j];
                    }
                    //If cannot take up path
                    else {
                        up=up+(int)Math.pow(10,9);
                    }

                    //If cannot take down path
                    if (j > 0) {
                        down =down+grid[i][j] + dp[i][j - 1];

                    }
                    else {
                        down=(int)Math.pow(10,9);
                    }
                    dp[i][j] = Math.min(up, down);
                }
            }

        }
        return dp[n-1][m-1];
    }

    public static void main(String args[]) {

        int matrix[][] = {{1,2,3},
                {4,5,6}
        };

        int n = matrix.length;
        int m = matrix[0].length;

        System.out.println(minPathSum(n,m,matrix));
    }
}


//    Time Complexity: O(N*M)
//
//        Reason: There are two nested loops
//
//        Space Complexity: O(N*M)
//
//        Reason: We are using an external array of size ‘N*M’’.