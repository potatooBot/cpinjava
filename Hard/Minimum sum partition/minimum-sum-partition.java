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
                    int A[] = new int[n];
                    for(int i = 0;i<n;i++)
                        A[i] = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.minDifference(A,n));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution
{

	public int minDifference(int arr[], int n) 
	{ 
	   int totSum=0;
	   for(int ele:arr)
	   totSum+=ele;
	
	    boolean dp[][]=new boolean[n][totSum+1];
	    
	    
	    for(int i=0;i<n;i++) dp[i][0]=true;
	    
	    if(totSum<=arr[0])
	    {
	        dp[0][arr[0]]=true;
	    }
	    
	    
	    for(int ind=1;ind<n;ind++){
	        
	        for(int target=1;target<=totSum;target++){
	            boolean notTake=dp[ind-1][target];
	            boolean take=false;
	            
	            if(arr[ind]<=target){
	               take= dp[ind-1][target-arr[ind]];
	            }
	            dp[ind][target]=take|notTake;
	        }
	    }
	    int mini=(int)1e9;
	    
	    
	    for(int s1=1;s1<=totSum;s1++){
	        if(dp[n-1][s1]==true){
	            mini=Math.min(mini,Math.abs((totSum-s1)-s1));
	        }

	    }
return mini;
	} 
	
}
