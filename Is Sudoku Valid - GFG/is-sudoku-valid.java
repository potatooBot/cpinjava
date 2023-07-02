//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-->0){
            String s1[] = in.readLine().trim().split("\\s+");
            int mat[][] = new int[9][9];
            for(int i = 0;i < 81;i++)
                mat[i/9][i%9] = Integer.parseInt(s1[i]);
            
            Solution ob = new Solution();
            System.out.println(ob.isValid(mat));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    public static boolean isValid(int board[][],int row,int col,int val){
        
        for(int i=1;i<9;i++){
            if(board[i][col]==val){
                return false;
            }
            
            if(board[row][i]==val){
                return false;
            }
            
            if(board[3*(row/3) +i/3][3*(col/3) +i%3]==val){
                return false;
            }
        }
        return true;
        
    }
       public static boolean solve(int [][]board){
        for(int i=0;i<board.length;i++){
             for(int j=0;j<board[0].length;j++){
            if(board[i][j]!=0){
int val=board[i][j];
board[i][j]=0;


if(isValid(board,i,j,val)==false){
return false;
}
board[i][j]=val;
}
            }
        }
        return true;
    }
    static int isValid(int mat[][]){
         if(solve(mat))
 return 1;
 
 
 return 0;
 
        
    }
}