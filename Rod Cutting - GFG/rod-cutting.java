//{ Driver Code Starts
import java.io.*;
import java.util.*;

class RodCutting {

    public static void main(String args[])throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        
        int t = Integer.parseInt(in.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(in.readLine().trim());
            String s[]=in.readLine().trim().split(" ");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(s[i]);

            Solution ob = new Solution();
            out.println(ob.cutRod(arr, n));
        }
        out.close();
    }
}

// } Driver Code Ends


class Solution{
    public static int getVal(int dp[][],int price[],int idx,int len){
        
        
        if(idx==0){
            return len*price[0];
        }
        if(dp[idx][len]!=-1) return  dp[idx][len];
        int nottake=0+getVal(dp,price,idx-1,len);
        
        int take=Integer.MIN_VALUE;
        int rodLength=idx+1;
    if(rodLength<=len){
        take=price[idx]+getVal(dp,price,idx,len-rodLength);
    }
    
    return dp[idx][len]=Math.max(take,nottake);
        
    }
    
    
    public int cutRod(int price[], int n) {
        //code here
        int len=price.length;
        int dp[][]=new int[n][len+1];
        for(int rows[]: dp)
        Arrays.fill(rows,-1);
        
        return getVal(dp,price,n-1,len);
    }
}