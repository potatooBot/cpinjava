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
            String str[] = read.readLine().trim().split("\\s+");
            int r = Integer.parseInt(str[0]);
            int c = Integer.parseInt(str[1]);
            int matrix[][] = new int[r][c];
            
            for(int i = 0; i < r; i++)
            {
                int k = 0;
                str = read.readLine().trim().split("\\s+");
                for(int j = 0; j < c; j++){
                  matrix[i][j] = Integer.parseInt(str[k]);
                  k++;
                }
            }
            new Solution().booleanMatrix(matrix);
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < r; i++){
                for(int j = 0; j < c; j++){
                    sb.append(matrix[i][j] + " ");
                }
                sb.append("\n"); 
            }
            System.out.print(sb);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to modify the matrix such that if a matrix cell matrix[i][j]
    //is 1 then all the cells in its ith row and jth column will become 1.
       static  void booleanMatrix(int matrix[][])
    {

     int r= matrix.length;
     int c=matrix[0].length;
boolean row[]=new boolean[r];
boolean col[]=new boolean[c];
        for (int i = 0; i <r ; i++) {
            for (int j = 0; j <c ; j++) {
                if(matrix[i][j]==1){
                    row[i]=true;
                    col[j]=true;
                }
            }
        }
        for (int i = 0; i <row.length ; i++) {
            if (row[i]==true)
            setRowOne(matrix,i);
        }// code here
        for (int i = 0; i <col.length ; i++) {
            if (col[i]==true)
                setColOne(matrix,i);
        }// code here
    }
    public static void setRowOne(int matrix[][],int row){
        for (int i = 0; i <matrix[0].length ; i++) {
            matrix[row][i]=1;
        }
    }
    public static void setColOne(int matrix[][],int col){
        for (int i = 0; i <matrix.length ; i++) {
            matrix[i][col]=1;
        }
    }
}