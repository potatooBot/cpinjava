package Algorithm.Dynamic_Programming.TwoD_DP;

import java.util.Arrays;

public class gold_mine {
    public static int getMax(int row,int col,int mat[][],int dp[][]){
if(row<0||col<0||row>mat.length-1||col>mat[0].length-1) return Integer.MIN_VALUE;
if(row==0||col==0) return mat[row][col];
if(dp[row][col]!=-1) return dp[row][col];

int left=mat[row][col]+getMax(row,col-1,mat,dp);
int rightdiag=mat[row][col]+getMax(row-1,col-1,mat,dp);
int leftdiag=mat[row][col]+getMax(row+1,col-1,mat,dp);
return dp[row][col]=Math.max(left,Math.max(leftdiag,rightdiag));
    }
    static int maxGold(int n, int m, int M[][])
    {
     int dp[][]=new int[n+1][m+1];
        for (int rows[]:dp) {
            Arrays.fill(rows,-1);
        }
        int max=Integer.MIN_VALUE;
        for (int i = m; i >=0; i--) {
           max= Math.max(max,getMax(i-1,m-1,M,dp));
        }

        // code here
        return max;
    }
    public static void main(String[] args) {
        int mat[][]={{1, 3, 3},
                {2, 1, 4},
                {0, 6, 4}};
        int n=3;
        int m=3;
        int res=maxGold(n,m,mat);
        System.out.println(res);
    }
        }
