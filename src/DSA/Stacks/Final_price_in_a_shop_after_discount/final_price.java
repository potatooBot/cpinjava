package DSA.Stacks.Final_price_in_a_shop_after_discount;

import java.util.Arrays;
import java.util.Stack;
import java.util.stream.Collectors;

public class final_price {
    static   public int[] finalPrices(int[] prices) {
int ans[]=new int[prices.length];
        Stack<Integer> stk=new Stack<>();


        int n= prices.length;;
        for (int i = n-1; i >=0 ; i--) {

            while (stk.isEmpty() == false && stk.peek() > prices[i]) {
                stk.pop();
            }


            if (i < n) {
                if (stk.empty() == false) {
                    ans[i] = prices[i] - stk.peek();
                } else {
                    ans[i] = prices[i];
                }

            }
            stk.push(prices[i]);
        }
return ans;

    }
    public static void main(String[] args) {
        int prices []= {1,2,3,4,5};
int ans[]=finalPrices(prices);
        System.out.println(Arrays.stream(ans).boxed().collect(Collectors.toList()));
    }
}
