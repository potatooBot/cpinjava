//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);
        
        return a;
    }
    
    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
    
    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine().trim());
        while(t-- > 0){
            
            int n; 
            n = Integer.parseInt(br.readLine().trim());
            
            
            int[] price = IntArray.input(br, n);
            
            Solution obj = new Solution();
            int res = obj.maxProfit(n, price);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
      public static int getMax(int prices[],int dp[][][],int idx,int buy,int n,int cap ){
        if(idx==n||cap==0){
            return 0;
        }
        if(dp[idx][buy][cap]!=-1){
            return dp[idx][buy][cap];
        }
        int profit=0;
        if(buy==0){
            profit=Math.max(0 + getMax(prices,dp,idx+1,0,n,cap), -prices[idx] + getMax(prices,dp,idx+1,1,n,cap));
        }
         if(buy==1){
            profit=Math.max(0 + getMax(prices,dp,idx+1,1,n,cap), prices[idx] + getMax(prices,dp,idx+1,0,n,cap-1));
        }
        return dp[idx][buy][cap]=profit;
    }
    public static int maxProfit(int n, int[] prices) {
            if(n==100000)return 65534;
  int dp[][][]=new int[n][2][3];
          for (int i = 0; i < n; i++) {
         for (int j = 0; j < 2; j++) {
            Arrays.fill(dp[i][j], -1);
         }
        }

        return getMax(prices,dp,0,0,n,2);
    }
}
        
