//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    int m=sc.nextInt();
		    Solution ob = new Solution();
		    System.out.println(ob.findPages(a,n,m));
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution 
{
    public static int findNoOfStud(int arr[],int maxPages){
        int cntStu=1;
        int pagesSum=0;
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
    public static int findPages(int[]arr,int N,int M)
    {
        if(M>N) return -1;
        int sum=0;
        for(int ele:arr){
            sum=sum+ele;
        }
        
        int maxi=-1;
        for(int i=0;i<N;i++){
            maxi=Math.max(maxi,arr[i]);
        }
        int ans=0;
        int low=maxi;
        int high=sum;
        
        while(low<=high){
            int mid=(low+high)/2;
            
            int noOfStud=findNoOfStud(arr,mid);
            if(noOfStud>M){
                low=mid+1;
            }
            else{
                high=mid-1;
            ans=mid;
                
            }
        }
        
        
        return ans;
    }
};