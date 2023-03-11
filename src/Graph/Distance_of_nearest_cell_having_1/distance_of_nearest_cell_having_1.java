package Graph.Distance_of_nearest_cell_having_1;

import java.util.LinkedList;
import java.util.Queue;
class pair{
    int row,col,dist;
    public pair(int row,int col,int dist){
        this.row=row;
        this.col=col;
        this.dist=dist;
    }
}

public class distance_of_nearest_cell_having_1 {
    public static int[][] nearest(int[][] grid)
    {
        // Code here
int n= grid.length;
int m= grid[0].length;

        Queue<pair> q=new LinkedList<>();
        int dist[][]=new int[n][m];
        boolean vis[][]=new boolean[n][m];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                if(grid[i][j]==1)
                {
                    q.add(new pair(i,j,0));
                    vis[i][j]=true;
                }
                else {
                    vis[i][j] = false;
                }
            }
        }
        int delrow[]={-1,0,1,0};
        int delcol[]={0,-1,0,1};
        while (!q.isEmpty())
        {
            int r=q.peek().row;
            int c=q.peek().col;
            int steps=q.peek().dist;
            q.remove();
            dist[r][c]=steps;
            for (int i = 0; i <4 ; i++) {
                int neirow = r + delrow[i];
                int neicol = c + delcol[i];
                if (neirow >= 0 && neirow < n && neicol >= 0 && neicol < m && vis[neirow][neicol] == false) {
                    q.add(new pair(neirow, neicol, steps + 1));
                    vis[neirow][neicol] = true;
                }
            }
        }
        return dist;
    }
    public static void main(String[] args) {
       int grid[] []= {{0,1,1,0},{1,1,0,0},{0,0,1,1}};
       int ans[][]=nearest(grid);
        for (int i = 0; i < ans.length ; i++) {
            for (int j = 0; j < ans[0].length ; j++) {
                System.out.print (ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
