//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int[] arr = new int[n];
            
            for (int i = 0; i < n; ++i)
                arr[i] = sc.nextInt ();

    		System.out.println (new Sol().search (arr, n));
        }
        
    }
}
// } Driver Code Ends


//User function Template for Java

class Sol
{
    public static int search(int nums[], int N)
    {
        // your code here
         int low=0;
       int high= nums.length-2;

       while (low<=high) {
           int mid = (low + high) / 2;
           if (mid % 2 == 0) {
               if (nums[mid] != nums[mid + 1]) {
                   high = mid - 1;
               } else low = mid + 1;
           }
           else {
               if (nums[mid] == nums[mid + 1]) {
                   high = mid - 1;
               } else low = mid + 1;
           }
       }
        return nums[low];
    }
}