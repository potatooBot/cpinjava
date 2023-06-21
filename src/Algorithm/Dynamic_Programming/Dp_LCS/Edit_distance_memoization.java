package Algorithm.Dynamic_Programming.Dp_on_String;

import java.util.Arrays;

public class Edit_distance_memoization {
    public static int getDist(String word1,String word2,int idx1,int idx2,int dp[][]){

        if(idx1<0) return idx2+1;
        if(idx2<0) return idx1+1;
        if(dp[idx1][idx2]!=-1) return dp[idx1][idx2];

        if(word1.charAt(idx1)==word2.charAt(idx2)){
            return 0 +getDist(word1,word2,idx1-1,idx2-1,dp);
        }

        int insert=getDist(word1,word2,idx1,idx2-1,dp);
        int delete=getDist(word1,word2,idx1-1,idx2,dp);
        int replace=getDist(word1,word2,idx1-1,idx2-1,dp);
        return dp[idx1][idx2]=1+Math.min(insert,Math.min(delete,replace));
    }
    public static int minDistance(String word1, String word2) {
        int n=word1.length();
        int m=word2.length();
        int dp[][]=new int[n][m];
        for(int rows[]:dp) Arrays.fill(rows,-1);

        return getDist(word1,word2,n-1,m-1,dp);
    }
    public static void main(String args[]) {

        String s1 = "horse";
        String s2 = "ros";

        System.out.println("The minimum number of operations required is: "+
                minDistance(s1,s2));
    }
}
