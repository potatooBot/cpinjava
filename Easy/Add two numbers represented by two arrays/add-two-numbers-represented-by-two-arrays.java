//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java

class Solution{
    
  
    String calc_Sum(int arr1[], int n, int arr2[], int m)
    {
     
int i=n-1;
int j=m-1;
int carry=0;
        ArrayList<Integer> temp=new ArrayList<>();
while (i>=0||j>=0||carry==1) {
    int sum=0;
if(i >= 0) {
        sum = sum + arr1[i];
        i--;
    }
    if (j >= 0) {
        sum = sum + arr2[j];
        j--;
    }
    sum=sum+carry;
    temp.add(sum%10);
    carry=sum/10;

}
        Collections.reverse(temp);
       String str="";
       boolean flag=false;
        for (int k = 0; k <temp.size() ; k++) {
           if (temp.get(k)==0&&flag==false) {
            continue;
            }
            flag=true;
            str=str+temp.get(k);
        }
        return str;
    }
  
    
}


//{ Driver Code Starts.

// Driver class
class GFG {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    
		    String line1 = br.readLine();
		    String[] element = line1.trim().split("\\s+");
		    int sizeOfArray_N = Integer.parseInt(element[0]);
		    
		    int arr [] = new int[sizeOfArray_N];
		    
		    String line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    
		    for(int i = 0;i<sizeOfArray_N;i++){
		        arr[i] = Integer.parseInt(elements[i]);
		    }
		    
		    String line2 = br.readLine();
		    String[] ele = line2.trim().split("\\s+");
		    int sizeOfArray_M = Integer.parseInt(ele[0]);
		    
		    int brr [] = new int[sizeOfArray_M];
		    
		    line2 = br.readLine();
		    String[] elements2 = line2.trim().split("\\s+");
		    
		    for(int i = 0;i<sizeOfArray_M;i++){
		        brr[i] = Integer.parseInt(elements2[i]);
		    }
		    
		    Solution obj = new Solution();
		   
		    String res = obj.calc_Sum(arr, sizeOfArray_N, brr, sizeOfArray_M);
		    
		    System.out.println(res);
		    
		    
		}
	}
}


            


// } Driver Code Ends