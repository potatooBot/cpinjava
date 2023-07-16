class Solution {
    public int[] finalPrices(int[] prices) {
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
}