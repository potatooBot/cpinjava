package Algorithm.Recursion;

import java.util.ArrayList;
import java.util.List;

public class palindrome_aprtitioning {
    public static List<List<String>> partition(String s) {
List <List<String>> ans=new ArrayList<>();
List <String> ds=new ArrayList<>();
palindromeHelper(0,s,ans,ds);
return ans;
    }
    public static void palindromeHelper(int idx,String s,List<List<String>> ans,List<String> ds){
        if(idx==s.length()){
            ans.add(new ArrayList<>(ds));
            return;
        }

        for (int i = idx; i <s.length() ; ++i) {
            if(isPalindrome(s,idx,i)==true){
                ds.add(s.substring(idx,i+1));
                palindromeHelper(i+1,s,ans,ds);
                ds.remove(ds.size()-1);
            }
        }
    }
    public static boolean isPalindrome(String s,int start,int end){
        while (start<=end){
            if(s.charAt(start++)!=s.charAt(end--))
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str="aabb";
        List <List<String>> ans=new ArrayList<>();
        ans=partition(str);
        System.out.println(ans);
    }
}
