//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N, M, x, y;
            String S[] = read.readLine().split(" ");
            N = Integer.parseInt(S[0]);
            M = Integer.parseInt(S[1]);
            int a[][] = new int[N][M];
            for (int i = 0; i < N; i++) {
                String s[] = read.readLine().split(" ");
                for (int j = 0; j < M; j++) a[i][j] = Integer.parseInt(s[j]);
            }
            Solution ob = new Solution();
            System.out.println(ob.maximumSumRectangle(N, M, a));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int maximumSumRectangle(int R, int C, int mat[][]) {
        int n=mat.length;

        int m=mat[0].length;
int ans=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
        int subArr[]=new int[m];
            //Arrays.fill(subArr,0);
        for(int j=i;j<n;j++){

            for(int k=0;k<m;k++){
                subArr[k]=subArr[k]+mat[j][k];
            }
            int sum=validate(subArr);
ans=Math.max(ans,sum);
        }
        
    }
        return ans;
    }
    
    public int validate(int arr[]){
int sum=0;
int maxi=-1;
for(int i=0;i<arr.length;i++){
    sum=sum+arr[i];
if(maxi<sum){
    maxi=sum;
}

if(sum<0){
    sum=0;
}

    
}
return maxi;
    }
};