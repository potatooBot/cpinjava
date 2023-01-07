package Algorithm.Dynamic_Programming.Tabulation.TWO_D;

import java.util.Arrays;

public class unique_path_with_obstacle {
    public static int getWays(int grid[][],int dp[][]){
        //Base Condition

        for (int row = 0; row <grid.length ; row++) {
            for (int col = 0; col< grid[0].length; col++) {

                if (row >= 0 && col >= 0 && grid[row][col] == -1) {
                    dp[row][col]=0;
                    continue;
                }
                dp[0][0] = 1;
                if (row == grid.length - 1 && col == grid[0].length) return dp[0][0];

                if (row < 0 || col < 0) return 0;

                int up = 0;
                int left = 0;


                if (row > 0)
                    up = dp[row - 1][col];
                if (col > 0)
                    left = dp[row][col - 1];


                dp[row][col] = up + left;
            }
        }
        return dp[grid.length-1][grid[0].length-1];
    }

    public static int uniquePathsWithObstacles(int[][] grid) {
        int row= grid.length;
        int col= grid[0].length;
        int dp[][]=new int[row][col];

        return getWays(grid,dp);
    }
    public static void main(String args[]) {

        int[][] maze = { {0,0,0},
                {0,-1,0},
                {0,0,0}};


        System.out.println(uniquePathsWithObstacles(maze));
    }
}
