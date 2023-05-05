class Solution {
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
   public int minFallingPathSum(int[][] grid) {

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


        return mini;
    }
}