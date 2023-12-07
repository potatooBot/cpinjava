//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String s = br.readLine();
            Solution obj = new Solution();
            System.out.println(obj.maxOdd(s));
        }
    }
}
// } Driver Code Ends


class Solution {

    String maxOdd(String num) {
        String ans="";

    for(int i=num.length()-1;i>=0;i--){
       char ch=num.charAt(i);
        int val=Character.getNumericValue(ch);
        if(val%2!=0){
            ans= num.substring(0,i+1);
        break;
        }
    }
    return ans;
    }
}