package Algorithm.Dynamic_Programming.TwoD_DP.Maximum_number_of_points_with_cost;

import java.util.Arrays;

public class maximum_number_of_points {

    static  public long maxPoints(int[][] points) {
        int m = points.length;
        int n = points[0].length;
        long[][] dp = new long[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = points[i][j];
            }
        }

        for (int i = 1; i < m; i++) {
            for (int j = 0; j < n; j++) {
                long max=0;
                for (int k = 0; k < n; k++) {
                    long pt = dp[i - 1][k] + points[i][j] - Math.abs(j - k);
                    max=Math.max(pt, max);

                }
                dp[i][j]=max;
            }
        }

        long maxScore = 0;
        for (int j = 0; j < n; j++) {
            maxScore = Math.max(maxScore, dp[m - 1][j]);
        }

        return maxScore;
    }
    public static void main(String[] args) {
        int points[][] = {{5,2,1,2},{2,1,5,2},{5,5,5,0}};
    long ans=maxPoints(points);
        System.out.println(ans);
    }
}
