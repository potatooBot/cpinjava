//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    System.out.println(new Solution().evaluatePostFix(br.readLine().trim()));
		}
	}
}
// } Driver Code Ends


class Solution
{
    //Function to evaluate a postfix expression.
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
}