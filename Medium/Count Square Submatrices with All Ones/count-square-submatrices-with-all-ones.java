//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int[][] mat = new int[N][M];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    mat[i][j] = sc.nextInt();
                }
            }
            Solution obj = new Solution();
            int res = obj.countSquares(N, M, mat);
            System.out.println(res);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int countSquares(int N, int M, int matrix[][]) {
        int n=matrix.length;
        int m=matrix[0].length;
        int dp[][]=new int[n][m];
for(int j=0;j<m;j++){
    dp[0][j]=matrix[0][j];
}


for(int i=0;i<n;i++){
    dp[i][0]=matrix[i][0];
}


for(int i=1;i<n;i++){
for(int j=1;j<m;j++){
if(matrix[i][j]==0){
    dp[i][j]=0;
}
else{
    dp[i][j]= 1 +Math.min(dp[i-1][j],Math.min(dp[i-1][j-1],dp[i][j-1]));
}
}
}

int sum=0;
for(int i=0;i<n;i++){
for(int j=0;j<m;j++){
sum=sum+dp[i][j];
}
}


return sum;
    }
}