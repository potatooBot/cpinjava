//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int k = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.longestkSubstr(s, k));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
   /* public int subStrAtmost(String s, int k) {
         LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();
        int start=0;
        int count=0;
        for(int end=0;end<s.length();end++){
            map.put(s.charAt(end),map.getOrDefault(s.charAt(end),0)+1);
            while(map.size()>k){
                if(map.get(s.charAt(start))==1){
                 map.remove(s.charAt(start));
             }
             else map.put(s.charAt(start),map.get(s.charAt(start))-1);
                start++;
            }
          count=Math.max(count,end-start+1) ; 
        }
        return count; 
    }*/
       public int longestkSubstr(String s, int k) {
        
       HashMap<Character,Integer> map=new HashMap<>();
        int start=0;
        int count=0;
        for(int end=0;end<s.length();end++){
            map.put(s.charAt(end),map.getOrDefault(s.charAt(end),0)+1);
            while(map.size()>k){
                if(map.get(s.charAt(start))==1){
                 map.remove(s.charAt(start));
             }
             else map.put(s.charAt(start),map.get(s.charAt(start))-1);
                start++;
            }
          count=Math.max(count,end-start+1) ; 
        
        }
        return count; 
    }
}