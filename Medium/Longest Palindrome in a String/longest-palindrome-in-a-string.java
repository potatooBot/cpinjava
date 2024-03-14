//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.longestPalin(S));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static String longestPalin(String str){
      int n=str.length();
      boolean dp[][]=new boolean[n][n];
      String ans="";
      int maxi=-1;
      for(int gap=0;gap<n;gap++){
          
          for(int i=0,j=gap;j<n;j++,i++){
              if(gap==0){
                  dp[i][j]=true;
              }
              else if(gap==1){
                  if(str.charAt(i)==str.charAt(j))
                  dp[i][j]=true;
              }
              else {
                  if(str.charAt(i)==str.charAt(j)&&dp[i+1][j-1]==true){
                      dp[i][j]=true;
                  }
              
                
              }
                if(dp[i][j]==true){
                  int val=j-i+1;
                  if(maxi<val){
                      maxi=val;
                      ans=str.substring(i,j+1);
                  }
                  }
              
          }
      }
        return ans;
    }
}