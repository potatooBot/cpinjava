package Graph.DFS;

public class no_of_closed_island {
    static void dfs(int row,int col,boolean vis[][],int grid[][]){

        vis[row][col]=true;

        int dr[]={-1,0,1,0};
        int dc[]={0,1,0,-1};

        for (int i = 0; i <4 ; i++) {
            int neiRow=row+dr[i];
            int neiCol=col+dc[i];

            if (neiRow>=0&&neiRow< grid.length&&neiCol>=0&&neiCol<grid[0].length&&vis[neiRow][neiCol]==false&&grid[neiRow][neiCol]==0)
            {
                dfs(neiRow,neiCol,vis,grid);
            }
        }
    }
    static    public int closedIsland(int[][] grid) {
int n= grid.length;;
int m=grid[0].length;
boolean vis[][]=new boolean[n][m];
        for (int j = 0; j <m ; j++) {
  if(grid[0][j]==0&&vis[0][j]==false){
      dfs(0,j,vis,grid);
  }
            if(grid[n-1][j]==0&&vis[0][j]==false){
                dfs(n-1,j,vis,grid);
            }
        }

        for (int i = 0; i <n ; i++) {
            if(grid[i][0]==0&&vis[i][0]==false){
                dfs(i,0,vis,grid);
            }
            if(grid[i][m-1]==0&&vis[i][m-1]==false){
                dfs(i,m-1,vis,grid);
            }

        }
        int count=0;
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                if(grid[i][j]==0&&vis[i][j]==false){
                    count++;
                    dfs(i,j,vis,grid);
                }
            }
        }


        return count;
    }


    public static void main(String[] args) {
        int [][]     grid = {{1,1,1,1,1,1,1,0},{1,0,0,0,0,1,1,0},{1,0,1,0,1,1,1,0},{1,0,0,0,0,1,0,1},{1,1,1,1,1,1,1,0}};
    int ans=closedIsland(grid);
        System.out.println(ans);

    }
}
