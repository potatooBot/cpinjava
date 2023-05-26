package Algorithm.Dynamic_Programming.TwoD_DP;

import java.util.Arrays;

public class as_far_from_land {
    public static int getMaxdis(int grid[][],int row,int col,int dp[][],int vis[][]){

        if(row<0||col<0||row>=grid.length||col>= grid.length||vis[row][col]==1){
            return (int)Math.pow(-10,5);
        }

        if(grid[row][col]==1) return 0;

        if(dp[row][col]!=-1) return dp[row][col];
        vis[row][col]=1;

        int left= (Math.abs(col-(col-1))+0)+getMaxdis(grid,row,col-1,dp,vis);
        int right= (Math.abs(col-(col+1))+0)+getMaxdis(grid,row,col+1,dp,vis);

        int up= (Math.abs(row-(row-1))+0)+getMaxdis(grid,row-1,col,dp,vis);


        int down= (Math.abs(row-(row+1))+0)+getMaxdis(grid,row+1,col,dp,vis);
        vis[row][col]=0;
        return dp[row][col]=Math.max(Math.max(up,down),Math.max(left,right));
    }
    public static int maxDistance(int[][] grid) {
      int n= grid.length;
int vis[][]=new int[n][n];
        int dp[][]=new int[n+1][n+1];
        for (int rows[]:
                dp) {
            Arrays.fill(rows,-1);
        }
        int max=Integer.MIN_VALUE;
        for (int i = grid.length-1; i >=0 ; i--) {

            for (int j = grid.length-1; j >=0 ; j--) {
                if(grid[i][j]!=1) {
                    max=Math.max(max,getMaxdis(grid,i,j,dp,vis));
                }
            }
            }

//            for (int i = 0; i <grid.length ; i++) {
//            for (int j = 0; j <n ; j++) {
//                System.out.print(dp[i][j]+" ");
//            }
//                System.out.println();
//        }


return max;
    }
    public static void main(String[] args) {
        int grid[][] = {{1,0,0},{0,0,0},{0,0,0}};
        int ans=maxDistance(grid);
        System.out.println(ans);
    }
}
