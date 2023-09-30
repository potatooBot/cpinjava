//{ Driver Code Starts
//Initial template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG
{
    public static void main (String[] args)
	{
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            int arr[]= new int[n];
            for(int i=0; i<n; i++)
                arr[i] = sc.nextInt();
            Solution ob = new Solution();
            if(ob.recreationalSpot(arr,n))
                System.out.println("True");
            else
                System.out.println("False");
        }
	}
}
// } Driver Code Ends


//User function template for C++

class Solution{
    static boolean recreationalSpot(int[] nums , int n){
   
        Stack<Integer> s = new Stack<>();

        int mx = Integer.MIN_VALUE;

        for(int i = nums.length-1;i >= 0;i--){
            if(nums[i] < mx){
                return true;
            }

            while(!s.isEmpty() && s.peek() < nums[i]){
                mx = s.pop();
          //      System.out.println(mx);
            }
         //   System.out.println(mx);

            s.add(nums[i]);
        }

        return false;
    }
};