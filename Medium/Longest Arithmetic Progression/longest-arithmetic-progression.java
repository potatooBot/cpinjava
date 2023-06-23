//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            int ans = new Solution().lengthOfLongestAP(a, n);
            System.out.println(ans);
        }
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution {
    int lengthOfLongestAP(int[] nums, int n) {
       

     int maxi=0;


            int dp[][]=new int[nums.length][10001];
            for (int ind = 1; ind < nums.length; ind++) {
                for (int prev = 0; prev <ind; prev++) {
                    int diff=nums[prev]-nums[ind]+10000;
//                        System.out.println("Changint at " + i + " for "+ nums[ind]);
                     dp[ind][diff]=1+dp[prev][diff];
                 maxi =Math.max(maxi,dp[ind][diff]);

                }
            }






return maxi+1;
    }
}
