package Algorithm.Dynamic_Programming.Dp_LCS.Word_Break;
import java.util.*;
public class word_break_memo {
    static  public boolean wordBreak(String s, List<String> wordDict) {

        boolean dp[]=new boolean[s.length()+1];
        HashSet<String> set=new HashSet<>(wordDict);
        return getWordUtil(s,set,0,new boolean[s.length()]);
    }
    public static boolean getWordUtil(String s,HashSet<String> set,int start,boolean dp[]){
        if(start==s.length()){
            return true;
        }
        if(dp[start] !=false)
        {
            return dp[start];
        }

        for (int end = start+1; end <=s.length() ; end++) {
            if(set.contains(s.substring(start,end))&&getWordUtil(s,set,end,dp)){
                return dp[start]= true;
            }
        }
        return dp[start]=false;
    }
    public static void main(String[] args) {
        String s = "leetcode";List<String> wordDict= new ArrayList<>();
        wordDict.add("leet");
        wordDict.add("code");
        boolean ans=wordBreak(s,wordDict);
        System.out.println(ans);
    }
}
