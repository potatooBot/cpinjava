//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    while (T-- > 0) {
      int n = sc.nextInt();
      int a[] = new int[n];
      for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
      }
      Solution obj = new Solution();
      int ans = obj.maxCoins(n,a);
      System.out.println(ans);
    }
  }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    public static int getMaxi(ArrayList<Integer> ds,int dp[][],int i,int j){
    if(i>j) return 0;
int maxi=Integer.MIN_VALUE;
if(dp[i][j]!=-1) return dp[i][j];
    for(int ind=i;ind<=j;ind++){
int cost=ds.get(i-1)*ds.get(ind)*ds.get(j+1) + getMaxi(ds,dp,i,ind-1) +getMaxi(ds,dp,ind+1,j);
maxi=Math.max(maxi,cost);
    }
    return dp[i][j]=maxi;
}
  public static int maxCoins(int N, int[] nums) {
    int n=nums.length;
    ArrayList<Integer> ds=new ArrayList<>();
    ds.add(1);
    for(int ele:nums) ds.add(ele);
    ds.add(1);
    int dp[][]=new int[n+2][n+2];
for(int rows[]:dp)
Arrays.fill(rows,-1);
    return getMaxi(ds,dp,1,n);

  }
}
     