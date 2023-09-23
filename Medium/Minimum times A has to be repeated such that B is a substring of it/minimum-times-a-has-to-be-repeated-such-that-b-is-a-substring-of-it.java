//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String A = read.readLine();
            String B = read.readLine();

            Solution ob = new Solution();
            System.out.println(ob.minRepeats(A,B));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int minRepeats(String A, String B) {
        int n = B.length(), m = A.length();
        
        int max = n/m+1;
        int min = 1;
        String S = A;
        
        for(int i=0; i<=max; i++)
        {
            if(A.contains(B))
            {
                return min;
                
            }
            
            A = A + S;
            min++;
            
        }
        
        return -1;
    }
};