package Algorithm.Dynamic_Programming.Memoization.TwoD_DP;

import java.util.Arrays;

public class minimum_sum {
    public static int getWays(int a,int b,int grid[][],int dp[][]){

        if(a==0&&b==0)
            return dp[a][b];
        if(a<0||b<0)
            return 0;
        if(dp[a][b]!=-1)
            return dp[a][b];
        int up=grid[a][b]+getWays(a-1,b,grid,dp);
        up=up-grid[a][b];
        int left=grid[a][b]+getWays(a,b-1,grid,dp);

        return dp[a][b]=up+left;
    }
    public static int minPathSum(int[][] grid) {
        int a=grid.length;
        int b=grid[0].length;

        int dp[][]=new int[a+1][b+1];
        for(int [] row:dp){
            Arrays.fill(row,-1);
        }

        int m= getWays(a-1,b-1,grid,dp);
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }

        return m;
    }
    public static void main(String args[]) {

        int matrix[][] = {{5,9,6},
                          {11,5,2}
                };

        int n = matrix.length;
        int m = matrix[0].length;

        System.out.println(minPathSum(matrix));
    }
}
