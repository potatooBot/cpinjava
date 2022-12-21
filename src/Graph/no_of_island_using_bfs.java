package Graph;

import java.util.LinkedList;
import java.util.Queue;

public class no_of_island_using_bfs {
   static class pair{
        int first;
        int second;
        public pair(int first,int second){
            this.first=first;
            this.second=second;
        }
    }
    public static void noOfIsland(int mat[][]){
        int r=mat.length;
        int c=mat[0].length;
        int vis[][]=new int[r][c];
        int res=0;
        for (int i = 0; i <r ; i++) {
            for (int j = 0; j <c ; j++) {
                if(mat[i][j]==1&& vis[i][j]==0){
                    bfs(mat,vis,i,j);
                    res++;
                }
            }
        }
        System.out.println("No of islands are "+res);
    }
    public static void bfs(int mat[][],int vis[][],int row,int col){
        vis[row][col]=1;
        Queue <pair> q=new LinkedList<>();

    q.add(new pair(row,col));
int n=mat.length;
int m=mat[0].length;
    while (!q.isEmpty())
    {
        int r=q.peek().first;
        int c=q.peek().second;
        q.remove();

        //Traverse in the neighbour and check for island in 8 directions
        for (int drow = -1; drow <=1 ; drow++) {
            for (int dcol  = -1; dcol <=1 ; dcol++) {
                int irow=r +drow;
                int icol=c +dcol;
//Checking condition is everything is valid or not
                if(irow>=0&&irow<n&&icol>=0&&icol<m&& mat[irow][icol]==1&&vis[irow][icol]==0){
                    vis[irow][icol]=1;
                    q.add(new pair(irow,icol));
                }
            }
        }

    }
    }



    public static void main(String[] args) {
        int mat[][] = new int[][]{{0,1},{1,0},{1,1},{1,0}};
//        System.out.println(noOfIsland(mat));

        noOfIsland(mat);
   }
}




