package DSA.Stacks;

import java.util.Stack;

public class valid_parenthesis {
    public static boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        char pop;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stk.push(s.charAt(i));
            } else if (s.charAt(i) == ')' ) {
if(!stk.isEmpty()&&stk.peek()=='('){
    stk.pop();
}
else {
    return false;
}
            }
            else if (s.charAt(i) == '}' ) {

if(!stk.isEmpty()&&stk.peek()=='{'){
    stk.pop();
}
else {
return false;
}
            }
else if (s.charAt(i) == ']') {

if(!stk.isEmpty()&&stk.peek()=='['){
    stk.pop();
}
else return false;
            }
        }
       if(!stk.isEmpty()){
           return false;
       }
       else return true;
    }
    public static void main(String[] args) {
        String s = "]";
        boolean check=isValid(s);
        System.out.println(check);



    }
}
