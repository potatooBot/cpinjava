package STRINGS_Pract;

public class merge_string_alternatively {
    static   public String mergeAlternately(String word1, String word2) {
String ans="";
int i=0;
        int maxLen=Math.max(word1.length(),word2.length());
        if(word1.length()>word2.length()) {
            for (i = 0; i < word2.length(); i++) {
                ans = ans + word1.charAt(i);
                ans = ans + word2.charAt(i);
            }
            for (int j = i; j <word1.length() ; j++) {
                ans=ans+word1.charAt(j);
            }
        }
        else if(word1.length()<word2.length()){
            for ( i = 0; i < word1.length(); i++) {
                ans = ans + word1.charAt(i);
                ans = ans + word2.charAt(i);
            }
            for (int j = i; j <word2.length() ; j++) {
                ans=ans+word2.charAt(j);
            }
        }
        else {
            for ( i = 0; i < word1.length(); i++) {
                ans = ans + word1.charAt(i);
                ans = ans + word2.charAt(i);
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        String word1 = "ab", word2 = "pqrs";
        String ans=mergeAlternately(word1,word2);
        System.out.println(ans);
    }
}
