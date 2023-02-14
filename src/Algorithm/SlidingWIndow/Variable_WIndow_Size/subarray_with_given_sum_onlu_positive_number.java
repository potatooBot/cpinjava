package Algorithm.SlidingWIndow.Variable_WIndow_Size;

import java.util.ArrayList;
import java.util.Arrays;

public class subarray_with_given_sum_onlu_positive_number {
    static ArrayList<Integer> subarraySum(int[] nums, int n, int k) {
        // Your code here
        int start = 0;
        int sum = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        for (int end = 0; end < nums.length; end++) {
            sum = sum + nums[end];
            while (sum > k) {
                sum = sum - nums[start];
                start++;
            }

            if (sum == k) {
                ans.add(start + 1);
                ans.add(end + 1);
                break;
            }
        }
        return ans;
    }
            public static void main(String[] args) {
       int N = 5, S = 12;
        int A[] = {1,2,3,7,5};
                ArrayList ans=subarraySum(A,A.length,S);
                System.out.println(ans);
    }
}
