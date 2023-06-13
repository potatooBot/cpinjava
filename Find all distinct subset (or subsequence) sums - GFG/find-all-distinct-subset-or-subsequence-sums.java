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
            String[] s = br.readLine().trim().split(" ");
            int[] nums = new int[n];
            for(int i = 0; i < n; i++)
                nums[i] = Integer.parseInt(s[i]);
            Solution obj = new Solution();
            int[] ans = obj.DistinctSum(nums);
            for(int i = 0; i < ans.length; i++)
                System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
      public static boolean getSubsetUtil(int arr[],int dp[][],int n,int target,int idx){

        if(target==0) return true;
        if(idx==0){
            return target==arr[0];
        }
if(dp[idx][target]!=-1){
    return dp[idx][target]==0?false:true;
}

      boolean notake= getSubsetUtil(arr,dp,n,target,idx-1);
        boolean take=false;
        if(arr[idx]<=target){
            take=getSubsetUtil(arr,dp,n,target-arr[idx],idx-1);
        }
        dp[idx][target]=take||notake?1:0;
        return take||notake;
    }

    static  public int[] DistinctSum(int[] nums)
    {

       int sum=0;
        for (int i = 0; i <nums.length ; i++) {
            sum+=nums[i];
        }
        int idx=0;
int n= nums.length;
        int dp[][]=new int[n][sum+1];
        for (int rows[]:
           dp  ) {
            Arrays.fill(rows,-1);
        }
ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i <=sum ; i++) {

if(getSubsetUtil(nums,dp,n,i,n-1)){
    list.add(i);
}

        }
        int ans[]=new int[list.size()];
        for (int ele:
                list) {
            ans[idx++]= ele;
        }
       return ans;
    }
}