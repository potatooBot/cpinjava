//You are given an m x n integer array grid. There is a robot initially located at the top-left corner (i.e., grid[0][0]). The robot tries to move to the bottom-right corner (i.e., grid[m - 1][n - 1]). The robot can only move either down or right at any point in time.
//
//        An obstacle and space are marked as 1 or 0 respectively in grid. A path that the robot takes cannot include any square that is an obstacle.
//
//        Return the number of possible unique paths that the robot can take to reach the bottom-right corner.
//
//        The testcases are generated so that the answer will be less than or equal to 2 * 109.
//
//
//
//        Example 1:
//
//
//        Input: obstacleGrid = [[0,0,0],[0,1,0],[0,0,0]]
//        Output: 2
//        Explanation: There is one obstacle in the middle of the 3x3 grid above.
//        There are two ways to reach the bottom-right corner:
//        1. Right -> Right -> Down -> Down
//        2. Down -> Down -> Right -> Right






package Algorithm.Dynamic_Programming.TwoD_DP;

import java.util.Arrays;
//-1=Obstacle
public class unique_path_with_obtsacle {


    public static int getWays(int row,int col,int grid[][],int dp[][]){
        //Base Condition
        if(row>=0&&col>=0&&grid[row][col]==-1)
        {
            return 0;
        }
        if(row==0&&col==0) return 1;
        if(row<0||col<0) return 0;
        if(dp[row][col]!=-1) return dp[row][col];

        int up=getWays(row-1,col,grid,dp);
        int left=getWays(row,col-1,grid,dp);

        return dp[row][col]=up+left;

    }
    public static int uniquePathsWithObstacles(int[][] grid) {
 int row= grid.length;
 int col= grid[0].length;
        int dp[][]=new int[row][col];

        for (int[] r :dp ) {
            Arrays.fill(r,-1);
        }

        return getWays(row-1,col-1,grid,dp);
    }
    public static void main(String args[]) {

        int[][] maze = { {0,0,0},
                {0,-1,0},
                {0,0,0}};


        System.out.println(uniquePathsWithObstacles(maze));
    }
}

//    Time Complexity: O(M*N)
//
//        Reason: There are two nested loops
//
//        Space Complexity: O(N)
//
//        Reason: We are using an external array of size ‘N’ to store only one row.