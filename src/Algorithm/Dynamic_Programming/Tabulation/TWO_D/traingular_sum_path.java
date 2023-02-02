package Algorithm.Dynamic_Programming.Tabulation.TWO_D;

public class traingular_sum_path {
    static int minimumPathSum(int[][] triangle, int n){
        int dp[][]= new int[n][n];

        for(int j=0;j<n;j++){
            dp[n-1][j] = triangle[n-1][j];
        }

        for(int i=n-2; i>=0; i--){
            for(int j=i; j>=0; j--){

                int down = triangle[i][j]+dp[i+1][j];
                int diagonal = triangle[i][j]+dp[i+1][j+1];

                dp[i][j] = Math.min(down, diagonal);
            }
        }

        return dp[0][0];

    }

    public static void main(String args[]) {

        int triangle [][] = {{1},
                {2,3},
                {3,6,7},
                {8,9,6,10}};

        int n = triangle.length;

        System.out.println(minimumPathSum(triangle,n));
    }
}
