package DSA.Stacks;

import java.util.Stack;

public class validParenthesis {
    static    public boolean isValid(String s) {
        Stack<Character> stk=new Stack<>();
        for (int i = 0; i <s.length() ; i++) {
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
                stk.add(s.charAt(i));
            }
            else if (s.charAt(i)==')'){
                if ( !stk.isEmpty()&&stk.peek() == '(') stk.pop();
                else return false;
            }

            else if (s.charAt(i)==']'){
                if ( !stk.isEmpty()&&stk.peek() == '[') stk.pop();
                else return false;
            } else if (s.charAt(i)=='}') {
                if ( !stk.isEmpty()&&stk.peek() == '{') stk.pop();
                else return false;
                }
            }
        if(stk.isEmpty()==false) return false;
        return true;
    }
    public static void main(String[] args) {
        String s = "[]";
boolean ans=isValid(s);
        System.out.println(ans);
    }
}
