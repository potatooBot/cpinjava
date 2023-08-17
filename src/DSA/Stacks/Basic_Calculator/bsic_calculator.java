package DSA.Stacks.Basic_Calculator;
import java.util.*;
public class bsic_calculator {
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
    public static String infixToPostfix(String exp) {
        String ans="";
        int n=exp.length();
        Stack<Character> stk=new Stack<>();
        for (int i = 0; i <n ; i++) {
            if(exp.charAt(i)==' ') continue;
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
    public static int mult(int a,int b){
        return a*b;
    }

    public static int div(int a,int b){
        return a/b;
    }
    public static int add(int a,int b){
        return a+b;
    }
    public static int sub(int a,int b){
        return a-b;
    }
    static  public int evaluatePostFix(String exp)
    {

        Stack<Integer> stk=new Stack<>();

        for (int i = 0; i <exp.length() ; i++) {

            if(exp.charAt(i)>='0'&&exp.charAt(i)<='9')
            {
                stk.push(exp.charAt(i)-'0');
            }
            else {

                int b=stk.peek();
                stk.pop();

                int a=stk.peek();
                stk.pop();
                if(exp.charAt(i)=='*'){
                    stk.push(mult(a,b));
                }
                else if(exp.charAt(i)=='/'){
                    stk.push(div(a,b));
                }
                else if(exp.charAt(i)=='+'){
                    stk.push(add(a,b));
                }
                else if(!stk.isEmpty()&&exp.charAt(i)=='-'&&stk.peek()=='-'){
                    stk.push(add(a,b));
                }
                else if(exp.charAt(i)=='-'){
                    stk.push(sub(a,b));
                }
            }
        }
ArrayList<Integer> ds=new ArrayList<>();

        for(int ele :stk){
ds.add(ele);
        }
        System.out.println(ds);

        int ans=0;
        for (int ele:
             ds) {
            ans= ans*10 +ele;
        }
        return ans;
    }
    public static int calculate(String s) {
        String postfix=infixToPostfix(s);
        System.out.println(postfix);
        int ans=evaluatePostFix(postfix);

        return ans;

    }
    public static void main(String[] args) {
        String str="1-(     -2)";
        int ans=calculate(str);
        System.out.println(ans);
    }
}
