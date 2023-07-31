//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {

    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            System.out.println(
                new Solution().infixToPostfix(br.readLine().trim()));
        }
    }
}
// } Driver Code Ends


class Solution {
        public static int prece(char ch){
        if(ch=='^'){
            return 3;
        }
        if(ch=='*'||ch=='/'){
            return 2;
        }
        if(ch=='+'||ch=='-'){
            return 1;
        }
        else {
            return -1;
        }
    }
    // Function to convert an infix expression to a postfix expression.
    public static String infixToPostfix(String exp) {
        String ans="";
    int n=exp.length();
        Stack<Character> stk=new Stack<>();
        for (int i = 0; i <n ; i++) {
         if((exp.charAt(i)>='a'&&exp.charAt(i)<='z')||(exp.charAt(i)=='A'&&exp.charAt(i)<='Z')||(exp.charAt(i)>='0'&&exp.charAt(i)<='9')){
             ans=ans+exp.charAt(i);
         }
         else if (exp.charAt(i)=='(') {
             stk.push(exp.charAt(i));
         }
         else if(exp.charAt(i)==')'){
             while (!stk.empty()&&stk.peek()!='('){
                 ans=ans+stk.peek();
                 stk.pop();
             }
             if(!stk.isEmpty()){
                 stk.pop();
             }

         }
         else {
             while (!stk.empty()&&prece(stk.peek())>=prece(exp.charAt(i))){
                 ans=ans+stk.peek();
                 stk.pop();
             }
             stk.push(exp.charAt(i));
         }
        }
        while (!stk.isEmpty()){
            ans=ans+stk.peek();
            stk.pop();
        }
        // Your code here
        return ans;
    }
}