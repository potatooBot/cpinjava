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
      int ans = obj.solve(a);
      System.out.println(ans);
    }
  }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    static int solve(int bt[] ) {
  int ans=0;
  Arrays.sort(bt);
  int prev=0;
  int n=bt.length;
  int ct[]=new int[n];
  for(int i=0;i<bt.length;i++){
prev=prev+bt[i];
ct[i]=prev;

  }

  int wt[]=new int[n];
//System.out.println(Arrays.toString(bt));
//System.out.println(Arrays.toString(ct));
int tot=0;  
   for(int i=0;i<bt.length;i++)
tot=tot+(ct[i]-bt[i]);

  return tot/n;
  }
}
     