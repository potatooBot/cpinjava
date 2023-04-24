package Stacks;

import java.util.Arrays;
import java.util.Stack;
import java.util.stream.Collectors;

public class next_samller_element {
      public static int[] Smallestonleft (int arr[], int n) {
    int ans[]=new int[n];
          Stack<Integer> stk=new Stack<>();
          for (int i = 0; i < arr.length; i++) {
              while (stk.isEmpty()==false&&stk.peek()>=arr[i]){
                  stk.pop();
              }
              if(stk.isEmpty()==false&&stk.peek()<arr[i]){
                  ans[i]=stk.peek();
              }
              else {
                  ans[i]=-1;
              }
              stk.push((int)arr[i]);
          }

        // Complete the function
    return ans;
      }
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5, 1};
        int ans[]=Smallestonleft(arr, arr.length);
        System.out.println(Arrays.stream(ans).boxed().collect(Collectors.toList()));
    }
}
