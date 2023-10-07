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
                    String X = sc.next();
                    String Y = sc.next();
                    int costX = sc.nextInt();
                    int costY = sc.nextInt();
                    
                   
                    Solution ob = new Solution();
                    System.out.println(ob.findMinCost(X,Y,costX,costY));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public static int lcs(String str1,String str2,int dp[][],int idx1,int idx2){
        if(idx1<0||idx2<0) return 0;
        if(dp[idx1][idx2]!=-1) return dp[idx1][idx2];
     
        if(str1.charAt(idx1)==str2.charAt(idx2)){
            return dp[idx1][idx2]=1 +lcs(str1,str2,dp,idx1-1,idx2-1);
        }
        else{
            return dp[idx1][idx2]=Math.max(lcs(str1,str2,dp,idx1-1,idx2),lcs(str1,str2,dp,idx1,idx2-1));
        }
       
    }
	public int findMinCost(String str1, String str2, int cA, int cB)
	
	{
		int n=str1.length();
		int m=str2.length();
		
	int dp[][]=new int[n][m];
	for(int rows[]:dp)
	Arrays.fill(rows,-1);
	
int val= lcs(str1,str2,dp,n-1,m-1);
return (n-val)*cA +(m-val)*cB;	
	}
}
