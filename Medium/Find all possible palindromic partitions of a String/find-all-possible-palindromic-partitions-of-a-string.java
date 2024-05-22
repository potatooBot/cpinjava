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

            Solution ob = new Solution();
            ArrayList<ArrayList<String>> allPart = ob.allPalindromicPerms(S);
            
            for (int i=0; i<allPart.size(); i++)  
            { 
                for (int j=0; j<allPart.get(i).size(); j++) 
                { 
                    System.out.print(allPart.get(i).get(j) + " "); 
                } 
                System.out.println(); 
            } 
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
        public static boolean pali(String s,int x,int y){
        while(x<=y){
            if(s.charAt(x++)!=s.charAt(y--)){
                     return false;
            }
        }
        return true;
    }
    public static void getPal( ArrayList<ArrayList<String>> ans,ArrayList<String> ds,int idx,String s){
        if(idx==s.length()){
            ans.add(new ArrayList<>(ds));
        return;
        }
        for(int i=idx;i<s.length();i++){
            if(pali(s,idx,i)){
                ds.add(s.substring(idx,i+1));
                getPal(ans,ds,i+1,s);
                ds.remove(ds.size()-1);
            }

        }
    }
    static ArrayList<ArrayList<String>> allPalindromicPerms(String s) {
        // code here
         ArrayList<ArrayList<String>> ans=new ArrayList<>();
        ArrayList<String> ds=new ArrayList<>();
getPal(ans,ds,0,s);
return ans;
    }
};