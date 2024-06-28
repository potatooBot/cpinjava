//{ Driver Code Starts
// Initial Template for Java

// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        Solution ob = new Solution();
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String input_line[] = read.readLine().trim().split("\\s+");
            int n = Integer.parseInt(input_line[0]);
            String input_line1[] = read.readLine().trim().split("\\s+");
            int[][] a = new int[n][n];
            int c = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = Integer.parseInt(input_line1[c]);
                    c++;
                }
            }
            String ans = ob.pattern(a);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public static boolean checkPali(String str){
      
      //  System.out.println(str);
 for(int i=0;i<str.length();i++){
     if(str.charAt(i)!=str.charAt(str.length()-i-1)){
         return false;
     }
 }
        return true;
    }
    public String pattern(int[][] arr) {
        
        
        
        for(int i=0;i<arr.length;i++){
            String str="";
            for(int j=0;j<arr[0].length;j++){
                str=str+String.valueOf(arr[i][j]);
            }
            if(checkPali(str)==true){
                return i+" "+"R";
            }
        }
        
              for(int j=0;j<arr[0].length;j++){
            String str="";
            for(int i=0;i<arr.length;i++){
                str=str+String.valueOf(arr[i][j]);
            }
          //  System.out.println(str);
            if(checkPali(str)==true){
                return j+" "+"C";
            }
        }
        return "-1";
    }
}
