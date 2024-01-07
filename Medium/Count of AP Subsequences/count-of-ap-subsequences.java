//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;

// } Driver Code Ends
//User function Template for Java

class Solution{

    static long count(int N, int nums[])
    {
          int n=nums.length;
    HashMap<Long,Integer> [] dp=new HashMap[n];
long totCount=n+1;
for(int i=0;i<n;i++)
dp[i]=new HashMap<>();


    for(int ind=1;ind<n;ind++){
       for(int prev=0;prev<ind;prev++){
          
      long diff=(long)nums[ind]-(long)nums[prev];


      if(diff>Integer.MAX_VALUE||diff<Integer.MIN_VALUE){
          continue;
      }
      int count=0;
      if(dp[prev].containsKey(diff)){
          count=dp[prev].get(diff);
           

        }
        totCount=totCount+count;


        dp[ind].put(diff,dp[ind].getOrDefault(diff,0)+count+1);
 
      
    }
    
    }
    
    
    for(int i=0;i<n;i++){
      for(int j=i+1;j<n;j++){
    totCount++;    
    }  
    }
 return totCount;   
    }
}

//{ Driver Code Starts.
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            int A[] = new int[N];
            String S[] = read.readLine().split(" ");
            for(int i = 0;i<N;i++)
            {
                A[i] = Integer.parseInt(S[i]);
            }
            Solution ob = new Solution();
            System.out.println(ob.count(N,A));
        }
    }
}

// } Driver Code Ends