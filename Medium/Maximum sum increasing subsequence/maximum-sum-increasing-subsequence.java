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
                    System.out.println(ob.maxSumIS(Arr,n));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution
{
	public int maxSumIS(int arr[], int n)  
	{  
	          int dp[]=new int[n];
        int maxi=0;
        for (int ind = 0; ind <n ; ind++) {
            dp[ind]=arr[ind];
            for (int prev_ind = 0; prev_ind <ind ; prev_ind++) {
                if(arr[prev_ind]<arr[ind])
                    dp[ind]=Math.max(dp[ind],dp[prev_ind]+arr[ind]);

            }
            maxi=Math.max(dp[ind],maxi);
        }
     

        return maxi;  
	}  
}