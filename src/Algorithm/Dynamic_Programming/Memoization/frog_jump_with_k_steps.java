package Algorithm.Dynamic_Programming.Memoization;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class frog_jump_with_k_steps {
    public static int solve(int ind,int height[],int k){
        if (ind==0) return 0;
int minsteps=Integer.MAX_VALUE;
        for (int i = 1; i <=k ; i++) {
            if (ind >= i) {
                int jump=solve(ind - i, height, k)+Math.abs(height[ind]-height[ind-i]);
                minsteps=Math.min(minsteps,jump);
            }
        }
return minsteps;
    }
    public static void main(String[] args) {
        int height[]={10 ,10};
        int n=height.length;
//        int dp[]=new int[n];
//        Arrays.fill(dp,-1);
        System.out.println(solve(n-1,height,100));
    }
}
