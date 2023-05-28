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
            int []arr=new int[N];
            for(int i=0;i<N;i++){
                arr[i]=sc.nextInt();
            }
            Solution obj=new Solution();
            ArrayList<Integer>ans=obj.longestIncreasingSubsequence(N, arr);
            for(int i=0;i<ans.size();i++){
                System.out.print(ans.get(i)+" ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    public ArrayList<Integer> longestIncreasingSubsequence(int n, int arr[]){
                // Code here
        ArrayList<Integer> ans=new ArrayList<>();

        int dp[]=new int[n];
        Arrays.fill(dp,1);
int hash[]=new int[n];
Arrays.fill(hash,1);

        for (int ind = 0; ind <=n-1 ; ind++) {
            hash[ind]=ind;
            for (int prev = 0; prev <=ind-1 ; prev++) {

                if(arr[prev]<arr[ind]&&1+dp[prev]>dp[ind]){
                    hash[ind]=prev;
           dp[ind]=1+dp[prev];
                }
            }
        }

        int maxi=-1;

        int lastIndex=-1;
        for (int i = 0; i <=n-1 ; i++) {
            if (dp[i]>maxi){
                maxi=dp[i];
                lastIndex=i;

            }
        }
ans.add(arr[lastIndex]);
        while (hash[lastIndex]!=lastIndex){
        lastIndex=hash[lastIndex];
            ans.add(arr[lastIndex]);
        }
        Collections.reverse(ans);
        return ans;
    }
}
