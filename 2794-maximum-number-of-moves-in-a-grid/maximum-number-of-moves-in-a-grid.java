class Solution {
   public static int memo(int grid[][],int row,int col,int dp[][],int val){
    if(row>=grid.length||col>=grid[0].length){
        return 0;
    }


    if(dp[row][col]!=-1)
        return dp[row][col];

int ans=0;
    for(int i=-1;i<=1;i++){
        if(row+i>=0&&row+i<grid.length&&col+1<grid[0].length&&grid[row+i][col+1]>val)
        ans=Math.max(ans,1+memo(grid,row+i,col+1,dp,grid[row+i][col+1]));
        
    }
dp[row][col]=ans;
    return ans;
}

    public static int maxMoves(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
int dp[][]=new int[n][m];
        for (int rows[]:dp
             ) {
            Arrays.fill(rows,-1);
        }
int ans=0;
        for (int i = 0; i <n ; i++) {
            ans=Math.max(ans,memo(grid,i,0,dp,grid[i][0]));
        }
        return ans;
    }
}