package Graph;

public class no_of_island_using_dfs {
    public static void dfs(int mat[][],int vis[][],int i,int j){

        int n=mat.length;
        int m=mat[0].length;
        if (i < 0 || j < 0 || i >= n || j >=m || mat[i][j] != 1 || vis[i][j] ==1){
            return;
        }
        else {
            vis[i][j] = 1;
            dfs(mat, vis, i + 1, j);
            dfs(mat, vis, i - 1, j);
            dfs(mat, vis, i, j + 1);
            dfs(mat, vis, i, j - 1);
        }}
    public static void no_of_island_using_DFS(int mat[][]){
        int r=mat.length;
        int c=mat[0].length;
        int vis[][]=new int[r][c];
        int cnt=0;
        for (int i = 0; i <r ; i++) {
            for (int j = 0; j <c ; j++) {
                if(mat[i][j]==1&&vis[i][j]==0){

                    cnt++;
                    dfs(mat,vis,i,j);
                }
            }
        }

        System.out.println(cnt);

    }
    public static void main(String[] args) {
        int mat[][] ={{0,1},{1,0},{1,1},{1,0}};

        no_of_island_using_DFS(mat);
    }
}
