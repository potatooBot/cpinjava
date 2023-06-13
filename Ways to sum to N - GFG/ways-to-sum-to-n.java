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
                    int m = sc.nextInt();
                    int N = sc.nextInt();
                    int Arr[] = new int[m];
                    for(int i = 0;i<m;i++)
                        Arr[i] = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.countWays(Arr,m,N));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution
{
      public static int getSubsetUtil(int arr[],int dp[],int n,int target,int idx){
       if(target<0||idx<0)
           return 0;
        if(target==0) return 1;

        if(dp[target]!=-1) {
            return dp[target];
        }
    int count=0;
        int mod=(int) (Math.pow(10,9)+7);
        for (int i = 0; i <n ; i++) {
            count=(count +getSubsetUtil(arr,dp,n,target-arr[i],idx))%mod;
        }
        return dp[target]=count;
    }
    static public int countWays(int arr[], int n, int k)
    {
        int dp[]=new int[k+1];

            Arrays.fill(dp,-1);

        return getSubsetUtil(arr,dp,n,k,n-1);
    }
}