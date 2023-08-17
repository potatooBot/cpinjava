package Algorithm.Dynamic_Programming.KnapsackType.Minimum_Coins;

import java.sql.Array;
import java.util.Arrays;

public class minimum_coins {
    public static int getMinCoins(int coins[],int target,int dp[][],int idx,int min[]){




        if(target==0) {
            return 0;
        }
        else if(target<0) {
            return (int) 1e9;
        }

        if(idx==0) {
    if(target%coins[0]==0){
        return coins[0]/target;
    }
    else return 10000;
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

    public static void main(String[] args) {
        int V = 30, M = 3, coins[] = {25, 10, 5} ;
        int ans=minCoins(coins,M,V);
        System.out.println(ans);
    }
}
