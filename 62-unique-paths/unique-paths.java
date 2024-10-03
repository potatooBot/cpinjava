class Solution {
    public static int memo(int mat[][],int row,int col,int dp[][]){
   
   if(row<0||col<0) return 0;

   //Obstacles
    if(row>=0&&col>=0&&mat[row][col]==1){
    return 0;
}
if(row==0&&col==0) return 1;
if(dp[row][col]!=-1) return dp[row][col];

 int up=memo(mat,row-1,col,dp);
 int left=memo(mat,row,col-1,dp);


 return dp[row][col]=up+left;
}
    public int uniquePaths(int row, int col) {
int mat[][]=new int[row][col];

         int n=mat.length;
        int m=mat[0].length;

        int dp[][]=new int[n][m];

        for(int rows[]:dp){
            Arrays.fill(rows,-1);
        }
       return memo(mat,n-1,m-1,dp);

    }
}