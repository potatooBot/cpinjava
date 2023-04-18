package Algorithm.Dynamic_Programming.KnapsackType;

import java.util.Arrays;
import java.util.Map;

public class minimum_cost_to_fill_given_weight_in_bag {


    public static int getMinCost(int cost[],int w,int n,int idx,int dp[][]){
        if(idx==cost.length||w==0)
            return w==0?0:(int)1e9;

if(cost[idx]==-1) return getMinCost(cost,w,n,idx+1,dp);
if (dp[idx][w]!=-1) return dp[idx][w];
          int notTake= 0+getMinCost(cost,w,n,idx+1,dp);
        int take=(int)(1e9);
        if(idx+1<=w){
            take=cost[idx]+getMinCost(cost,w-(idx+1),n,idx,dp);
        }
return dp[idx][w]= Math.min(take,notTake);

    }
    static 	public int minimumCost(int cost[], int N,int W)
    {


        int dp[][]=new int[N+1][W+1];
        for (int rows[]:
             dp) {
            Arrays.fill(rows,-1);
        }


  int min= getMinCost(cost,W,N,0,dp);
        // Your code goes here

    return min==(int)1e9?-1:min;
    }
    public static void main(String[] args) {
        int  n = 5;int  arr[] = {20, 10, 4, 50, 100};
        int w = 5;
        System.out.println(minimumCost(arr,n,w));
    }
}
