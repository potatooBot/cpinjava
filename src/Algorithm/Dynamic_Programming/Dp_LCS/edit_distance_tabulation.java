package Algorithm.Dynamic_Programming.Dp_LCS;

public class edit_distance_tabulation {
    public static int minDistance(String word1, String word2) {
        int n=word1.length();
        int m=word2.length();
        int dp[][]=new int[n+1][m+1];

        for(int i=0;i<=n;i++){
            dp[i][0]=i;
        }


        for(int j=0;j<=m;j++){
            dp[0][j]=j;
        }

        for(int idx1=1;idx1<n+1;idx1++){
            for(int idx2=1;idx2<m+1;idx2++){
                if(word1.charAt(idx1-1)==word2.charAt(idx2-1)){
                    dp[idx1][idx2]= dp[idx1-1][idx2-1];
                }
                else {
                    int insert=dp[idx1][idx2-1];
                    int delete=dp[idx1-1][idx2];
                    int replace=dp[idx1-1][idx2-1];
                    dp[idx1][idx2]=1+Math.min(insert,Math.min(delete,replace));
                }
            }
        }
        return dp[n][m];
    }
    public static void main(String args[]) {

        String s1 = "horse";
        String s2 = "ros";

        System.out.println("The minimum number of operations required is: "+
                minDistance(s1,s2));
    }
}
