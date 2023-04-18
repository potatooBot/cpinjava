package Stacks;

import java.util.Stack;

public class valid_substring {
    static int findMaxLen(String str) {


        Stack<Character> stk=new Stack<>();
int count=0;
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)=='(') stk.push(str.charAt(i));

            else if (stk.isEmpty()==false &&str.charAt(i)==')') {

                count++;
                stk.pop();
            }
        }

        System.out.println(stk);
     return count*2;   // code here
    }
    public static void main(String[] args) {
//        String S = "(()(";
        String S = "))()(()";
    int ans=findMaxLen(S);
        System.out.println(ans);

    }
}
