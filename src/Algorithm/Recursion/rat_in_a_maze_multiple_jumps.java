package Algorithm.Recursion;

import java.util.ArrayList;

public class rat_in_a_maze_multiple_jumps {
    public static boolean matrixExplore(int mat[][],int row,int col,int size,int visited[][]){
        if(row>=size||col>=size) {
            return false;
        }
        visited[row][col]=1;
        if(row==size-1&&col==size-1) {
            return true;
        }

        int jumps=mat[row][col];
        for (int i = 1; i <=jumps ; i++) {
            if(matrixExplore(mat,row,col+i,size,visited)) {
                return true;
            }
            if(matrixExplore(mat,row+i,col,size,visited)) {
                return true;
            }

        }
        visited[row][col]=0;
        return false;
    }
    public static int[][] ShortestDistance(int[][] matrix)
    {
        // Code here
        int n= matrix.length;
        int vsisted[][]=new int[n][n];
   if(matrixExplore(matrix,0,0,n,vsisted)) return vsisted;
   else return new int[][]{{-1}};

    }
    public static void main(String[] args) {
        int maze[][]= {{2,1,0,0},{3,0,0,1},{0,1,0,1},
                {0,0,0,1}};
        int n= maze.length;
        int res[][] =ShortestDistance(maze);
        for (int i = 0; i < maze.length ; i++) {
            for (int j = 0; j < maze[0].length ; j++) {
                System.out.print(res[i][j]);
            }
            System.out.println();
        }

    }
}
