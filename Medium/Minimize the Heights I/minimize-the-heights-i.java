//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int k = Integer.parseInt(inputLine[0]);
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().getMinDiff(arr, n, k);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int getMinDiff(int[] nums, int n, int k) {
           if(nums.length==1) return 0;

        Arrays.sort(nums);


        if(k>=nums[n-1]-nums[0]){
            return nums[n-1]-nums[0];
        }
int minScore=nums[n-1]-nums[0];
for(int p=1;p<n;p++){
int min=Math.min(nums[0]+k,nums[p]-k);
int max=Math.max(nums[p-1]+k,nums[n-1]-k);
minScore=Math.min(minScore,max-min);
}

return minScore;
    }
}
