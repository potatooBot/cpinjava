//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while (t-- > 0) {

            int n = sc.nextInt();
            int K;
            K = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) nums[i] = sc.nextInt();

            Solution obj = new Solution();
            int res = obj.smallestDivisor(nums, K);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
         public static int getMax(int nums[]){
        int maxi=-1;
        for (int ele:
             nums) {
            maxi=Math.max(maxi,ele);
        }
        return maxi;
    }
      public static int getMinDivisor(int nums[],int threshold,int mid){
        int sum=0;
        for (int i = 0; i <nums.length ; i++) {
            double v = nums[i] / (double) mid;
            sum =(int) (sum+ (int)Math.ceil((double)nums[i]/(double) mid));
        }
if(sum<=threshold) return 1;
return 0;
    }
    public static int smallestDivisor(int[] nums, int threshold) {
       int low=1;
int high=getMax(nums);
int ans=0;
        while (low<=high){
        int mid=(low+high)/2;

        if(getMinDivisor(nums,threshold,mid)==1){
high=mid-1;
ans=mid;
        }
        else {
        low=mid+1;
        }


        }


        return ans; 
    }
}