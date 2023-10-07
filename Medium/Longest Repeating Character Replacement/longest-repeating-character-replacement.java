//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        FastReader sc = new FastReader(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            String s = sc.next();
            int k = sc.nextInt();
            Solution obj = new Solution();
            s = s.toUpperCase();
            int ans = obj.characterReplacement(s, k);
            System.out.println(ans);
        }
    }
    static class FastReader {

        byte[] buf = new byte[2048];
        int index, total;
        InputStream in;

        FastReader(InputStream is) { in = is; }

        int scan() throws IOException {
            if (index >= total) {
                index = 0;
                total = in.read(buf);
                if (total <= 0) {
                    return -1;
                }
            }
            return buf[index++];
        }

        String next() throws IOException {
            int c;
            for (c = scan(); c <= 32; c = scan())
                ;
            StringBuilder sb = new StringBuilder();
            for (; c > 32; c = scan()) {
                sb.append((char)c);
            }
            return sb.toString();
        }

        int nextInt() throws IOException {
            int c, val = 0;
            for (c = scan(); c <= 32; c = scan())
                ;
            boolean neg = c == '-';
            if (c == '-' || c == '+') {
                c = scan();
            }
            for (; c >= '0' && c <= '9'; c = scan()) {
                val = (val << 3) + (val << 1) + (c & 15);
            }
            return neg ? -val : val;
        }

        long nextLong() throws IOException {
            int c;
            long val = 0;
            for (c = scan(); c <= 32; c = scan())
                ;
            boolean neg = c == '-';
            if (c == '-' || c == '+') {
                c = scan();
            }
            for (; c >= '0' && c <= '9'; c = scan()) {
                val = (val << 3) + (val << 1) + (c & 15);
            }
            return neg ? -val : val;
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
        public static int subst(List<Character> ds,int k,char ch){
int chcnt=0;
int start=0;
int ans=0;
for(int end=0;end<ds.size();end++){
    if(ds.get(end)!=ch){
                chcnt++;
    }

    while(chcnt>k){
     
        if(ds.get(start)!=ch){
            chcnt--;
        }
        start++;
    }
    ans=Math.max(ans,end-start+1);
}

return ans;
    }
    static int characterReplacement(String s, int k) {
         List<Character> ds1=new ArrayList<>();
int  n=s.length();
TreeSet<Character> set=new TreeSet<>();
for(int i=0;i<n;i++){
    ds1.add(s.charAt(i));
    set.add(s.charAt(i));
}
int ans=0;
//System.out.println(set);
for(char ele:set){
//System.out.println(ds1);
ans=Math.max(subst(ds1,k,ele),ans);
}
return ans; 
    }
}
