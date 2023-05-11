//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GfG { 
    
	public static void main (String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    String inputLine[] = br.readLine().trim().split(" ");
		    int m = Integer.parseInt(inputLine[0]);
		    int n = Integer.parseInt(inputLine[1]);
		    Solution ob = new Solution();
		    System.out.println(ob.numberOfPaths(m, n));
		}
	}
}




// } Driver Code Ends


class Solution{
      public static long getWays(int row,int col,long dp[][]){
        if(row==0&&col==0) return 1;
        if(row<0||col<0) return 0;

        if(dp[row][col]!=-1) return dp[row][col];
        long up=getWays(row-1,col,dp);
        long left=getWays(row,col-1,dp);

      return dp[row][col]=up+left;
          
      }
    long numberOfPaths(int m, int n) {
               long dp[][]=new long[m][n];
            //   int grid[][]=new int[n][m];
for(long []row: dp){

Arrays.fill(row,-1);
}
// for(int []row: grid){

// Arrays.fill(row,1);
// }
return getWays(m-1,n-1,dp);
    }
    
}