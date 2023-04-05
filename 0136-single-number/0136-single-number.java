class Solution {
    public int singleNumber(int[] nums) {
          // Complete this function
         int low=0;
       int high= nums.length-2;
Arrays.sort(nums);
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
}