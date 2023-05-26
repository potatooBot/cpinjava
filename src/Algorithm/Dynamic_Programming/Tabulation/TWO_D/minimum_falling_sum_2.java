package Algorithm.Dynamic_Programming.Tabulation.TWO_D;

import java.util.Arrays;
import java.util.stream.Collectors;

public class minimum_falling_sum_2 {
    public static int getminFallingSum(int row,int col,int dp[][],int grid[][]){

        if(col<0||col>= grid[0].length)
        {
            return (int)Math.pow(10,9);
        }
        if(row==0) return grid[0][col];

        if(dp[row][col]!=-1) {
            return dp[row][col];
        }
        int ans  = Integer.MAX_VALUE;

        for(int j = 0 ; j<grid[0].length; j++)
        {
            if(col != j)
            {
                ans = Math.min(grid[row][col] +  getminFallingSum(row-1 , j , dp ,grid), ans);
            }
        }
return dp[row][col]=ans;
    }
    static   public int minFallingPathSum(int[][] grid) {

        int n = grid.length;
        int m = grid[0].length;

        int dp[][] = new int[n ][m ];

        for (int rows[] :
                dp) {
            Arrays.fill(rows, -1);
        }
        int mini = 10000000;
        for (int j = 0; j <m ; j++) {
     mini=Math.min(mini,getminFallingSum(n - 1, j, dp, grid));
        }
        for (int rows[]:
             dp) {
            System.out.println(Arrays.stream(rows).boxed().collect(Collectors.toList()));
        }

        return mini;
    }
    public static void main(String[] args) {
//        int [][] grid = {{1,2,3},{4,5,6},{7,8,9}};
        int [][] grid={{-73,61,43,-48,-36},
                        {3,30,27,57,10},
                        {96,-76,84,59,-15},
                        {5,-49,76,31,-7},
                        {97,91,61,-46,67}};
//int grid[][]={{7}};
        int ans=minFallingPathSum(grid);

        System.out.println(ans);

    }

}
