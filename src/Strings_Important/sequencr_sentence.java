package Strings_Important;

import java.util.Stack;

public class sequencr_sentence {
    public static boolean isCircularSentence(String sentence) {



        if(sentence.charAt(0)!=sentence.charAt(sentence.length()-1)) return false;
        for (int i = 0; i <sentence.length() ; i++) {


                System.out.println(sentence.charAt(i-1));
                System.out.println(sentence.charAt(i+1));

                if(sentence.charAt(i)==' '&&sentence.charAt(i-1)!=sentence.charAt(i+1)){
                    return false;
                }

        }


        return true;
    }
    public static void main(String[] args) {
       String sentence = "leetcode";
       boolean check=isCircularSentence(sentence);
        System.out.println(check);
    }
}
