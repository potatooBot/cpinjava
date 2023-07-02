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
            String S[] = read.readLine().split(" ");
            int L = Integer.parseInt(S[0]);
            int R = Integer.parseInt(S[1]);
            Solution ob = new Solution();
            System.out.println(ob.countPrimes(L, R));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int countPrimes(int left, int right) {
        boolean prime[]=new boolean[right+1];

Arrays.fill(prime,true);
        for(int i=2;i*i<=right;i++){
if(prime[i]==true){
    for(long j=i*i;j<=right;j=j+i){
        prime[(int)j]=false;
    }
}
        }
int count=0;

for(int i=left;i<=right;i++){
if(i==1) continue;
    if(prime[i]==true){
        count++;
    }
}
return count;
    }
};