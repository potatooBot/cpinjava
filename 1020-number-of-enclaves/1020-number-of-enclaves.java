class Solution {
    public static void dfs(int row,int col,boolean vis[][],int grid[][],int delrow[],int delcol[]){
        vis[row][col]=true;

int n= grid.length;
int m= grid[0].length;
        for (int i = 0; i <4 ; i++) {
            int neirow=row+delrow[i];
            int neicol=col+delcol[i];
        if(neirow>=0&&neirow<n&&neicol>=0&&neicol<m&&vis[neirow][neicol]==false&&grid[neirow][neicol]==1){
            dfs(neirow,neicol,vis,grid,delrow,delcol);
        }


        }


    }
    public int numEnclaves(int[][] grid) {
        int delrow[]={-1,0,1,0};
int delcol[]={0,-1,0,1};
        // Your code here
        int n= grid.length;
        int m= grid[0].length;
        boolean vis[][]=new boolean[n][m];
        for (int j = 0; j <m ; j++) {
            if (grid[0][j] == 1 && vis[0][j] == false) {
                dfs(0, j, vis, grid, delrow, delcol);
            }


            if (grid[n - 1][j] == 1 && vis[n - 1][j] == false) {
                dfs(n - 1, j, vis, grid, delrow, delcol);

            }
        }

         for (int i = 0; i <n ; i++) {
            if(grid[i][0]==1&&vis[i][0]==false) {
                dfs(i,0,vis,grid,delrow,delcol);
            }

           if(grid[i][m-1]==1&&vis[i][m-1]==false) {
                dfs(i,m-1,vis,grid,delrow,delcol);
            }
        }
        int count=0;
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                if (vis[i][j]==false&&grid[i][j]==1)
                {
                    count++;
                }
            }
        }


        return count;
    }
}