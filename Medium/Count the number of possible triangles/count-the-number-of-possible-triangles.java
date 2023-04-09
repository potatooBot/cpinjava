//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        //taking input using Scanner class
        Scanner sc = new Scanner(System.in);
        
        //taking total count of testcases
        int t = sc.nextInt();
        
        while(t > 0)
        {
            //taking elements count
            int n = sc.nextInt();
            
            //creating an array of length n
            int arr[] = new int[n];
            
            //adding elements to the array
            for(int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
            
            //creating an object of class Solutions
            Solution ob = new Solution();
            
            //calling the method findNumberOfTriangles()
            //of class Solutions and printing the results
            System.out.println(ob.findNumberOfTriangles(arr,n));
            t--;
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to count the number of possible triangles.
    static int findNumberOfTriangles(int nums[], int n)
    {
      int ans=0;
if(nums.length<3) return 0;
  Arrays.sort(nums);
        for (int i = 2; i <nums.length ; i++) {

            int left=0;
            int right=i-1;
            while (left<right){

                if(nums[left]+nums[right]>nums[i])
                {
                    ans=ans+(right-left);
                    right--;
                }
                else {
                    left++;
                }
                }
        }

        return ans;

    }
}