package Graph.DFS.Find_Closed_Island;

public class find_closed_island {
    public static void dfs(int [][] mat,boolean vis[][],int row,int col){
        vis[row][col]=true;

        int delrow[]={-1,0,1,0};
        int delcol[]={0,1,0,-1};
        for (int i = 0; i <4 ; i++) {
            int neiRow=row+delrow[i];
            int neiCol=col+delcol[i];
if(neiRow>=0&&neiCol>=0&&neiRow< mat.length&&neiCol<mat[0].length&&vis[neiRow][neiCol]==false&&mat[neiRow][neiCol]==1){
    dfs(mat,vis,neiRow,neiCol);
}
        }
    }
    static public int closedIslands(int[][] matrix, int n, int m)
    {
        boolean vis[][]=new boolean[n][m];

        for (int i = 0; i <n ; i++) {
            if(vis[i][0]==false&&matrix[i][0]==1){
                dfs(matrix,vis,i,0);
            }
            if(vis[i][m-1]==false&&matrix[i][m-1]==1){
                dfs(matrix,vis,i,m-1);
            }
        }

        for (int j = 0; j <m ; j++) {
            if(vis[0][j]==false&&matrix[0][j]==1){
                dfs(matrix,vis,0,j);
            }
            if(vis[n-1][j]==false&&matrix[n-1][j]==1){
                dfs(matrix,vis,n-1,j);
            }
        }
        int count=0;
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                if(vis[i][j]==false&&matrix[i][j]==1){
                    count++;
                dfs(matrix,vis,i,j);
                }
            }
        }
        return count;// Code here
    }
    public static void main(String[] args) {
        int N = 5, M = 8;
        int mat[][] = {{0, 0, 0, 0, 0, 0, 0, 1},
            {0, 1, 1, 1, 1, 0, 0, 1},
            {0, 1, 0, 1, 0, 0, 0, 1},
            {0, 1, 1, 1, 1, 0, 1, 0},
            {1, 0, 0, 0, 0, 1, 0, 1}};
        int ans=closedIslands(mat,N,M);
        System.out.println(ans);
    }
}
