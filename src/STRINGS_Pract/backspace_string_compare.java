package STRINGS_Pract;

import java.util.Stack;

public class backspace_string_compare {
    static public boolean backspaceCompare(String s, String t) {

        Stack<Character> stk1=new Stack<>();
        Stack<Character> stk2=new Stack<>();

        for (int i = 0; i <s.length() ; i++) {
            if(s.charAt(i)!='#') stk1.push(s.charAt(i));
            else if(stk1.isEmpty()==false&&s.charAt(i)=='#'){
                stk1.pop();
            }
        }
        for (int i = 0; i <t.length() ; i++) {
            if(t.charAt(i)!='#') stk2.push(t.charAt(i));
            else if(stk2.isEmpty()==false&&t.charAt(i)=='#'){
                stk2.pop();
            }
        }
        if(stk1.equals(stk2)) return true;
        return false;
    }

    public static void main(String[] args) {
        String s = "a#c", t = "b";
        boolean ans=backspaceCompare(s,t);
        System.out.println(ans);
    }
}
