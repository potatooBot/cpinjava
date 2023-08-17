package DSA.Stacks.Infix_to_Postfix;

import java.util.Stack;

public class evaluation_of_postfix {
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
                else if(exp.charAt(i)=='-'){
                    stk.push(sub(a,b));
                }
            }
        }
return stk.peek();
    }
    public static void main(String[] args) {
        String str="123+*8-";
        int ans=evaluatePostFix(str);
        System.out.println(ans);

    }
}
