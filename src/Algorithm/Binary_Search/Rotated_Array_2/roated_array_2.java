package Algorithm.Binary_Search.Rotated_Array_2;

public class roated_array_2 {
    public static boolean search(int[] nums, int target) {
        int pivot = findpivot(nums);
        // if you didnot find a pivot means array is not rotated
        if(pivot == -1){
            // just do normal binary search
            return binarysearch(nums, target, 0, nums.length - 1);
        }
        // if pivot is found, you have 2 asc sorted arrays
        if(nums[pivot] == target){
            return true;
        }
        if(target < nums[0]){
            return binarysearch(nums, target, pivot + 1, nums.length - 1);
        }
        else{
            return binarysearch(nums, target, 0, pivot - 1);
        }
    }
    static boolean  binarysearch(int[] nums, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target < nums[mid]){
                end = mid - 1;
            }
            else if(target > nums[mid]){
                start = mid + 1;
            }
            else{
                return true;
            }
        }
        return false;
    }
   static int findpivot(int [] nums){
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            // 4 cases over here
            if(mid < end && nums[mid] > nums[mid + 1]){
                return mid;
            }
            if(mid > start && nums[mid] < nums[mid - 1]){
                return mid - 1;
            }
            //if elements at start, end and mid are equal then skip the duplicates
            if(nums[mid] == nums[start] && nums[mid] == nums[end]){
                // skip the duplicates
                // what if the start and end elements are pivots
                if(start + 1 < nums.length-1 && nums[start] > nums[start + 1]){
                    return start;
                }
                if(end - 1 >= 0 && nums[end] < nums[end - 1]){
                    return end - 1;
                }
                start++;
                end--;
            }

            else if(nums[start] < nums[mid] || nums[start] == nums[mid] && nums[mid] > nums[end]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]= {2,5,6,0,0,1,2};
        boolean ans=search(arr,0);
        System.out.println(ans);
    }
}
