//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while (t-- > 0) {

            int N;
            N = sc.nextInt();

            int[] arr = new int[N];
            for (int i = 0; i < N; i++) arr[i] = sc.nextInt();

            Solution obj = new Solution();
            long res = obj.subarrayRanges(N, arr);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends


class Solution {
    public static long subarrayRanges(int N, int[] nums) {
      long sum=0;
int n=nums.length;
     for(int i=0;i<n;i++){
int mini=Integer.MAX_VALUE;
int maxi=Integer.MIN_VALUE;
for(int j=i;j<n;j++){
    mini=Math.min(mini,nums[j]);
    maxi=Math.max(maxi,nums[j]);
    sum=sum+(maxi-mini);
}


     }
return sum;
    }
}
