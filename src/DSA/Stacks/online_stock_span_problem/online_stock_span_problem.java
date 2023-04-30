package DSA.Stacks.online_stock_span_problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import java.util.stream.Collectors;

public class online_stock_span_problem {
    public static int[] calculateSpan(int price[], int n)
    {
     int ans[]=new int[n];
        Stack<Integer> stk=new Stack<>();

        for (int i = 0; i <n ; i++) {
            int count=1;
            ArrayList<Integer> ds=new ArrayList<>();
            while (stk.isEmpty()==false&&stk.peek()<=price[i]){
                int val=stk.pop();
                ds.add(val);
               count++;
            }
if(ds.isEmpty()==false){
    for (int j = 0; j <ds.size() ; j++) {
        stk.push((int)ds.get(j));
    }
}

            ans[i]=count;
      stk.push(price[i]);
        }
     return ans;

        // Your code here
    }
    public static void main(String[] args) {
//        int N = 7;int price[] = {100, 80, 60, 70, 60, 75, 85,};
        int N = 6;int price[] = {10 ,4 ,5 ,90 ,120 ,80};
int ans[]=calculateSpan(price,N);
        System.out.println(Arrays.stream(ans).boxed().collect(Collectors.toList()));
    }
}
