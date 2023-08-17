package Algorithm.Dynamic_Programming.Dp_LCS.Word_Break;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class word_break_tabulation {
    static  public boolean wordBreak(String s, List<String> wordDict) {
HashSet<String> set=new HashSet<>(wordDict);
        boolean dp[]=new boolean[s.length()+1];
        dp[0]=true;
        for (int end = 1; end <=s.length() ; end++) {
            for (int start = 0; start <end ; start++) {
                if(dp[start]&& set.contains(s.substring(start,end))){
                    dp[end]=true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
    public static void main(String[] args) {
        String s = "leetcode";
        List<String> wordDict= new ArrayList<>();
        wordDict.add("leet");
        wordDict.add("code");
        boolean ans=wordBreak(s,wordDict);
        System.out.println(ans);
    }
}
