package Strings_Important;

import java.util.Stack;

public class remove_stars_froms_string {
    static     public String removeStars(String s) {
        Stack<Character> stk=new Stack<>();
        for (int i = 0; i <s.length() ; i++) {
            if(s.charAt(i)!='*') stk.push(s.charAt(i));
            else if(!stk.isEmpty()&&s.charAt(i)=='*'){
                stk.pop();
            }
        }

      //  System.out.println(stk);
        String ans="";
        while (!stk.isEmpty()){
            ans=stk.pop()+ans;
        }



        return ans;
    }
    public static void main(String[] args) {
        String s = "leet**cod*e";

String ans=removeStars(s);
        System.out.println(ans);
    }
}
