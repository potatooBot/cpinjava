//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            Solution obj = new Solution();
            List<Integer> res = obj.LargestSubset(N, arr);
            int isValidSeq = 1, sz = res.size();
            for (int i = 0; i < sz; i++) {
                for (int j = i + 1; j < sz; j++) {
                    if ((res.get(i) % res.get(j) == 0) ||
                        (res.get(j) % res.get(i) == 0))
                        continue;
                    else {
                        isValidSeq = 0;
                        break;
                    }
                }
            }
            System.out.println(isValidSeq + " " + sz);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public List<Integer> LargestSubset(int N, int[] nums) {
       int n= nums.length;
         List<Integer> ans=new ArrayList<>();
         Arrays.sort(nums);
    int dp[]=new int[n];
    Arrays.fill(dp,1);
    int hash[]=new int[n];
    Arrays.fill(hash,1);

        for (int ind = 0; ind <=n-1 ; ind++) {
            hash[ind]=ind;
            for (int prev_ind = 0; prev_ind <=ind-1 ; prev_ind++) {
                if(nums[ind]%nums[prev_ind]==0&&dp[ind]<dp[prev_ind]+1){
                    dp[ind]=1+dp[prev_ind];
                    hash[ind]=prev_ind;
                }
            }
        }
        int maxi=-1;
        int lastIndex=-1;
        for (int i = 0; i <dp.length ; i++) {
            if(dp[i]>maxi){
                maxi=dp[i];
                lastIndex=i;
            }
        }
        ans.add(nums[lastIndex]);
        while (hash[lastIndex]!=lastIndex){
            lastIndex=hash[lastIndex];
            ans.add(nums[lastIndex]);
        }
      
    return ans;
    }
}
