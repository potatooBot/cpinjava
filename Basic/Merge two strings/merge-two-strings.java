//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine().trim());
        while(t-- > 0){
            String input_line[] = read.readLine().trim().split("\\s+");
            String S1 = input_line[0];
            String S2 = input_line[1];
            Solution ob = new Solution();
            System.out.println(ob.merge(S1,S2));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    String merge(String word1, String word2)
    { 
         String ans="";
int i=0;
        int maxLen=Math.max(word1.length(),word2.length());
        if(word1.length()>word2.length()) {
            for (i = 0; i < word2.length(); i++) {
                ans = ans + word1.charAt(i);
                ans = ans + word2.charAt(i);
            }
            for (int j = i; j <word1.length() ; j++) {
                ans=ans+word1.charAt(j);
            }
        }
        else if(word1.length()<word2.length()){
            for ( i = 0; i < word1.length(); i++) {
                ans = ans + word1.charAt(i);
                ans = ans + word2.charAt(i);
            }
            for (int j = i; j <word2.length() ; j++) {
                ans=ans+word2.charAt(j);
            }
        }
        else {
            for ( i = 0; i < word1.length(); i++) {
                ans = ans + word1.charAt(i);
                ans = ans + word2.charAt(i);
            }
        }

        return ans;
    }
} 