//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG{
    public static void main(String args[]) throws IOException{
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int N=sc.nextInt();
            int K=sc.nextInt();
            int []arr=new int[N];
            for(int i=0;i<N;i++){
                arr[i]=sc.nextInt();
            }
            Solution obj=new Solution();
            int res=obj.minimizeCost(arr,N,K);
            System.out.println(res);
            
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    public static int getAns(int arr[],int k,int idx,int dp[]){
        if(idx==0) return 0;
        if(dp[idx]!=-1) return dp[idx];
        
    int minStep=10000000;
        
        int jump=0;
        for(int i=1;i<=k;i++){
            if(idx-i>=0){
            jump=getAns(arr,k,idx-i,dp) +Math.abs(arr[idx]-arr[idx-i]);
        
            minStep=Math.min(minStep,jump);
        }
        }
        
        return dp[idx]=minStep;
    }
    public int minimizeCost(int arr[],int N,int k){
       int dp[]=new int [N];
       
       Arrays.fill(dp,-1);
       
       
       return getAns(arr,k,N-1,dp);
    }
}
