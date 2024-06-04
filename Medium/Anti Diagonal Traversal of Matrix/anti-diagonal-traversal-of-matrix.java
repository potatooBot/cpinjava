//{ Driver Code Starts
//Initial Template for Java

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
            int n = Integer.parseInt(br.readLine().trim());
            
            String input_line[] = br.readLine().trim().split("\\s+");
            int[][] matrix = new int[n][n];
            for(int i=0; i<n; i++) {
                for (int j = 0; j < n; ++j) {
                    matrix[i][j] = Integer.parseInt(input_line[i * n + j]); 
                }
            }
            Solution obj = new Solution();
            int[] ans = obj.antiDiagonalPattern(matrix);
            for(int i = 0; i < ans.length; i++)
                System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public static void getDiag(int mat[][],ArrayList<Integer> ds,int row,int col,boolean vis[][]){
        if(row<0) return;
        vis[row][col]=true;
       ds.add(mat[row][col]);
        int neiRow=row+ 1;
        int neiCol=col-1;
        
        if(neiRow>=0&&neiRow<mat.length&&neiCol>=0&&neiCol<mat[0].length&&vis[neiRow][neiCol]==false){
           
            getDiag(mat,ds,neiRow,neiCol,vis);
        }
        
        
    }
    public int[] antiDiagonalPattern(int[][] mat)
    {
        boolean vis[][]=new boolean[mat.length][mat[0].length];
     // System.out.println(Arrays.toString(vis[0]));
        ArrayList<Integer> ds=new ArrayList<>();
    for(int i=0;i<mat.length;i++){
        for(int j=0;j<mat[0].length;j++){
            if(vis[i][j]==false){
            getDiag(mat,ds,i,j,vis);
            }
        }
    }
int ans[]=new int[ds.size()];
//System.out.println(ds);

for(int i=0;i<ds.size();i++) ans[i]=ds.get(i);

return ans;
    }
}