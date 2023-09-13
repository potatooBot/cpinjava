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
            Solution ob = new Solution();
            int ans = ob.MinSquares(n);
            System.out.println(ans);           
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public static int getAns(int dp[],int target){
if(target==0){
    return 0;
}

int ans=Integer.MAX_VALUE;
if(dp[target]!=-1) return dp[target];
for(int i=1;i<=(int)Math.sqrt(target);i++){
    ans=Math.min(ans,1+getAns(dp,target-i*i));
}


return dp[target]=ans;
}
    public int MinSquares(int n)
    {

        int dp[]=new int[n+1];
    
    Arrays.fill(dp,-1);

    return getAns(dp,n);
    }
}