package Matrix_prac;

import java.util.ArrayList;
import java.util.List;

public class spiral_matrix_2 {
    public static int[][] generateMatrix(int n) {
        int ans[][]= new int[n][n];

        boolean vis[][]=new boolean[n][n];
        int r=0;int c=0;int di=0;
        int dr[]={0,1,0,-1};
        int dc[]={1,0,-1,0};
        int val=1;
        for (int i = 0; i <n*n ; i++) {
            vis[r][c]=true;
            ans[r][c]=val;
            int neiRow=r +dr[di];
            int neiCol=c +dc[di];
            if(neiRow>=0&&neiRow<n&&neiCol>=0&&neiCol<n&&vis[neiRow][neiCol]==false){
                r=neiRow;
                c=neiCol;
            }
            else {
                di=(di+1)%4;
                r=r+dr[di];
                c=c+dc[di];
            }
            val++;

        }
        return ans;
    }
    public static void main(String[] args) {
int n= 3;
      int ans[][]=new int[n][n];
        ans=generateMatrix(n);
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                System.out.print(ans[i][j]);
            }
            System.out.println();
        }

    }
}
