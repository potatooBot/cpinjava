package Graph.DFS;

public class find_whether_path_exist {
    public static boolean dfs(int grid[][],boolean vis[][],int row,int col,int destRow,int destCol){
        vis[row][col]=true;
        if(row==destRow&&col==destCol) return true;

        int delr[]={-1,0,1,0};
        int delc[]={0,1,0,-1};


        for (int i = 0; i <4 ; i++) {
            int neiRow=row+delr[i];
            int neiCol=col+delc[i];
        if(neiRow>=0&&neiRow< grid.length&&neiCol>=0&&neiCol< grid[0].length&&(grid[neiRow][neiCol]==3||grid[neiRow][neiCol]==2)&&vis[neiRow][neiCol]==false){
            if(dfs(grid,vis,neiRow,neiCol,destRow,destCol)==true) return true;
        }
        }
        return false;
    }

    static   public boolean is_Possible(int[][] grid)
    {
        int n= grid.length;
        int m= grid[0].length;
        int src[]=new int[2];
        int dest[]=new int[2];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                if(grid[i][j]==1){
                    src[0]=i;
                    src[1]=j;
                }
            }
        }

        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 2) {
                    dest[0] = i;
                    dest[1] = j;
                }
            }
        }


        boolean vis[][]=new boolean[n][m];
        boolean ans=dfs(grid,vis,src[0],src[1],dest[0],dest[1]);

        return ans;
    }
    public static void main(String[] args) {
        int grid1[][] = {{3,0,3,0,0},{3,0,0,0,3}
                ,{3,3,3,3,3},{0,2,3,0,0},{3,0,0,1,3}};

        int grid2[][] = {{1,3},{3,2}};
boolean ans =is_Possible(grid1);
        System.out.println(ans);
    }
}
