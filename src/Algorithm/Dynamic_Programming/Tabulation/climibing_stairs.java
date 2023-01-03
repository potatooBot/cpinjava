package Algorithm.Dynamic_Programming.Tabulation;

public class climibing_stairs {
    public static void main(String[] args) {
        int n=3;

            int dp[]=new int[n+1];
            dp[0]=1;
            dp[1]=1;

            for(int i=2;i<=n;i++) {
                dp[i]=dp[i-1]+dp[i-2];
            }
            for(int i=0;i<dp.length;i++) {
                System.out.println(dp[i]);
            }
//            System.out.println(dp[n]);

    }
}
