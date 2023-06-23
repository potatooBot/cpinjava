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
                    System.out.println(ob.minInsertions(Arr,n));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int minInsertions(int nums[], int N) 
	{ 
          int n=nums.length;
        int dp[]=new int[n];
        Arrays.fill(dp,1);
int maxi=-1;

        for (int ind = 0; ind <=n-1 ; ind++) {

            for (int prev_ind = 0; prev_ind <=ind-1 ; prev_ind++) {
                if(nums[ind]>=nums[prev_ind]&&1+dp[prev_ind]>dp[ind]){
                    dp[ind]=1+dp[prev_ind];

                }

            }
maxi=Math.max(maxi,dp[ind]);
        }

        return n-maxi;
	} 
}
