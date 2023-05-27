//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().findMaxSum(arr, n);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    public static int getSum(int arr[],int dp[],int idx){
        
        if(idx==0) return arr[idx];
        if(idx<0) return 0;
        if(dp[idx]!=-1) return dp[idx];
        
        
        int notpick=0 +getSum(arr,dp,idx-1);
       
       int pick = getSum(arr,dp,idx-2) +arr[idx];
        
        return dp[idx]=Math.max(pick,notpick);
    }
    int findMaxSum(int arr[], int n) {
      int dp[]=new int[n];
      Arrays.fill(dp,-1);
      return getSum(arr,dp,n-1);
    }
}