package DSA.Stacks.Reverse_each_word_in_a_given_string;

import java.util.Stack;

public class reverse_each_word_in_a_given_string {
    static String reverseWords(String str)
    {
        Stack<Character> stk=new Stack<>();
        String ans="";
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)=='.'){
                while (stk.isEmpty()==false){
                    ans=ans+stk.pop();
                }
                ans=ans+'.';
            }
            else {
                stk.push(str.charAt(i));
            }
        }
      while (stk.isEmpty()==false){
          ans=ans+stk.pop();
      }
     return ans;   // your code here
    }
    public static void main(String[] args) {
        String S = "i.like.this.program.very.much";
        System.out.println(reverseWords(S));
    }
}
