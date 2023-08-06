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
            String s = br.readLine().trim();
            String[] S1 = s.split(" ");
            int n = Integer.parseInt(S1[0]);
            int m = Integer.parseInt(S1[1]);
            Solution ob = new Solution();
            int ans = ob.NthRoot(n, m);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{  public static long findVal(long mid,int n,int m){
  long ans=1;
        for (int i =1; i <=n ; i++) {
            ans= ans*mid;
            if(ans>m) return 2;
        }
        if(ans==m) {
            return 1;
        }

        return 0;
    }
    static public int NthRoot(int n, int m)
    {
        long low=1;
        long high=m;
        long ans=-1;
        while (low<=high){
            long mid=(low+high)/2;

if(findVal(mid,n,m)==1){
    return (int) mid;
}
else if(findVal(mid,n,m)==2){
    high=mid-1;
}
else {
    low=mid+1;
}
        }

        return -1;
    }
}