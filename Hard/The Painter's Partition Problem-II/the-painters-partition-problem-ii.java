//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String input_line1[] = read.readLine().trim().split("\\s+");
            int k = Integer.parseInt(input_line1[0]);
            int n = Integer.parseInt(input_line1[1]);
            String input_line[] = read.readLine().trim().split("\\s+");
            int arr[]= new int[n];
            for(int i = 0; i < n; i++)
                arr[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            System.out.println(ob.minTime(arr,n,k));
        }
    }
}


// } Driver Code Ends


//User function Template for Java

 class Solution{
         public static long findNoOfStud(int arr[],long maxPages){
        long cntStu=1;
        long pagesSum=0;
        for(int i=0;i<arr.length;i++){
            if(pagesSum+arr[i]<=maxPages){
                pagesSum=pagesSum+arr[i];
                
            }
            else{
                cntStu++;
                pagesSum=arr[i];
            }
        }
        
        return cntStu;
        
    }
    //Function to find minimum number of pages.
    public static long findPages(int[]arr,int N,int M)
    {
      //  if(M>N) return -1;
        long sum=0;
        for(int ele:arr){
            sum=sum+ele;
        }
        
        long maxi=-1;
        for(int i=0;i<N;i++){
            maxi=Math.max(maxi,arr[i]);
        }
        
        long low=maxi;
        long high=sum;
        
        while(low<=high){
            long mid=(low+high)/2;
            
            long noOfStud=findNoOfStud(arr,mid);
            if(noOfStud>M){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        
        
        return (long)low;
    }
    static long minTime(int[] arr,int n,int k){
     
     
     return findPages(arr,n,k);
        //code here
    }
}


