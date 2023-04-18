package Stacks;

import java.util.Stack;

public class validates_stack {
    static    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stk=new Stack<>();

int j=0;
        for (int i = 0; i < pushed.length ; i++) {
            while (!stk.isEmpty()&&stk.peek()==popped[j]){
                stk.pop();
                j++;
            }
                stk.push(pushed[i]);
        }
        while(!stk.isEmpty()&&stk.peek()==popped[j]) {
            stk.pop();
            j++;
        }
        if(stk.isEmpty()) return true;
        System.out.println(stk);
        return false;
    }
    public static void main(String[] args) {
        int []pushed = {1,2,3,4,5};int [] popped = {4,5,3,2,1};

        boolean ans=validateStackSequences(pushed,popped);
        System.out.println(ans);
    }
}
