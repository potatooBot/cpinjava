package Algorithm.Binary_Search;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class single_element_in_sorted_array {
    public static int singleNonDuplicate(int[] nums) {
       int low=0;
       int high= nums.length-2;

       while (low<=high) {
           int mid = (low + high) / 2;
           if (mid % 2 == 0) {
               if (nums[mid] != nums[mid + 1]) {
                   high = mid - 1;
               } else low = mid + 1;
           }
           else {
               if (nums[mid] == nums[mid + 1]) {
                   high = mid - 1;
               } else low = mid + 1;
           }
       }
        return nums[low];
    }
    public static void main(String[] args) {
        int nums[] = {1,1,2,3,3,4,4,8,8};
        int ans=singleNonDuplicate(nums);
        System.out.println(ans);
    }
}
