//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int N=sc.nextInt();
                    String S=sc.next();
                        
                    Solution obj = new Solution();
                    
                    
                    System.out.println(obj.CountPS(S,N));
                    
                }
                
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int CountPS(String s, int N)
    {
             int n=s.length();
        int cnt=0;
        boolean dp[][]=new boolean[s.length()][s.length()];
    for(int g=0;g<n;g++){
for(int i=0,j=g;j<n;i++,j++){
    if(g==0){
        dp[i][j]=true;
    }
    else if(g==1){
        if(s.charAt(i)==s.charAt(j))
        {
            dp[i][j]=true;
        }
    }
    else {
        if(s.charAt(i)==s.charAt(j)&&dp[i+1][j-1]==true){
            dp[i][j]=true;
        }
    }
    if(dp[i][j]==true&&g!=0)
    {
        cnt++;
    }
}

    }
return cnt;
    }
}