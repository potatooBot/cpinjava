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
            int n = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int Arr[] = new int[n];
            for (int i = 0; i < n; i++)
                Arr[i] = Integer.parseInt(input_line[i]);

            Solution ob = new Solution();
            System.out.println(ob.maxSumLis(Arr, n));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
  public static boolean isSorted(int arr[]){
     for (int i = 0; i < arr.length-1 ; i++) {
         if(arr[i]<arr[i+1]){
             return false;
         }
     }
     return true;
 }
       static int maxSumLis(int arr[], int n) {
      int hash[] = new int[n];
           Arrays.fill(hash, 1);
           int dp[] = new int[n];
           Arrays.fill(dp, 1);
           int maxi = 0;
           int sum = 0;
           for (int i = 0; i < arr.length; i++) {
               sum += arr[i];
           }
           for (int ind = 0; ind < n; ind++) {

               hash[ind] = ind;
               for (int prev_ind = 0; prev_ind < ind; prev_ind++) {
                   if (arr[prev_ind] < arr[ind]) {
                       if (dp[ind] <= dp[prev_ind] + 1) {
                           dp[ind] = 1 + dp[prev_ind];
                           hash[ind] = prev_ind;
                       }
                   }

               }
           }
               int max = -1;
               int lastidx = -1;
               for (int i = 0; i < dp.length; i++) {
                   if (dp[i] >= max) {
                       max = dp[i];
                       lastidx = i;
                   }
               }
               ArrayList<Integer> temp = new ArrayList<>();
               temp.add(arr[lastidx]);
               sum = sum - arr[lastidx];
               while (hash[lastidx] != lastidx) {
                   lastidx = hash[lastidx];
                   temp.add(arr[lastidx]);
                   sum = sum - arr[lastidx];
               }
              // System.out.println(temp);


           return sum;
}
       
}