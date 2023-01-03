package Algorithm.Dynamic_Programming.Memoization;
import java.util.*;
public class frog_jumping {
    public static int solve(int ind,int height[],int dp[]){

        if(ind==0) return 0;
        if(dp[ind]!=-1) return dp[ind];
        int first=solve(ind-1,height,dp) +Math.abs(height[ind]-height[ind-1]);
        int second=Integer.MAX_VALUE;
        if(ind>1)
        second=solve(ind-2,height,dp) +Math.abs(height[ind]-height[ind-2]);

        return dp[ind]=Math.max(first,second);
    }
    public static void main(String args[]) {

        int height[]={30,10,60 , 10 , 60 , 50};
        int n=height.length;
        int dp[]=new int[n];
        Arrays.fill(dp,-1);
        System.out.println(solve(n-1,height,dp));
    }
}
