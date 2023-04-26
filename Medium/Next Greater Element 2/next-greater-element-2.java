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
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            Solution obj = new Solution();
            int ans[] = obj.nextGreaterElement(n, a);
            for (int e : ans) System.out.print(e + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static int[] nextGreaterElement(int N, int nums1[]) {
       int n=nums1.length;
        int ans[]=new int[n];
Stack<Integer> stk=new Stack<>();
        for (int i = 2*n-1; i >=0 ; i--) {
while (stk.isEmpty()==false&&stk.peek()<=nums1[i%n]){
    stk.pop();

}

if(stk.isEmpty()==false&&stk.peek()>nums1[i%n])
{
    ans[i%n]=stk.peek();
}
else {
    ans[i%n]=-1;
}
stk.push((int)nums1[i%n]);
        }
return ans;
    }
}
