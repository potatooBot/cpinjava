//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG{
    static FastReader sc=new FastReader(System.in);
    public static void main(String args[]) throws IOException{
       
        int t=sc.nextInt();
        while(t-->0){
            int N=sc.nextInt();
            String []arr=new String[N];
            for(int i=0;i<N;i++){
                arr[i]=sc.next();
            }
            Solution obj=new Solution();
            int res=obj.longestChain(N, arr);
            System.out.println(res);
        }
    }
   static class FastReader{
 
        byte[] buf = new byte[2048];
        int index, total;
        InputStream in;
 
        FastReader(InputStream is) {
            in = is;
        }
 
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
            for (c = scan(); c <= 32; c = scan());
            StringBuilder sb = new StringBuilder();
            for (; c > 32; c = scan()) {
                sb.append((char) c);
            }
            return sb.toString();
        }
 
        int nextInt() throws IOException {
            int c, val = 0;
            for (c = scan(); c <= 32; c = scan());
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
            for (c = scan(); c <= 32; c = scan());
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


//User function Template for Java

class Solution{
        public static boolean checkPossible(String str1,String str2 ){
        int first=0;
        int second=0;
        if(str1.length()!=str2.length()+1) return false;

        while (first<str1.length()){
            if(second<str2.length()&&str1.charAt(first)==str2.charAt(second)){
                first++;
                second++;
            }
            else {
                first++;
            }
        }
        if(first==str1.length()&&second==str2.length()) return true;
        return false;
    }
    public int longestChain(int N, String words[]){
     int n= words.length;
        int dp[]=new int[n];
        Arrays.fill(dp,1);

Arrays.sort(words, Comparator.comparing(s->s.length()));

        for (int ind = 0; ind <=n-1 ; ind++) {

            for (int prev = 0; prev <=ind-1 ; prev++) {

                if(checkPossible(words[ind],words[prev])&&1+dp[prev]>dp[ind]){

                    dp[ind]=1+dp[prev];
                }
            }
        }
        int maxi=1;

        for (int i = 0; i <=n-1 ; i++) {
            if (dp[i]>maxi){
                maxi=dp[i];


            }
        }
        return maxi;
    }
}