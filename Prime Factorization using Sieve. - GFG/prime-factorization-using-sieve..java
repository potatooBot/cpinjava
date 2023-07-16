//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            Solution obj = new Solution();
            obj.sieve();
            List<Integer> ans = obj.findPrimeFactors(n);
            for (int e : ans) {
                System.out.print(e + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    // You must implement this function
    static void sieve() {}

    static List<Integer> findPrimeFactors(int n) {
        ArrayList<Integer> prime=new ArrayList<>();
        int spf[]=new int[n+1];
        Arrays.fill(spf,0);
        for (int i = 2; i <=n; i++) {
            spf[i]=i;
        }

        for (int i = 2; i*i <=n ; i++) {
            if (spf[i] == i) {
                for (int j=i*i ; j<=n ; j=j+i) {
                    if(spf[j]==j){
                        spf[j]=i;
                    }
                }

            }
        }

        while (n!=1){
            prime.add(spf[n] );
        n=n/spf[n];
        }

return prime;
    }
}
