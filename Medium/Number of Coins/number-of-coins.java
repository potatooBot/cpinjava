//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int v = sc.nextInt();
                    int m = sc.nextInt();
                    int coins[] = new int[m];
                    for(int i = 0;i<m;i++)
                        coins[i] = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.minCoins(coins, m, v));
                }
        }
}    
// } Driver Code Ends


class Solution{

    public static int getMinCoins(int coins[],int target,int dp[][],int idx,int min[]){




    

        if(idx==0) {
    if(target%coins[0]==0){
        return target/coins[0];
    }
    else return (int)1e9;
}
    if(target==0) {
            return 0;
        }
        else if(target<0) {
            return (int) 1e9;
        }

        if(dp[idx][target]!=-1) return dp[idx][target];
        int nottake=0+ getMinCoins(coins,target,dp,idx-1,min);
        int take=(int )1e9;
        if(coins[idx]<=target){
            take=  1+getMinCoins(coins,target-coins[idx],dp,idx,min);
        }
        min[0]=Math.min(min[0],Math.min(take,nottake));
return dp[idx][target]= Math.min(take,nottake);
    }
    static 	public int minCoins(int coins[], int M, int V)
    {

     int dp[][]=new int[M][V+1];
        for (int rows[]:dp)
             {
                 Arrays.fill(rows,-1);
        }
        int min[]=new int[1];


    int ans= getMinCoins(coins,V,dp,M-1,min);   // Your code goes here
    if(ans==(int)1e9) return -1;
    
        return ans;
    }
}