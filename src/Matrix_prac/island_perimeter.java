package Matrix_prac;

public class island_perimeter {
    public static void dfs(int grid[][],int dr[],int dc[],int sr,int sc,int vis[][],int ans[]){
        vis[sr][sc]=1;
        int n= grid.length;
        int m= grid[0].length;
        int count=0;
        for (int i = 0; i <4 ; i++) {
            int neighR=sr+dr[i];
            int neighC=sc+dc[i];
        if(grid[sr][sc]==1&&(neighR>=n||neighC>=m||neighR<0||neighC<0||grid[neighR][neighC]==0))
            {
             // System.out.print(neighR+" "+neighC);
                count++;
            }
          // System.out.println();

        }
       System.out.println(count);
   ans[0]=ans[0]+count;
        for (int i = 0; i <4 ; i++) {
            int neighR=sr+dr[i];
            int neighC=sc+dc[i];
            if(neighR>=0&&neighC>=0&&neighR<n&&neighC<m&&vis[neighR][neighC]==0&&grid[neighR][neighC]==1)
            {
               dfs(grid,dr,dc,neighR,neighC,vis,ans);
            }
        }
    }
    public static void main(String[] args) {
//        int [][]grid = {{0,1,0,0},
//                      {1,1,1,0},
//                      {0,1,0,0},
//                      {1,1,0,0}};
        int grid[][]={{1,0}};
        int dr[]={-1,0,1,0};
        int dc[]={0,-1,0,1};
        int vis[][]=new int[grid.length][grid[0].length];
        int ans[]=new int[1];
        for (int i = 0; i < grid.length ; i++) {
            for (int j = 0; j < grid[0].length ; j++) {
                if(grid[i][j]==1&&vis[i][j]==0)
                dfs(grid,dr,dc,i,j,vis,ans);
            }
        }
        System.out.println(ans[0]);

    }
}
