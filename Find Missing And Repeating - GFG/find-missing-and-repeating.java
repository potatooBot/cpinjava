//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().split(" ");

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            int[] ans = new Solve().findTwoElement(a, n);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solve {
    int[] findTwoElement(int nums[], int n) {
        // code here
        int ans[]=new int[2];
ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i <n+1 ; i++) {
            list.add(0);
        }

        for (int i = 0; i <n ; i++) {
            list.set(nums[i], list.get(nums[i])+1 );
        }

        for (int i = 1; i < list.size() ; i++) {
            if(list.get(i)==0){
                ans[1]=i;
            }
            if(list.get(i)==2){
                ans[0]=i;
            }
        }
return ans;
    }
}