//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GfG { 
    
	public static void main (String[] args) throws IOException  {
	    
	    //reading input using BufferedReader class
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//reading total testcases
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    
		    //reading number of eggs and floors
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    int n = Integer.parseInt(inputLine[0]);
		    int k = Integer.parseInt(inputLine[1]);
		    
		    //calling eggDrop() method of class
		    //EggDrop
		    System.out.println(new Solution().eggDrop(n, k));
		}
	}
}



// } Driver Code Ends


class Solution 
{
       public static int getMoves(int e,int f,int dp[][]){

if(f==1||f==0) return f;

if(e==1) return f;
if(dp[e][f]!=-1) {
    return dp[e][f];
}

int mini=1000000;
for(int k=1;k<=f;k++){
    int temp= 1+ Math.max(getMoves(e-1,k-1,dp),getMoves(e,f-k,dp));
mini=Math.min(mini,temp);
}
return dp[e][f]=mini;
    } 
    //Function to find minimum number of attempts needed in 
    //order to find the critical floor.
    static int eggDrop(int e, int f) 
	{
	       int dp[][]=new int[100+1][10000+1];

        for(int rows[]:dp){
            Arrays.fill(rows,-1);
        }
        return getMoves(e,f,dp);
	}
}