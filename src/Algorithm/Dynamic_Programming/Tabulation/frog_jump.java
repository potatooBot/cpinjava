package Algorithm.Dynamic_Programming.Tabulation;

import java.util.Arrays;

public class frog_jump {
    public static void main(String args[]) {

        int height[]={30,10,60,10,60,50};
        int n=height.length;
        int dp[]=new int[n];
        Arrays.fill(dp,-1);
        dp[0]=0;
        for(int ind=1;ind<n;ind++){
            int jumpTwo = Integer.MAX_VALUE;
            int jumpOne= dp[ind-1] + Math.abs(height[ind]-height[ind-1]);
            if(ind>1)
                jumpTwo = dp[ind-2] + Math.abs(height[ind]-height[ind-2]);

            dp[ind]=Math.min(jumpOne, jumpTwo);
        }
        System.out.println(dp[n-1]);
    }
}
