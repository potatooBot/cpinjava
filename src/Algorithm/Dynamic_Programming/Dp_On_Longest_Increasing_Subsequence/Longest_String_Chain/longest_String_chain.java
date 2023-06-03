package Algorithm.Dynamic_Programming.Dp_On_Longest_Increasing_Subsequence.Longest_String_Chain;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class longest_String_chain {
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
    static   public int longestStrChain(String[] words) {
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
    public static void main(String[] args) {
        String [] words = {"xbc","pcxbcf","xb","cxbc","pcxbc"};

        int ans=longestStrChain(words);
        System.out.println(ans);
    }
}
