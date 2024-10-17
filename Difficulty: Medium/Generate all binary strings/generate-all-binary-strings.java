//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    while (T-- > 0) {
      int n = sc.nextInt();
      Solution obj = new Solution();
      List<String> ans = obj.generateBinaryStrings(n);
      for(String s : ans) System.out.print(s+" ");
      System.out.println();
    }
  }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
  public static List<String> generateBinaryStrings(int n) {
    // code here
    List<String> ans=new ArrayList<>();
 for(int i=0;i<(int)Math.pow(2,n);i++){
            String bin=Integer.toBinaryString(i);
        String zero="";
        for(int j=1;j<=(n-bin.length());j++){
            zero=zero+"0";
        }
        bin=zero+bin;
        boolean flag=true;
        for(int j=0;j<bin.length()-1;j++){
            if(bin.charAt(j)=='1'&&bin.charAt(j+1)=='1'){
                flag=false;
                break;
            }
        }
        if(flag==true){
            ans.add(bin);
        }
        
        }
return ans;
  }
}
     
     