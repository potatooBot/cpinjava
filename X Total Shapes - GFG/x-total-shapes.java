//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            char[][] grid = new char[n][m];
            for(int i = 0; i < n; i++){
                String S = br.readLine().trim();
                for(int j = 0; j < m; j++){
                    grid[i][j] = S.charAt(j);
                }
            }
            Solution obj = new Solution();
            int ans = obj.xShape(grid);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends




class Solution
{
    public static void dfs(char grid[][],int row,int col,boolean vis[][]){
        vis[row][col]=true;
        int dr[]={-1,0,1,0};
        int dc[]={0,1,0,-1};
        
        
        for(int i=0;i<4;i++){
            int neiRow=row+dr[i];
            int neiCol=col+dc[i];
            
            if(neiRow>=0&&neiRow<grid.length&&neiCol>=0&&neiCol<grid[0].length&&vis[neiRow][neiCol]==false&&grid[neiRow][neiCol]=='X'){
                dfs(grid,neiRow,neiCol,vis);
            }
        }
        
        
        
    }
    //Function to find the number of 'X' total shapes.
    public int xShape(char[][] grid)
    {
        int n=grid.length;
        int m=grid[0].length;
        boolean  vis[][]=new boolean[n][m];
        
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(vis[i][j]==false&&grid[i][j]=='X'){
                count++;
                    dfs(grid,i,j,vis);
                }
            }
        }
        return count;
    }
}