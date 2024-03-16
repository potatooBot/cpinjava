//{ Driver Code Starts
import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.util.HashMap;

class Largest_Subarray
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0)
        {
            int N = sc.nextInt();
            int a[] = new int[N];
            for (int i = 0; i < N; i++) 
                a[i] = sc.nextInt();
            

            Solution g = new Solution();
            int n = g.maxLen(a, a.length);

            System.out.println(n);

            T--;
        }
    }
}

// } Driver Code Ends




class Solution {

    // arr[] : the input array containing 0s and 1s
    // N : size of the input array
    
    // return the maximum length of the subarray
    // with equal 0s and 1s
    int maxLen(int[] nums, int N)
    {
       HashMap<Integer,Integer> map=new HashMap<>();
int n=nums.length;
        for(int i=0;i<n;i++){
if(nums[i]==0) nums[i]=-1;
        }
int maxi=0;
int sum=0;
map.put(0,-1);
                for(int i=0;i<n;i++){
      sum+=nums[i];
int rem=sum-0;
      if(map.containsKey(rem)){
maxi=Math.max(maxi,i-map.get(rem));
      }
      if(!map.containsKey(sum)){
        map.put(sum,i);
      }
      }
 return maxi;
    }
}
