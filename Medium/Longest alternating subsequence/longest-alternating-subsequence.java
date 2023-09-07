//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String[] S = br.readLine().split(" ");
            int[] nums = new int[n];
            for(int i = 0; i < n; i++)
                nums[i] = Integer.parseInt(S[i]);
            Solution ob = new Solution();
            int ans = ob.AlternatingaMaxLength(nums);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int AlternatingaMaxLength(int[] nums)
    {
    int n=nums.length;     
if(n<2) return n;
int prev=nums[1]-nums[0];
int count=prev!=0?2:1;                 
for(int i=2;i<n;i++){
int diff=nums[i]-nums[i-1];
if((diff>0&&prev<=0)||(diff<0&&prev>=0)){
    count++;
    prev=diff;
}

}




return count;
    }
}