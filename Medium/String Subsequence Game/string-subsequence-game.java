//{ Driver Code Starts
// Initial template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            Solution ob = new Solution();
            TreeSet<String> ans = new TreeSet<String>();
            ans = ob.allPossibleSubsequences(S);
            Iterator it = ans.iterator();
            if (ans.size() == 0) {
                System.out.print(-1);
            } else
                while (it.hasNext()) {
                    System.out.print(it.next() + " ");
                }
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function template for Java

class Solution {
        public static void getSUbsequence(String s,int idx,TreeSet<String> tSet,List<Character> ds){

if(idx==s.length()) {
    if(idx>0&&ds.size()>1) {
        if ((ds.get(0) == 'a' || ds.get(0) == 'o' || ds.get(0) == 'e' || ds.get(0) == 'i' || ds.get(0) == 'u') && (ds.get(ds.size() - 1) != 'a' && ds.get(ds.size() - 1) != 'e' && ds.get(ds.size() - 1) != 'o' && ds.get(ds.size() - 1) != 'i' && ds.get(ds.size() - 1) != 'u')) {
            String ans = "";
            for (Character ch:
                 ds) {
                ans=ans+ch;
            }
            tSet.add(ans);
        }
    }
    return;
}
if(idx>0&&ds.size()>1) {
    if ((ds.get(0) == 'a' || ds.get(0) == 'o' || ds.get(0) == 'e' || ds.get(0) == 'i' || ds.get(0) == 'u') && (ds.get(ds.size() - 1) != 'a' && ds.get(ds.size() - 1) != 'e' && ds.get(ds.size() - 1) != 'o' && ds.get(ds.size() - 1) != 'i' && ds.get(ds.size() - 1) != 'u')) {
        String ans = "";
        for (Character ch:
                ds) {
            ans=ans+ch;
        }
        tSet.add(ans);
    }
}
        ds.add(s.charAt(idx));
        getSUbsequence(s,idx+1,tSet,ds);
        ds.remove(ds.size()-1);
        getSUbsequence(s,idx+1,tSet,ds);
    }
        static TreeSet<String> allPossibleSubsequences(String s) {
 TreeSet <String> tSet=new TreeSet<>();
 List<Character> ds=new ArrayList<>();
 getSUbsequence(s,0,tSet,ds);
 List<String> list=new ArrayList<>();
        for (String str:
             tSet) {
            list.add(str);
        }
 Collections.sort(list);
        
    return tSet;
    }
}