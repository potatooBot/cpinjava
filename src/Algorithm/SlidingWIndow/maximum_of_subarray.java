package Algorithm.SlidingWIndow;
import java.util.*;
public class maximum_of_subarray {
    public static int[] maxSlidingWindow(int[] arr, int k) {
        int n= arr.length;
        int ans[]=new int[n-k+1];
        Deque <Integer> dq=new ArrayDeque<>();
int idx=0;
        for (int i = 0; i <n ; i++) {
            //check for out of range
            if(!dq.isEmpty()&& dq.peek()==i-k) {
                dq.poll();
            }

            //Remove everythin that is less than present element
            while (!dq.isEmpty()&&arr[dq.peekLast()]<=arr[i]){
                dq.pollLast();
            }

            dq.offer(i);

            if(i>=k-1){
                ans[idx++]=arr[dq.peek()];
            }
        }
return ans;

    }
    public static void main(String[] args) {
        int nums[] = {9,10,9,-7,-4,-8,2,-6}, k = 5;
//        int nums[] = {-7,-8,7,5,7,1,6,0}, k = 4;
        int ans[]=maxSlidingWindow(nums,k);
        for (int i = 0; i < ans.length ; i++) {
            System.out.println(ans[i]);
        }
    }
}
