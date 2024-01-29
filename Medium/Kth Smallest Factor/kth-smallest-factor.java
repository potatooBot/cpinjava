//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            
            int N = Integer.parseInt(S[0]);
            int K = Integer.parseInt(S[1]);

            Solution ob = new Solution();
            System.out.println(ob.kThSmallestFactor(N,K));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int kThSmallestFactor(int n , int p) {
       int d = 1;
            for (; d * d <= n; ++d)
                if (n % d == 0 && --p == 0)
                    return d;
            for (d = d - 1; d >= 1; --d) {
                if (d * d == n)
                    continue;
                if (n % d == 0 && --p == 0)
                    return n / d;
            }
            return -1;
    }
};