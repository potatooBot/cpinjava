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
                    int n = sc.nextInt();
                    int sum = sc.nextInt();
                    int arr[] = new int[n];
                    for(int i = 0;i<n;i++)
                    arr[i] = sc.nextInt();
                    
                    Solution ob = new Solution();
                    System.out.println(ob.perfectSum(arr,n,sum));
                }
        }
}    
// } Driver Code Ends


class Solution{
    
    
    public static int getSubset(int arr[],int idx,int target,int dp[][]){
        if(idx==0){
	        if(target==0 && arr[0]==target) return 2;
	        else if(arr[0]==target || target==0) return 1;
	        else return 0;
	    }
	    
	    if(dp[idx][target]!=-1) return dp[idx][target];
	    int notTake = getSubset(arr,idx-1,target,dp);
	    int take = 0;
	    if(arr[idx]<=target) take =getSubset(arr,idx-1,target-arr[idx],dp);
	    
	    return dp[idx][target] = (notTake + take)%1000000007;
    }

	public int perfectSum(int arr[],int n, int sum) 
	{ 
	    // Your code goes here
	    int dp[][]=new int[n][sum+1];
	    for(int row[]:dp) Arrays.fill(row,-1);
	   
	    return getSubset(arr,n-1,sum,dp);
	    
	} 
}