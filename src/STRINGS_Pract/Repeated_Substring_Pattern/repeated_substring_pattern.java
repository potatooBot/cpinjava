package STRINGS_Pract.Repeated_Substring_Pattern;

import java.util.Arrays;

public class repeated_substring_pattern {


    static  public boolean repeatedSubstringPattern(String s) {


        final String ss = s + s;
        return ss.substring(1, ss.length() - 1).contains(s);
    }

    public static void main(String[] args) {
     String s = "ababab";
boolean ans=repeatedSubstringPattern(s);
        System.out.println(ans);

    }
}
