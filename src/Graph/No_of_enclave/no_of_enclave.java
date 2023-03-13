//You are given an n x m binary matrix grid, where 0 represents a sea cell and 1 represents a land cell.
//
//        A move consists of walking from one land cell to another adjacent (4-directionally) land cell or walking off the boundary of the grid.
//
//        Find the number of land cells in grid for which we cannot walk off the boundary of the grid in any number of moves.
//
//        Example 1:
//
//        Input:
//        grid[][] = {{0, 0, 0, 0},
//        {1, 0, 1, 0},
//        {0, 1, 1, 0},
//        {0, 0, 0, 0}}
//        Output:
//        3
//        Explanation:
//        0 0 0 0
//        1 0 1 0
//        0 1 1 0
//        0 0 0 0
//        The highlighted cells represents the land cells.
//        Example 2:
//
//        Input:
//        grid[][] = {{0, 0, 0, 1},
//        {0, 1, 1, 0},
//        {0, 1, 1, 0},
//        {0, 0, 0, 1},
//        {0, 1, 1, 0}}
//        Output:
//        4
//        Explanation:
//        0 0 0 1
//        0 1 1 0
//        0 1 1 0
//        0 0 0 1
//        0 1 1 0
//        The highlighted cells represents the land cells.


package Graph.No_of_enclave;

public class no_of_enclave {
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
    static int numberOfEnclaves(int[][] grid) {
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
    public static void main(String[] args) {
       int grid[][] ={{0, 0, 0, 0},
               {1, 0, 1, 0},
               {0, 1, 1, 0},
               {0, 0, 0, 0}};
       int ans=numberOfEnclaves(grid);
        System.out.println(ans);
    }
}
