//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

import java.util.HashMap; 
import java.util.Map; 
import java.util.Map.Entry; 


// } Driver Code Ends
//User function Template for Java

class Solution{
    // A1[] : the input array-1
    // N : size of the array A1[]
    // A2[] : the input array-2
    // M : size of the array A2[]
    
    //Function to sort an array according to the other array.
    public static int[] sortA1ByA2(int arr1[], int N, int arr2[], int M)
    {
          HashMap<Integer,Integer> map=new HashMap<>();
ArrayList<Integer> ds1=new ArrayList<>();
ArrayList<Integer> ds2=new ArrayList<>();
    for(int ele:arr1) 
    {
    map.put(ele,map.getOrDefault(ele,0)+1);
    ds1.add(ele);
    }
        for(int ele:arr2) 
    {
    ds2.add(ele);
    }

  TreeMap<Integer,Integer>  map2=new TreeMap<>();
    for(int ele:arr1){
if(ds2.contains(ele)==false){
    map2.put(ele,map2.getOrDefault(ele,0)+1);
}
    }
//System.out.println(map2);
int i=0;
    for(int ele:arr2){
        if(map.get(ele)==null) continue;
int cnt=map.get(ele);
while(cnt!=0){
    arr1[i]=ele;
    cnt--;
i++;
}
    }

    for(Map.Entry<Integer,Integer> entry:map2.entrySet()){
int val=entry.getKey();
int cnt=entry.getValue();

while(cnt!=0){
    arr1[i]=val;
    cnt--;
    i++;
}


    
}
    return arr1; 
}
}



//{ Driver Code Starts.
class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int m=sc.nextInt();
		    int a1[]=new int[n];
		    int a2[]=new int[m];
		    
		    for(int i=0;i<n;i++)
		    a1[i]=sc.nextInt();
		    
		    for(int i=0;i<m;i++)
		    a2[i]=sc.nextInt();
		    Solution ob=new Solution();
		    a1 = ob.sortA1ByA2(a1,n,a2,m);
		    for(int x:a1)
		    System.out.print(x+" ");
		    
		    System.out.println();
		}
	}
	

}



// } Driver Code Ends