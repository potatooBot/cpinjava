//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
         BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine());
            int matrix[][] = new int[n][n];
            String st[] = read.readLine().trim().split("\\s+");
            int k = 0;
            for(int i = 0; i < n; i++)
            {
                for(int j = 0; j < n; j++)
                    matrix[i][j] = Integer.parseInt(st[k++]);
            }
            Solution ob = new Solution();
            ob.rotateby90(matrix, n);
            for(int i = 0; i < n; i++)
            {
                for(int j = 0; j < n; j++)
                    System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to rotate matrix anticlockwise by 90 degrees.
    static void rotateby90(int mat[][], int n) 
    { 
            for (int i = 0; i <n/2 ; i++) {
            for (int j = i; j <n-i-1 ; j++) {
                int temp=mat[i][j];
                mat[i][j]=mat[j][n-i-1];
           mat[j][n-i-1]=mat[n-i-1][n-j-1];
           mat[n-i-1][n-j-1]=mat[n-j-1][i];
           mat[n-j-1][i]=temp;
            }
        }
    }
}