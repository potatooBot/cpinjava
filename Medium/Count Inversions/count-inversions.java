//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Sorting
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
            long arr[] = new long[(int)n];
            
            for(long i = 0; i < n; i++)
             arr[(int)i] = sc.nextLong();
             
            System.out.println(new Solution().inversionCount(arr, n));
            
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    // arr[]: Input Array
    // N : Size of the Array arr[]
    //Function to count inversions in the array.
      public static long merge(long arr[],long low,long mid,long high){
        long left=low;
        long right=mid+1;
        long count=0;
        ArrayList<Long> temp=new ArrayList<>();
        while (left<=mid&&right<=high) {
            if (arr[(int)left] <= arr[(int)right]) {
                temp.add((arr[(int)left]));
                left++;
            } else {
                count=count+(mid-left+1);
                temp.add(arr[(int) right]);
                right++;
            }
        }
        while (left<=mid){
            temp.add(arr[(int)left] );
            left++;
        }
        while (right<=high){
            temp.add(arr[(int)right] );
            right++;
        }
//        System.out.println(temp);
        for (long i = low; i <= high; i++) {
            arr[(int)i] = temp.get((int)i-(int)low);
        }
        return count;
    }
    public static long mergeSort(long arr[],long low,long high){
        long count=0;
        if(low>=high){
            return count;
        }
        long mid=(low+high)/2;
       count=count+ mergeSort(arr,low,mid);
       count=count+ mergeSort(arr,mid+1,high);
        count+=merge(arr,low,mid,high);
    return count;
    }
    static long inversionCount(long arr[], long n)
    {

        long count=mergeSort(arr,0,n-1);
     return count;   // Your Code Here
    }
}