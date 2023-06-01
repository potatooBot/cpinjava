class Solution {
 
    int dp[][][];
    public int numberOfPaths(int[][] grid, int k) {
        
        dp = new int [grid.length][grid[0].length][50];
        
        for(int [][] matrix: dp)
            for(int [] arr: matrix)
                Arrays.fill(arr,-1);
        
        
        return t(grid,0,0,grid.length,grid[0].length,0, k);
        
       
    }
    
    int t(int [][] grid,int row, int col, int noOfRows, int noOfCols, int sum, int k){
        
        if(row<0 || row==noOfRows ||
          col<0 || col==noOfCols){
            return 0;
        }
        sum += grid[row][col];
        
        if(row==noOfRows-1 && col==noOfCols-1){
            return sum%k==0?1:0;
        }
        
        if(dp[row][col][sum%k]!=-1){
            return dp[row][col][sum%k];
        }
        
        dp[row][col][sum%k] = (t(grid,row+1,col,noOfRows, noOfCols,sum, k) + t(grid,row,col+1,noOfRows, noOfCols,sum, k))%1000000007;
        return dp[row][col][sum%k];
    }
}