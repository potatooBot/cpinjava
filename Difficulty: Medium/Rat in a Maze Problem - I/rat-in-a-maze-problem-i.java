//{ Driver Code Starts
// Initial Template for Java

import java.util.*;

class Rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();

            Solution obj = new Solution();
            ArrayList<String> res = obj.findPath(a);
            Collections.sort(res);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++) System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}

// } Driver Code Ends


class Solution {
    
    public static void backtrack(boolean vis[][],int row,int col,String dir,ArrayList<String> ans,int mat[][]){
        int n=mat.length;
        if(row==n-1&&col==n-1){
            ans.add(dir);
            return;
        }
        
    String move="DLRU";
        int dr[]={1,0,0,-1};
        int dc[]={0,-1,1,0};
        
        
        for(int i=0;i<4;i++){
            int neiRow= row +dr[i];
            int neiCol=col + dc[i];
            
            if(neiRow>=0&&neiRow<n&&neiCol>=0&&neiCol<n&&vis[neiRow][neiCol]==false&&mat[neiRow][neiCol]==1){
                vis[row][col]=true;
                backtrack(vis,neiRow,neiCol,dir+move.charAt(i),ans,mat);
                vis[row][col]=false;
            }
        }
        
    }
    public ArrayList<String> findPath(int[][] mat) {
       
       ArrayList<String> ans=new ArrayList<>();
      // if(mat[0][0]==0) return ans;
     int n=mat.length;
     boolean vis[][]=new boolean[n][n];
       if(mat[0][0]==1){
           backtrack(vis,0,0,"",ans,mat);
       }
       
       return ans;
       
    }
}