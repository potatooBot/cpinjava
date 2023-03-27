class Solution {
    public int getMinSum(int row,int col,int grid[][],int dp[][]){
        if(row<0||col<0) return (int)Math.pow(10,9);
        if (row==0&&col==0){
            return grid[row][col];
        }
        if(dp[row][col]!=-1) return dp[row][col];
        
        
        int up=grid[row][col] +getMinSum(row-1,col,grid,dp);
        int left=grid[row][col] +getMinSum(row,col-1,grid,dp);
        return dp[row][col]=Math.min(up,left);
    }
    public int minPathSum(int[][] grid) {
        int a=grid.length;
        int b=grid[0].length;
        int dp[][]=new int[a+1][b+1];
        for(int rows[]:dp){
            Arrays.fill(rows,-1);
        }
        return getMinSum(a-1,b-1,grid,dp);
    }
}