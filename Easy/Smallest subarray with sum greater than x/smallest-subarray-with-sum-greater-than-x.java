//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            StringTokenizer stt = new StringTokenizer(br.readLine());
            
            int n = Integer.parseInt(stt.nextToken());
            int m = Integer.parseInt(stt.nextToken());
            // int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            Solution obj = new Solution();
            System.out.println(obj.smallestSubWithSum(a, n, m));
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Solution {

    public static int smallestSubWithSum(int nums[], int n, int target) {
                int prefSum=0;
        int start=0;
        int maxi=Integer.MAX_VALUE;
        for (int i = 0; i <nums.length ; i++) {
            prefSum+=nums[i];
            if(prefSum>=target){
                while(prefSum>target){
                    maxi=Math.min(maxi,i-start+1);
                    prefSum=prefSum-nums[start];
                    start++;
                    
                }

            }

        }
if(maxi==Integer.MAX_VALUE){
    return 0;
}
        return maxi;
    }
}

