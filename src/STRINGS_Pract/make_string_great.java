//Given a string s of lower and upper case English letters.
//
//        A good string is a string which doesn't have two adjacent characters s[i] and s[i + 1] where:
//
//        0 <= i <= s.length - 2
//        s[i] is a lower-case letter and s[i + 1] is the same letter but in upper-case or vice-versa.
//        To make the string good, you can choose two adjacent characters that make the string bad and remove them. You can keep doing this until the string becomes good.
//
//        Return the string after making it good. The answer is guaranteed to be unique under the given constraints.
//
//        Notice that an empty string is also good.


//Intuition
//        Approach
//        Traverse char of string one by one and maintain a ans stack. For every element check if top of stack is lower case or upper case of current element, If yes, then pop it from the stack else pust current element to the stack itself. After traversing all characters we are left with out ans in the stack.
//
//        Complexity
//        Time complexity: O(n)
//        Space complexity: O(n)

package STRINGS_Pract;

import java.util.Stack;

public class make_string_great {
    public static void makeGood(String s) {
        int diff='a'-'A';
        Stack <Character> stk=new Stack<>();
        for (int i = 0; i <s.length(); i++) {
            if(stk.isEmpty()) stk.push(s.charAt(i));
            else {
                if (s.charAt(i) - stk.peek() == diff) {
                    stk.pop();
                }
                else stk.push(s.charAt(i));
            }
        }
        int size= stk.size();
        String str="";
        for (int i = 0; i <size ; i++) {
            str=stk.pop()+str;
        }
        System.out.println(str);
    }
    public static void main(String[] args) {
        String s = "leEeetcode";
        makeGood(s);
    }
}
