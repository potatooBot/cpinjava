package STRINGS_Pract;

import java.util.Collections;

public class reverse_word_in_given_string {
    static void reverseWords(String str)
    {
        // code here
String ans="";
//String temp="";
StringBuilder temp=new StringBuilder();

        for (int i =str.length()-1 ; i >=0 ; i--) {
            if(str.charAt(i)=='.'){

                 temp.reverse();
                   ans=ans+temp;
ans=ans+".";
                   temp.setLength(0);
            }
            else {
temp.append(str.charAt(i));
            }
        }

        temp.reverse();
ans=ans+temp;
ans.replaceAll("  "," ");
        System.out.println(ans);

    }
    public static void main(String[] args) {
        String str= "i.like.this.program.very.much";
        reverseWords(str);
    }
}
