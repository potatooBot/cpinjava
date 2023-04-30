package DSA.Stacks.NGR;

import java.util.Arrays;
import java.util.Stack;
import java.util.stream.Collectors;

public class next_greater_element_right {
    public static int[] nextGreaterElement(int[] nums1, int n) {
int ans[]=new int[n];
Stack<Integer> stk=new Stack<>();
        for (int i = n-1; i >=0 ; i--) {
while (stk.isEmpty()==false&&stk.peek()<=nums1[i]){
    stk.pop();

}

if(stk.isEmpty()==false&&stk.peek()>nums1[i])
{
    ans[i]=stk.peek();
}
else {
    ans[i]=-1;
}
stk.push((int)nums1[i]);
        }
return ans;
    }
    public static void main(String[] args) {
        int nums1 []= {1 ,3 ,2 ,4};
int n=4;
int ans[]=nextGreaterElement(nums1,n);
        System.out.println(Arrays.stream(ans).boxed().collect(Collectors.toList()));
    }
}
