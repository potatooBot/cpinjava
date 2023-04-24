package Matrix_prac;

import java.util.ArrayList;
import java.util.List;


public class spiral_matrix {
    static   public List<Integer> spiralOrder(int[][] matrix) {
List <Integer> ans=new ArrayList<>();
int rowLen=matrix.length;
int colLen=matrix[0].length;
boolean vis[][]=new boolean[rowLen][colLen];
int r=0;int c=0;int di=0;
int dr[]={0,1,0,-1};
int dc[]={1,0,-1,0};
        for (int i = 0; i <rowLen*colLen ; i++) {
            vis[r][c]=true;
            ans.add(matrix[r][c]);
            int neiRow=r +dr[di];
            int neiCol=c +dc[di];
            if(neiRow>=0&&neiRow<rowLen&&neiCol>=0&&neiCol<colLen&&vis[neiRow][neiCol]==false){
                r=neiRow;
                c=neiCol;
            }
            else {
                di=(di+1)%4;
                r=r+dr[di];
                c=c+dc[di];
            }


        }
    return ans;
    }

    public static void main(String[] args) {
        int [][]  matrix = {{1,2,3},{4,5,6},{7,8,9}};
List<Integer> ans=new ArrayList<>();
ans=spiralOrder(matrix);
        System.out.println(ans);
    }
}
