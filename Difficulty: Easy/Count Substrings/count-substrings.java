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
            String s = sc.next();

    		System.out.println (new Solution().countSubstr (s));
        }
        
    }
}

// Contributed By: Pranay Bansal

// } Driver Code Ends


//User function Template for Java

class Solution
{
    int countSubstr (String s)
    {
        // your code here    
     //   if(s.length()<3) return 0;
        int cnt=0;
        for(int i=0;i<s.length();i++){
           if(s.charAt(i)=='1') cnt++;
        
    }
    return cnt*(cnt-1)/2;
    }
}