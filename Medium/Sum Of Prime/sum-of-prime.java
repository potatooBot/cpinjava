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
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            int[] ptr = ob.getPrimes(N);

            System.out.println(ptr[0] + " " + ptr[1]);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int[] getPrimes(int n) {
              boolean prime[] = new boolean[n + 1];

            Arrays.fill(prime, true);
            for (int i = 2; i * i <= n; i++) {
                if (prime[i] == true) {
                    for (long j = i * i; j <= n; j = j + i) {
                        prime[(int) j] = false;
                    }
                }
            }
        int ans[]=new int[2];
            ans[0]=-1;
            ans[1]=-1;
            ArrayList<Integer> list = new ArrayList<>();
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 2; i <= n; i++) {
                if (i == 1) continue;
                if (prime[i] == true) {
                    list.add(i);
                    if(map.containsKey(n-i)){
                        ans[0]=n-i;
                        ans[1]=i;
                    }
                    map.put(i,1);
                }
            }
   //     System.out.println(list);
            return ans;
    }
};