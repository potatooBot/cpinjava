package Algorithm.Dynamic_Programming.Dp_on_Subsequence;

import java.util.Arrays;

public class longest_common_subsequence_momoization {

        static int lcsUtil(String s1, String s2, int ind1, int ind2, int[][] dp){

            if(ind1<0 || ind2<0)
                return 0;

            if(dp[ind1][ind2]!=-1)
                return dp[ind1][ind2];

            if(s1.charAt(ind1) == s2.charAt(ind2))
                return dp[ind1][ind2] = 1 + lcsUtil(s1,s2,ind1-1,ind2-1,dp);

            else
                return dp[ind1][ind2] = 0 + Math.max(lcsUtil(s1,s2,ind1,ind2-1,dp),
                        lcsUtil(s1,s2,ind1-1,ind2,dp));

        }


        static int lcs(String s1, String s2) {
            System.out.println("I am in lcs functoion");
            int n=s1.length();
            int m=s2.length();

            int dp[][]=new int[n][m];
            for(int rows[]: dp)
                Arrays.fill(rows,-1);
            return lcsUtil(s1,s2,n-1,m-1,dp);
        }

        public static void main(String args[]) {
            System.out.println("Hey ");
            String s1= "hbcfgmnapq";
            String s2= "cbhgrsfnmq";

            System.out.println("The Length of Longest Common Subsequence is "+lcs(s1,s2));
        }

//    Output: The Length of Longest Common Subsequence is 2
//
//    Time Complexity: O(N*M)
//
//    Reason: There are N*M states therefore at max ‘N*M’ new problems will be solved.
//
//    Space Complexity: O(N*M) + O(N+M)
}
