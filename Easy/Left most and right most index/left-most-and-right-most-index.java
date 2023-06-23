//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class pair  {  
    long first, second;  
    public pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
}

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            long n = Long.parseLong(br.readLine().trim());
            long a[] = new long[(int)(n)];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            long k = Long.parseLong(br.readLine().trim());
            
            Solution obj = new Solution();
            pair ans = obj.indexes(a, k);
            if (ans.first == -1 && ans.second == -1)
                System.out.println(-1);
            else
                System.out.println(ans.first+" "+ans.second);
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java

/*
class pair  {  
    long first, second;  
    public pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
}
*/

class Solution {
    
     public static int getFirst(long arr[],long x){
        int first=-1;

        int low=0;
        int high= arr.length-1;
        while (low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==x){
                high=mid-1;
                first=mid;
            }
            else if(arr[mid]<x){
                low=mid+1;
            }
            else {
                high=mid-1;
            }


        }
        return first;
    }
    public static int getLast(long arr[],long x){
        int last=-1;

        int low=0;
        int high= arr.length-1;
        while (low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==x){
                low=mid+1;
                last=mid;
            }
            else if(arr[mid]<x){
                low=mid+1;
            }
            else {
                high=mid-1;
            }


        }
        return last;
    }
    static public pair indexes(long arr[], long x)
    {

     int first=getFirst(arr,x);
        int last=getLast(arr,x);

pair ans=new pair((long) first,(long) last);
        // Your code goes here
    return ans;
    }
}