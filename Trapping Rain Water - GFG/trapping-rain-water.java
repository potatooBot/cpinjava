//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;


class Array {

	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		  
		    //size of array
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    //adding elements to the array
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Solution obj = new Solution();
		    
		    //calling trappingWater() function
		    System.out.println(obj.trappingWater(arr, n));
		}
	}
}


// } Driver Code Ends


class Solution{
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static long trappingWater(int height[], int n) { 
       int left=0;
int right= height.length-1;
long leftMax=0;
long rightMax=0;
long ans=0;
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


