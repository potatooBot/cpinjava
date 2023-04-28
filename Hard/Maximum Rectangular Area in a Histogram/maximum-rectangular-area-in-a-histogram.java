//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    long n = Long.parseLong(br.readLine().trim());
		    String inputLine[] = br.readLine().trim().split(" ");
		    long[] arr = new long[(int)n];
		    for(int i=0; i<n; i++)arr[i]=Long.parseLong(inputLine[i]);
		    System.out.println(new Solution().getMaxArea(arr, n));
		}
	}
}




// } Driver Code Ends


class Solution
{
    //Function to find largest rectangular area possible in a given histogram.
    public static long getMaxArea(long heights[], long n) 
    {
              Stack<Integer> stk=new Stack<>();
        int leftBoundary[]=new int[heights.length];
        for (int i = 0; i < heights.length ; i++) {
            while (stk.isEmpty()==false&&heights[stk.peek()]>=heights[i]){
                stk.pop();
            }
            if(stk.isEmpty()==true) {
                leftBoundary[i]=0;
            }
            else {
                leftBoundary[i]=stk.peek()+1;
            }
            stk.push(i);
        }

        stk.clear();
        int rightBoundary[]=new int[heights.length];
        for (int i = heights.length-1; i >=0 ; i--) {
            while (stk.isEmpty()==false&&heights[stk.peek()]>=heights[i]){
                stk.pop();
            }
            if(stk.isEmpty()==true) {
                rightBoundary[i]= heights.length-1;
            }
            else {
                rightBoundary[i]=stk.peek()-1;
            }
            stk.push(i);
        }

      long maxi=-1;
        for (int i = 0; i < heights.length ; i++) {
            maxi=Math.max(maxi,(rightBoundary[i]-leftBoundary[i]+1)*heights[i]);
        }

        return maxi;
    }
        
}



