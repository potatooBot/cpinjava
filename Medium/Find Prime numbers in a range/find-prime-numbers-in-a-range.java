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
            int M = Integer.parseInt(S[0]);
            int N = Integer.parseInt(S[1]);
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.primeRange(M, N);
            for (int i : ans) System.out.print(i + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    ArrayList<Integer> primeRange(int left, int right) {
      boolean prime[]=new boolean[right+1];

Arrays.fill(prime,true);
        for(int i=2;i*i<=right;i++){
if(prime[i]==true){
    for(long j=i*i;j<=right;j=j+i){
        prime[(int)j]=false;
    }
}
        }

ArrayList<Integer> list=new ArrayList<>();
for(int i=left;i<=right;i++){
    if(i==1) continue;
    if(prime[i]==true){
       list.add(i);
    }
}
return list;
    }
}