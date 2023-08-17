package Graph.DFS.Make_Island_Greater;
import java.util.*;
public class make_island_greater {
    public static void dfs(int grid[][],int dr[],int dc[],int sr,int sc,int vis[][],int ans[]){
        vis[sr][sc]=1;
        int n= grid.length;
        int m= grid[0].length;
        for (int i = 0; i <4 ; i++) {
            int neighR=sr+dr[i];
            int neighC=sc+dc[i];
            if(neighR>=0&&neighC>=0&&neighR<n&&neighC<m&&vis[neighR][neighC]==0&&grid[neighR][neighC]==1)
            {
                ans[0]++;
                dfs(grid,dr,dc,neighR,neighC,vis,ans);

            }
        }
    }
    public static int largestIsland(int[][] grid) {
        int dr[]={-1,0,1,0};
        int dc[]={0,-1,0,1};

        int ans[]=new int[1];
        ans[0]=1;

        ArrayList<Integer> list=new ArrayList<>();
        int maxi=-1;
        int vis2[][]=new int[grid.length][grid[0].length];
        for (int i = 0; i < grid.length ; i++) {
            for (int j = 0; j < grid[0].length ; j++) {
                if(grid[i][j]==1&&vis2[i][j]==0)
                {
                    ans[0]=1;
                    dfs(grid,dr,dc,i,j,vis2,ans);
                    maxi=Math.max(maxi,ans[0]);
                }

            }
        }

        for (int i = 0; i < grid.length ; i++) {
            for (int j = 0; j < grid[0].length ; j++) {
                if(grid[i][j]==0)
                {
                    ans[0]=1;
                    int vis[][]=new int[grid.length][grid[0].length];
                    grid[i][j]=1;
                    dfs(grid,dr,dc,i,j,vis,ans);
                    grid[i][j]=0;
                    maxi=Math.max(maxi,ans[0]);


                }
            }
        }

        return maxi;
    }
    public static void main(String[] args) {
//        int grid[][]={{0,0,0,0,0,0,0},{0,1,1,1,1,0,0},{0,1,0,0,1,0,0},{1,0,1,0,1,0,0},{0,1,0,0,1,0,0},{0,1,0,0,1,0,0},{0,1,1,1,1,0,0}};
        int grid[][]={{1,1},{1,0}};
     int ans=   largestIsland(grid);
        System.out.println(ans);

    }

}
