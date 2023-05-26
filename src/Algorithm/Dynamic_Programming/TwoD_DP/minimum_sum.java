//Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right, which minimizes the sum of all numbers along its path.
//
//        Note: You can only move either down or right at any point in time.
//
//
//
//        Example 1:
//
//
//        Input: grid = [[1,3,1],[1,5,1],[4,2,1]]
//        Output: 7
//        Explanation: Because the path 1 → 3 → 1 → 1 → 1 minimizes the sum.
//
//
//





package Algorithm.Dynamic_Programming.TwoD_DP;

import java.util.Arrays;

public class minimum_sum {
    public static int getWays(int a,int b,int grid[][],int dp[][]){

        if(a==0&&b==0)
            return grid[a][b];
        if(a<0||b<0)
            return (int)Math.pow(10,9);




        if(dp[a][b]!=-1)
            return dp[a][b];
        int up=grid[a][b]+getWays(a-1,b,grid,dp);
        int left=grid[a][b]+getWays(a,b-1,grid,dp);

        return dp[a][b]=Math.min(up,left);
    }
    public static int minPathSum(int[][] grid) {
        int a=grid.length;
        int b=grid[0].length;
        int dp[][]=new int[a+1][b+1];
        for(int [] row:dp){
            Arrays.fill(row,-1);
        }
        int m= getWays(a-1,b-1,grid,dp);
        return m;
    }
    public static void main(String args[]) {

        int matrix[][] = {{1,2,3},
                          {4,5,6}
                };

        int n = matrix.length;
        int m = matrix[0].length;

        System.out.println(minPathSum(matrix));
    }
}
