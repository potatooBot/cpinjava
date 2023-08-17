package Algorithm.Dynamic_Programming.TwoD_DP;

import java.util.Arrays;

public class Maximum_number_of_longest_increasing_path {
    public static long getLISinGrid(int grid[][],long dp[][],int row,int col){
        long reuslt=1;
        if(dp[row][col]!=-1) return dp[row][col];
        int mod=(int)Math.pow(10,9)+7;
        int dr[]={-1,0,1,0};
        int dc[]={0,1,0,-1};
        for (int i = 0; i <4 ; i++) {
            int neiRow=row+dr[i];
            int neiCol=col+dc[i];
            if(neiRow>=0&&neiRow<grid.length&&neiCol>=0&&neiCol<grid[0].length&&grid[row][col]<grid[neiRow][neiCol])
            {
                reuslt=(reuslt+getLISinGrid(grid,dp,neiRow,neiCol))%mod;
            }
        }
        return dp[row][col]=reuslt;
    }
    static   public int countPaths(int[][] grid) {
        int n= grid.length;;
        int m= grid[0].length;;
long dp[][]=new long[n][m];
        for (long rows[]:
             dp) {
            Arrays.fill(rows,-1);
        }
       long result=0;

        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                result=result+getLISinGrid(grid,dp,i,j);
            }
        }
        return (int)result;
    }
    public static void main(String[] args) {
        int [][]grid = {{1,1},{3,4}};
        int ans=countPaths(grid);
        System.out.println(ans);
    }
}
