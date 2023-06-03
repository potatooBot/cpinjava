package Algorithm.Dynamic_Programming.One_D_Dp.Memoization;

import java.util.Arrays;

public class zero_one_mat {
    public static int getWays(int mat[][],int row,int col,int dp[][]){
        if(row<0||col<0||row>= mat.length||col>=mat[0].length||mat[row][col]!=1){
            return 0;
        }
        if(mat[row][col]==0)
            return 0;
        if(dp[row][col]!=-1)
            return dp[row][col];
        int store=mat[row][col];
        mat[row][col]=Integer.MAX_VALUE;
        int left=store+getWays(mat,row,col-1,dp);
        int right=store+getWays(mat,row,col+1,dp);
        int up=store+getWays(mat,row-1,col,dp);
        int down=store+getWays(mat,row+1,col,dp);

        mat[row][col]=store;
       return dp[row][col]=Math.min(Math.max(right,left),Math.max(up,down));
    }
    public static int[][] updateMatrix(int[][] mat) {
        int n= mat.length;;
        int m= mat[0].length;
int ans[][]=new int[n][m];
        int dp[][]=new int[n][m];
        for (int [] rows:
            dp ) {
            Arrays.fill(rows,-1);
        }
        for (int i = n; i > 0; i--) {
            for (int j = m; j >0 ; j--) {
                if(mat[i-1][j-1]==0) {
                    ans[i-1][j-1]=0;
                }
                else {
                    int st=getWays(mat,i-1,j-1,dp);
                    ans[i-1][j-1]=st;
                }

            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int [][]mat = {{0,0,0},{0,1,0},{1,1,1}};
int res[][]=updateMatrix(mat);
        for (int i = 0; i < mat.length ; i++) {
            for (int j = 0; j < mat[0].length ; j++) {
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
        }
}
