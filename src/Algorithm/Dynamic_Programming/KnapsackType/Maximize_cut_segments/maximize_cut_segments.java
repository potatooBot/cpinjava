package Algorithm.Dynamic_Programming.KnapsackType.Maximize_cut_segments;

import java.util.Arrays;

public class maximize_cut_segments {
    public static int getMaxCut( int n,int x,int y,int z,int dp[])
    {
        if(n<0) return Integer.MIN_VALUE;
        if(n==0) return 0;
     if(dp[n]!=-1){
         return dp[n];
     }

     int first=1+getMaxCut(n-x,x,y,z,dp);
     int second=1+getMaxCut(n-y,x,y,z,dp);
     int third=1+getMaxCut(n-z,x,y,z,dp);

        return dp[n]=Math.max(first,Math.max(second,third));

    }
    static  public int maximizeCuts(int n, int x, int y, int z)
    {
        int dp[]=new int[n+1];

        Arrays.fill(dp,-1);

        int ans=getMaxCut(n,x,y,z,dp);
        return ans;
    }
    public static void main(String[] args) {
        int n = 4,
        x = 2, y = 1, z = 1;
int ans=maximizeCuts(n,x,y,z);
        System.out.println(ans);
    }
}
