//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;


// } Driver Code Ends
//User function Template for Java

class Solution
{
    //Function to return the total number of possible unique BST.
    static int numTrees(int n)
    {
        long catalan[]=new long[n+1];

        catalan[0]=1;
        catalan[1]=1;
int mod=(int )(Math.pow(10,9) +7);
        for(int i=1;i<=n;i++){
            catalan[i]=0;
            for(int j=0;j<i;j++){
                catalan[i] =(catalan[i]%mod+ (catalan[j]%mod*catalan[i-j-1]%mod))%mod;
            }
        }
        return (int)catalan[n]; 
        
        
    }
}


//{ Driver Code Starts.

class GFG
{
    public static void main(String args[])
    {
        //taking input using Scanner class
        Scanner sc = new Scanner(System.in);
        
        //taking total testcases
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            //taking n
            int n =sc.nextInt();
            
            //creating an object of class Solution
            Solution ob = new Solution();
            
            //calling method numTrees() of 
            //class Solution
            System.out.println(ob.numTrees(n));
        }
    }
}

// } Driver Code Ends