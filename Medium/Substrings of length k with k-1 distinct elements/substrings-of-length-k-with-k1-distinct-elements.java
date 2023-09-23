//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            int K = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.countOfSubstrings(S,K));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int countOfSubstrings(String s, int K) {
        LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();
        int start=0;
        int len=0;
        int count=0;
        for(int end=0;end<s.length();end++){
            map.put(s.charAt(end),map.getOrDefault(s.charAt(end),0)+1);
            len++;
            if(len==K&&map.size()==K-1){
                count++;
            }
            
            if(len==K){
               //  System.out.println(map);  
                map.put(s.charAt(start),map.get(s.charAt(start))-1);
             
             if(map.get(s.charAt(start))==0){
                    map.remove(s.charAt(start));
                }
                len--;
                start++;
            }
        
        }
        
        return count;
        
    }
};