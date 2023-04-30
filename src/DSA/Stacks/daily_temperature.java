package DSA.Stacks;

import java.util.Arrays;
import java.util.Stack;
import java.util.stream.Collectors;

public class daily_temperature {
    static     public int[] dailyTemperatures(int[] temperatures) {

        int ans[]=new int[temperatures.length];
        Stack<Integer> stk=new Stack<>();
        int n= temperatures.length;
        int top=-1;
        for (int i = n-1; i >=0 ; i--) {
            while (stk.isEmpty()==false&&temperatures[stk.peek()]<=temperatures[i]){
                stk.pop();
            }
            if (stk.isEmpty()==true) {
                ans[i]=0;
            }
            if(stk.isEmpty()==false&&temperatures[stk.peek()]>temperatures[i]) {
                ans[i]=stk.peek()-i;
            }
stk.push(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] temperatures = {89,62,70,58,47,47,46,76,100,70};
        int ans[]=dailyTemperatures(temperatures);
        System.out.println(Arrays.stream(ans).boxed().collect(Collectors.toList()));

    }
}
