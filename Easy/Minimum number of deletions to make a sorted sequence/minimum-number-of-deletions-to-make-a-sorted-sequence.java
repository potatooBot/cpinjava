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
                    int Arr[] = new int[n];
                    for(int i = 0;i<n;i++)
                        Arr[i] = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.minDeletions(Arr,n));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java
class Solution
{
	public int minDeletions(int arr[], int n) 
	{ 
	   int dp[]=new int[n];
	   Arrays.fill(dp,1);
	for(int ind=0;ind<n;ind++){
	    for(int prev=0;prev<ind;prev++){
	        if(arr[ind]>arr[prev]&&dp[ind]<1+dp[prev]){
	            
	            dp[ind]=1+dp[prev];
	        }
	    }
	}
	int maxi=-1;
	for(int ele:dp){
	    maxi=Math.max(maxi,ele);
	}
	return n-maxi;
	    
	} 
}