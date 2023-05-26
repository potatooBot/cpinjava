package Algorithm.Dynamic_Programming.TwoD_DP;

import java.util.Arrays;

public class traingle_minimum_sum {
    public static int minimumPathSumUtil(int row,int col,int tri[][],int n,int dp[][]){
        if(row==tri.length-1){
            return tri[row][col];
        }

        if(dp[row][col]!=-1) return  dp[row][col];

        int up=tri[row][col] +minimumPathSumUtil(row+1,col,tri,n,dp);
        int left=tri[row][col] +minimumPathSumUtil(row+1,col+1,tri,n,dp);



    return dp[row][col]=Math.min(up,left);
    }
    static int minimumPathSum(int[][] triangle, int n){

        int dp[][]=new int[n][n];
        for(int row[]: dp)
            Arrays.fill(row,-1);
        return minimumPathSumUtil(0,0,triangle,n,dp);

    }

    public static void main(String args[]) {

        int triangle [][] = {{1},
                {2,3},
                {3,6,7},
                {8,9,6,10}};

        int n = triangle.length;

        System.out.println(minimumPathSum(triangle,n));
    }
}
