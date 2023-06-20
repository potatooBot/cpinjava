class Solution {
      public static int getLISinGrid(int grid[][],int dp[][],int row,int col){
        int reuslt=1;
        if(dp[row][col]!=-1) return dp[row][col];
        int mod=(int)Math.pow(10,9)+7;
        int dr[]={-1,0,1,0};
        int dc[]={0,1,0,-1};
        int maxi=1;
        for (int i = 0; i <4 ; i++) {
            int neiRow=row+dr[i];
            int neiCol=col+dc[i];

            if(neiRow>=0&&neiRow<grid.length&&neiCol>=0&&neiCol<grid[0].length&&grid[row][col]<grid[neiRow][neiCol])
            {
             maxi=Math.max(maxi,1+getLISinGrid(grid,dp,neiRow,neiCol));
            }
        }
        return dp[row][col]=maxi;
    }
    public static int longestIncreasingPath(int[][] grid) {
        int n= grid.length;;
        int m= grid[0].length;;
        int dp[][]=new int[n][m];
        for (int rows[]:
                dp) {
            Arrays.fill(rows,-1);
        }
        int result=0;
int maxi=Integer.MIN_VALUE;
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                maxi=(int)Math.max(maxi,getLISinGrid(grid,dp,i,j));
            }
        }

        return (int)maxi;
    }
}