//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();
            
            Solution ob = new Solution();
            String result = ob.removeDups(s);
            
            System.out.println(result);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    String removeDups(String S) {
        // code here
        LinkedHashSet<Character> set=new LinkedHashSet<>();
        for(int i=0;i<S.length();i++){
            set.add(S.charAt(i));
        }
        String ans="";
        for(char ch:set){
            ans=ans+ch;
        }
        return ans;
        
    }
}