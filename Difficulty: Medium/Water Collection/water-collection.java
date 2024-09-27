//{ Driver Code Starts
// Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


// } Driver Code Ends
// User function Template for Java

class Solution {
    public static int maxWater(int[] height) {
      int left=0;
int right= height.length-1;
int leftMax=0;
int rightMax=0;
int ans=0;
while (left<=right){

    if(height[left]<=height[right]) {


        if (leftMax <= height[left]) {
            leftMax = height[left];
        } else {
            ans = ans + (leftMax) - height[left];
        }
        left++;
    }
        else {
            if (rightMax<=height[right]){
                rightMax=height[right];
            }
            else {
                ans+=rightMax-height[right];
            }
            right--;
        }
    }
        return ans;
    }
}

//{ Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main(String[] args) throws IOException {
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;

            Solution obj = new Solution();
            int res = obj.maxWater(arr);
            System.out.println(res);
        }
    }
}

// } Driver Code Ends