//{ Driver Code Starts
//Initial Template for Java

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
      int k = sc.nextInt();
      int a[] = new int[n];
      for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
      }
      Solution obj = new Solution();
      int ans = obj.subarrayCount(a,n,k);
      System.out.println(ans);
    }
  }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
       public static int subarrays(int[] nums, int k) {
       LinkedHashMap<Integer,Integer> map=new LinkedHashMap<>();
        int start=0;
    
        int count=0;
        for(int end=0;end<nums.length;end++){
            map.put(nums[end],map.getOrDefault(nums[end],0)+1);
            while(map.size()>k){
              map.put(nums[start],map.get(nums[start])-1);
                if(map.get(nums[start])==0){
                 map.remove(nums[start]);
             }
                start++;
            }
           count=count+( end-start+1);   
        }
        return count;   
    }
    static int subarrayCount(int arr[], int N, int k) {
    return subarrays(arr,k)-subarrays(arr,k-1);

  }
}
     