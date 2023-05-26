package Algorithm.Dynamic_Programming.TwoD_DP;

import java.util.Arrays;

public class ninja_training_vvi {
    public static int getMaxMerit(int day,int last,int dp[][],int points[][]){
        if(dp[day][last]!=-1) return dp[day][last];
        if(day==0) {
            int maxi=0;
            for (int task = 0; task < 3 ; task++) {
                if(task!=last) {
                maxi=Math.max(maxi,points[0][task]);
                }

            }
            return  dp[day][last]=maxi;
        }


        int maxi=0;
        for (int task = 0; task < 3 ; task++) {
            if (task != last) {
                int merit = points[day][task] + getMaxMerit(day - 1, task, dp, points);
                maxi=Math.max(maxi,merit);
            }
        }
        return dp[day][last]=maxi;
    }
    static int ninjaTraining(int n, int[][] points) {
int dp[][]=new int[n][4];
        for (int [] row:
             dp) {
            Arrays.fill(row,-1);
        }
  int result=getMaxMerit(n-1,3,dp,points);
        return result;
    }
    public static void main(String args[]) {

        int[][] points = {{10,40,70},
                {20,50,80},
                {30,60,90}};


        int n = points.length;
        System.out.println(ninjaTraining(n, points));
    }
}
