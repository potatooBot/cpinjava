package Graph.Surrounded_regions;

public class surrounded_regions
{
    public static void dfs(char[][] grid,int row,int col,boolean vis[][],int delrow[],int delcol[])
    {
        vis[row][col]=true;

        for (int i = 0; i <4 ; i++) {
            int neirow=row +delrow[i];
            int neicol=col +delcol[i];

            if(neirow>=0&&neirow< grid.length&&neicol>=0&&neicol<grid[0].length&&vis[neirow][neicol]==false&&grid[neirow][neicol]=='O'){

                dfs(grid,neirow,neicol,vis,delrow,delcol);
            }
        }
    }
    static char[][] fill(int n, int m, char grid[][])
    {
        // code here
        boolean vis[][]=new boolean[n][m];
        int delrow[]={-1,0,1,0};
        int delcol[]={0,-1,0,1};
        //Check first row
        for (int j = 0; j <m ; j++) {
            if(grid[0][j]=='O'&&vis[0][j]==false){
                dfs(grid,0,j,vis,delrow,delcol);
            }

            //last row
            if(grid[n-1][j]=='O'&&vis[n-1][j]==false)
            {
                dfs(grid,n-1,j,vis,delrow,delcol);
            }
        }
        for (int i = 0; i <n ; i++) {
            //first column
            if(grid[i][0]=='O'&&vis[i][0]==false){
                dfs(grid,i,0,vis,delrow,delcol);
            }

            //last column
            if(grid[i][m-1]=='O'&&vis[i][m-1]==false)
            {
                dfs(grid,i,m-1,vis,delrow,delcol);
            }
        }
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                if(vis[i][j]==false&&grid[i][j]=='O') {
                    grid[i][j] = 'X';
                }

            }
        }
        for (int i = 0; i < grid.length ; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }
        return grid;
    }
    public static void main(String[] args) {

        char [][] grid = {{'X', 'X', 'X', 'X'},
                {'X', 'O', 'X', 'X'},
                {'X', 'O', 'O', 'X'},
                {'X', 'O', 'X', 'X'},
                {'X', 'X', 'O', 'O'}};
        char ans[][]=fill(grid.length, grid[0].length,grid);
//        for (int i = 0; i < grid.length ; i++) {
//            for (int j = 0; j < grid[0].length; j++) {
//                System.out.print(grid[i][j]+" ");
//            }
//            System.out.println();
//        }
    }
}
