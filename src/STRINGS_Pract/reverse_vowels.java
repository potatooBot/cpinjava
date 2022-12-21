package STRINGS_Pract;

import java.util.Stack;

public class reverse_vowels {
    public static void reverseVowels(String s) {
        Stack <Character> stk= new Stack<>();
        for (int i = 0; i <s.length() ; i++) {
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U') {
                stk.push(s.charAt(i));
            }
        }
        for (int i = 0; i <s.length() ; i++) {
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U') {
               s = s.substring(0, i) + stk.pop()
                       + s.substring(i + 1);
            }
        }

        System.out.println(s);
    }
    public static void main(String[] args) {
        String s = "aA";
      reverseVowels(s);
//        System.out.println(res);
    }
}
